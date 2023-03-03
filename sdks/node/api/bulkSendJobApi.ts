/**
 * The MIT License (MIT)
 *
 * Copyright (C) 2023 dropbox.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import axios, { AxiosError, AxiosRequestConfig } from "axios";

/* tslint:disable:no-unused-locals */
import { BulkSendJobGetResponse } from "../model/bulkSendJobGetResponse";
import { BulkSendJobListResponse } from "../model/bulkSendJobListResponse";
import { ErrorResponse } from "../model/errorResponse";

import {
  ObjectSerializer,
  Authentication,
  VoidAuth,
  Interceptor,
} from "../model/models";
import {
  HttpBasicAuth,
  HttpBearerAuth,
  ApiKeyAuth,
  OAuth,
} from "../model/models";

import {
  HttpError,
  optionsI,
  returnTypeT,
  returnTypeI,
  generateFormData,
  toFormData,
  queryParamsSerializer,
  USER_AGENT,
} from "./apis";

let defaultBasePath = "https://api.hellosign.com/v3";

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum BulkSendJobApiApiKeys {}

export class BulkSendJobApi {
  protected _basePath = defaultBasePath;
  protected _defaultHeaders: any = {
    "User-Agent": USER_AGENT,
  };
  protected _useQuerystring: boolean = false;

  protected authentications = {
    default: <Authentication>new VoidAuth(),
    api_key: new HttpBasicAuth(),
    oauth2: new HttpBearerAuth(),
  };

  protected interceptors: Interceptor[] = [];

  constructor(basePath?: string) {
    if (basePath) {
      this.basePath = basePath;
    }
  }

  set useQuerystring(value: boolean) {
    this._useQuerystring = value;
  }

  set basePath(basePath: string) {
    this._basePath = basePath;
  }

  set defaultHeaders(defaultHeaders: any) {
    this._defaultHeaders = defaultHeaders;
  }

  get defaultHeaders() {
    return this._defaultHeaders;
  }

  get basePath() {
    return this._basePath;
  }

  public setDefaultAuthentication(auth: Authentication) {
    this.authentications.default = auth;
  }

  public setApiKey(key: string) {
    this.authentications.api_key.username = key;
  }

  set username(username: string) {
    this.authentications.api_key.username = username;
  }

  set password(password: string) {
    this.authentications.api_key.password = password;
  }

  set accessToken(accessToken: string | (() => string)) {
    this.authentications.oauth2.accessToken = accessToken;
  }

  public addInterceptor(interceptor: Interceptor) {
    this.interceptors.push(interceptor);
  }

  /**
   * Returns the status of the BulkSendJob and its SignatureRequests specified by the `bulk_send_job_id` parameter.
   * @summary Get Bulk Send Job
   * @param bulkSendJobId The id of the BulkSendJob to retrieve.
   * @param page Which page number of the BulkSendJob list to return. Defaults to &#x60;1&#x60;.
   * @param pageSize Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20.
   * @param options
   */
  public async bulkSendJobGet(
    bulkSendJobId: string,
    page?: number,
    pageSize?: number,
    options: optionsI = { headers: {} }
  ): Promise<returnTypeT<BulkSendJobGetResponse>> {
    const localVarPath =
      this.basePath +
      "/bulk_send_job/{bulk_send_job_id}".replace(
        "{" + "bulk_send_job_id" + "}",
        encodeURIComponent(String(bulkSendJobId))
      );
    let localVarQueryParameters: any = {};
    let localVarHeaderParams: any = (<any>Object).assign(
      {},
      this._defaultHeaders
    );
    const produces = ["application/json"];
    // give precedence to 'application/json'
    if (produces.indexOf("application/json") >= 0) {
      localVarHeaderParams["content-type"] = "application/json";
    } else {
      localVarHeaderParams["content-type"] = produces.join(",");
    }
    let localVarFormParams: any = {};
    let localVarBodyParams: any = undefined;

    // verify required parameter 'bulkSendJobId' is not null or undefined
    if (bulkSendJobId === null || bulkSendJobId === undefined) {
      throw new Error(
        "Required parameter bulkSendJobId was null or undefined when calling bulkSendJobGet."
      );
    }

    if (page !== undefined) {
      localVarQueryParameters["page"] = ObjectSerializer.serialize(
        page,
        "number"
      );
    }

    if (pageSize !== undefined) {
      localVarQueryParameters["page_size"] = ObjectSerializer.serialize(
        pageSize,
        "number"
      );
    }

    (<any>Object).assign(localVarHeaderParams, options.headers);

    let localVarUseFormData = false;

    let localVarRequestOptions: AxiosRequestConfig = {
      method: "GET",
      params: localVarQueryParameters,
      headers: localVarHeaderParams,
      url: localVarPath,
      paramsSerializer: this._useQuerystring
        ? queryParamsSerializer
        : undefined,
      responseType: "json",
    };

    let authenticationPromise = Promise.resolve();
    if (this.authentications.api_key.username) {
      authenticationPromise = authenticationPromise.then(() =>
        this.authentications.api_key.applyToRequest(localVarRequestOptions)
      );
    }
    if (this.authentications.oauth2.accessToken) {
      authenticationPromise = authenticationPromise.then(() =>
        this.authentications.oauth2.applyToRequest(localVarRequestOptions)
      );
    }
    authenticationPromise = authenticationPromise.then(() =>
      this.authentications.default.applyToRequest(localVarRequestOptions)
    );

    let interceptorPromise = authenticationPromise;
    for (const interceptor of this.interceptors) {
      interceptorPromise = interceptorPromise.then(() =>
        interceptor(localVarRequestOptions)
      );
    }

    return interceptorPromise.then(() => {
      return new Promise<returnTypeT<BulkSendJobGetResponse>>(
        (resolve, reject) => {
          axios.request(localVarRequestOptions).then(
            (response) => {
              let body = response.data;

              if (
                response.status &&
                response.status >= 200 &&
                response.status <= 299
              ) {
                body = ObjectSerializer.deserialize(
                  body,
                  "BulkSendJobGetResponse"
                );
                resolve({ response: response, body: body });
              } else {
                reject(new HttpError(response, body, response.status));
              }
            },
            (error: AxiosError) => {
              if (error.response == null) {
                reject(error);
                return;
              }

              const response = error.response;

              let body;

              if (response.status === 200) {
                body = ObjectSerializer.deserialize(
                  response.data,
                  "BulkSendJobGetResponse"
                );

                reject(new HttpError(response, body, response.status));
                return;
              }

              let rangeCodeLeft = Number("4XX"[0] + "00");
              let rangeCodeRight = Number("4XX"[0] + "99");
              if (
                response.status >= rangeCodeLeft &&
                response.status <= rangeCodeRight
              ) {
                body = ObjectSerializer.deserialize(
                  response.data,
                  "ErrorResponse"
                );

                reject(new HttpError(response, body, response.status));
                return;
              }
            }
          );
        }
      );
    });
  }
  /**
   * Returns a list of BulkSendJob that you can access.
   * @summary List Bulk Send Jobs
   * @param page Which page number of the BulkSendJob List to return. Defaults to &#x60;1&#x60;.
   * @param pageSize Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is 20.
   * @param options
   */
  public async bulkSendJobList(
    page?: number,
    pageSize?: number,
    options: optionsI = { headers: {} }
  ): Promise<returnTypeT<BulkSendJobListResponse>> {
    const localVarPath = this.basePath + "/bulk_send_job/list";
    let localVarQueryParameters: any = {};
    let localVarHeaderParams: any = (<any>Object).assign(
      {},
      this._defaultHeaders
    );
    const produces = ["application/json"];
    // give precedence to 'application/json'
    if (produces.indexOf("application/json") >= 0) {
      localVarHeaderParams["content-type"] = "application/json";
    } else {
      localVarHeaderParams["content-type"] = produces.join(",");
    }
    let localVarFormParams: any = {};
    let localVarBodyParams: any = undefined;

    if (page !== undefined) {
      localVarQueryParameters["page"] = ObjectSerializer.serialize(
        page,
        "number"
      );
    }

    if (pageSize !== undefined) {
      localVarQueryParameters["page_size"] = ObjectSerializer.serialize(
        pageSize,
        "number"
      );
    }

    (<any>Object).assign(localVarHeaderParams, options.headers);

    let localVarUseFormData = false;

    let localVarRequestOptions: AxiosRequestConfig = {
      method: "GET",
      params: localVarQueryParameters,
      headers: localVarHeaderParams,
      url: localVarPath,
      paramsSerializer: this._useQuerystring
        ? queryParamsSerializer
        : undefined,
      responseType: "json",
    };

    let authenticationPromise = Promise.resolve();
    if (this.authentications.api_key.username) {
      authenticationPromise = authenticationPromise.then(() =>
        this.authentications.api_key.applyToRequest(localVarRequestOptions)
      );
    }
    if (this.authentications.oauth2.accessToken) {
      authenticationPromise = authenticationPromise.then(() =>
        this.authentications.oauth2.applyToRequest(localVarRequestOptions)
      );
    }
    authenticationPromise = authenticationPromise.then(() =>
      this.authentications.default.applyToRequest(localVarRequestOptions)
    );

    let interceptorPromise = authenticationPromise;
    for (const interceptor of this.interceptors) {
      interceptorPromise = interceptorPromise.then(() =>
        interceptor(localVarRequestOptions)
      );
    }

    return interceptorPromise.then(() => {
      return new Promise<returnTypeT<BulkSendJobListResponse>>(
        (resolve, reject) => {
          axios.request(localVarRequestOptions).then(
            (response) => {
              let body = response.data;

              if (
                response.status &&
                response.status >= 200 &&
                response.status <= 299
              ) {
                body = ObjectSerializer.deserialize(
                  body,
                  "BulkSendJobListResponse"
                );
                resolve({ response: response, body: body });
              } else {
                reject(new HttpError(response, body, response.status));
              }
            },
            (error: AxiosError) => {
              if (error.response == null) {
                reject(error);
                return;
              }

              const response = error.response;

              let body;

              if (response.status === 200) {
                body = ObjectSerializer.deserialize(
                  response.data,
                  "BulkSendJobListResponse"
                );

                reject(new HttpError(response, body, response.status));
                return;
              }

              let rangeCodeLeft = Number("4XX"[0] + "00");
              let rangeCodeRight = Number("4XX"[0] + "99");
              if (
                response.status >= rangeCodeLeft &&
                response.status <= rangeCodeRight
              ) {
                body = ObjectSerializer.deserialize(
                  response.data,
                  "ErrorResponse"
                );

                reject(new HttpError(response, body, response.status));
                return;
              }
            }
          );
        }
      );
    });
  }
}
