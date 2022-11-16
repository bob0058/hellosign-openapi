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
    /// ReportCreateResponse
    /// </summary>
    [DataContract(Name = "ReportCreateResponse")]
    [JsonObject(ItemNullValueHandling = NullValueHandling.Ignore)]
    public partial class ReportCreateResponse : IOpenApiTyped, IEquatable<ReportCreateResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportCreateResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ReportCreateResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReportCreateResponse" /> class.
        /// </summary>
        /// <param name="report">report.</param>
        /// <param name="warnings">A list of warnings..</param>
        public ReportCreateResponse(ReportResponse report = default(ReportResponse), List<WarningResponse> warnings = default(List<WarningResponse>))
        {
            
            this.Report = report;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Report
        /// </summary>
        [DataMember(Name = "report", EmitDefaultValue = true)]
        public ReportResponse Report { get; set; }

        /// <summary>
        /// A list of warnings.
        /// </summary>
        /// <value>A list of warnings.</value>
        [DataMember(Name = "warnings", EmitDefaultValue = true)]
        public List<WarningResponse> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReportCreateResponse {\n");
            sb.Append("  Report: ").Append(Report).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
            return this.Equals(input as ReportCreateResponse);
        }

        /// <summary>
        /// Returns true if ReportCreateResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of ReportCreateResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReportCreateResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Report == input.Report ||
                    (this.Report != null &&
                    this.Report.Equals(input.Report))
                ) && 
                (
                    this.Warnings == input.Warnings ||
                    this.Warnings != null &&
                    input.Warnings != null &&
                    this.Warnings.SequenceEqual(input.Warnings)
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
                if (this.Report != null)
                {
                    hashCode = (hashCode * 59) + this.Report.GetHashCode();
                }
                if (this.Warnings != null)
                {
                    hashCode = (hashCode * 59) + this.Warnings.GetHashCode();
                }
                return hashCode;
            }
        }

        public List<OpenApiType> GetOpenApiTypes()
        {
            var types = new List<OpenApiType>();
            types.Add(new OpenApiType(){
                Name = "report",
                Property = "Report",
                Type = "ReportResponse",
                Value = Report,
            });
            types.Add(new OpenApiType(){
                Name = "warnings",
                Property = "Warnings",
                Type = "List<WarningResponse>",
                Value = Warnings,
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
