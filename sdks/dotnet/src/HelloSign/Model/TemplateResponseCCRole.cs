/*
 * Dropbox Sign API
 *
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = HelloSign.Client.OpenAPIDateConverter;

namespace HelloSign.Model
{
    /// <summary>
    /// TemplateResponseCCRole
    /// </summary>
    [DataContract(Name = "TemplateResponseCCRole")]
    [JsonObject(ItemNullValueHandling = NullValueHandling.Ignore)]
    public partial class TemplateResponseCCRole : IOpenApiTyped, IEquatable<TemplateResponseCCRole>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateResponseCCRole" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TemplateResponseCCRole() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateResponseCCRole" /> class.
        /// </summary>
        /// <param name="name">The name of the Role..</param>
        public TemplateResponseCCRole(string name = default(string))
        {
            
            this.Name = name;
        }

        /// <summary>
        /// The name of the Role.
        /// </summary>
        /// <value>The name of the Role.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TemplateResponseCCRole {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TemplateResponseCCRole);
        }

        /// <summary>
        /// Returns true if TemplateResponseCCRole instances are equal
        /// </summary>
        /// <param name="input">Instance of TemplateResponseCCRole to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TemplateResponseCCRole input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                return hashCode;
            }
        }

        public List<OpenApiType> GetOpenApiTypes()
        {
            var types = new List<OpenApiType>();
            types.Add(new OpenApiType(){
                Name = "name",
                Property = "Name",
                Type = "string",
                Value = Name,
            });

            return types;
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
