import { AttributeTypeMap, ObjectSerializer } from "../model";
import * as http from "http";
import { AxiosResponse } from "axios";
import formData from "form-data";
import Qs from "qs";

export class HttpError extends Error {
  constructor(
    public response: AxiosResponse,
    public body: any,
    public statusCode?: number
  ) {
    super("HTTP request failed");
    this.name = "HttpError";
  }
}

export interface optionsI {
  headers: { [name: string]: string };
}

export interface returnTypeT<T> {
  response: AxiosResponse;
  body: T;
}

export interface returnTypeI {
  response: AxiosResponse;
  body?: any;
}

export const queryParamsSerializer = (params) => {
  return Qs.stringify(params, { arrayFormat: "brackets" });
};

export { RequestFile } from "../model";

export const USER_AGENT = "OpenAPI-Generator/1.1.1/node";

/**
 * Generates an object containing form data.
 *
 * Data is converted to JSON and added to data.body
 *
 * @param obj
 * @param typemap
 */
export const generateFormData = (
  obj: any,
  typemap: AttributeTypeMap
): { localVarUseFormData: boolean; data: object } => {
  const data = {};
  let localVarUseFormData = false;

  if (typeof obj !== "object" || Array.isArray(obj) || obj === null) {
    return {
      localVarUseFormData,
      data,
    };
  }

  typemap.forEach((paramInfo) => {
    if (obj[paramInfo.name] === undefined) {
      return;
    }

    /**
     * Everything except binary (file) data can be serialized to JSON.
     * If file data we want to keep as-is.
     */
    if (paramInfo.type.indexOf("RequestFile") !== -1) {
      localVarUseFormData = true;

      /**
       * Some parameters can be arrays of files
       */
      if (Array.isArray(obj[paramInfo.name])) {
        obj[paramInfo.name].forEach((childObject, i) => {
          /**
           * We want to conform to form data key naming. For example we can't
           * actually send a true array of data in our request:
           * form[file][0] = ...
           * form[file][1] = ...
           *
           * We need to change the key name to match formdata:
           *
           * form["file[0]"] = ...
           * form["file[1]"] = ...
           */
          const key = `${paramInfo.baseName}[${i}]`;

          data[key] = childObject;
        });

        return;
      }

      /**
       * File is already a type of `RequestFile`
       * @see RequestFile
       */
      data[paramInfo.baseName] = obj[paramInfo.name];
      return;
    }

    // Convert boolean value into string when using FormData, to prevent "data should be a string, Buffer or Uint8Array" error
    if (paramInfo.type.indexOf("boolean") !== -1) {
      data[paramInfo.baseName] = JSON.stringify(obj[paramInfo.name]);
      return;
    }

    /**
     * Everything else that is not binary data (file uploads) can be
     * serialized to JSON and sent over. This helps reduce complexity
     * when trying to keep formdata key names and serializing each nested
     * object individually.
     */
    const serialized = ObjectSerializer.serialize(
      obj[paramInfo.name],
      paramInfo.type
    );

    data[paramInfo.baseName] = shouldJsonify(serialized)
      ? JSON.stringify(serialized)
      : serialized;
  });

  return {
    localVarUseFormData,
    data,
  };
};

export const toFormData = (obj: object): formData => {
  const form = new formData();

  Object.keys(obj).forEach((key) => {
    form.append(key, obj[key]);
  });

  return form;
};

const shouldJsonify = (val: any): boolean => val === Object(val);
