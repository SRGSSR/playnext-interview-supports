/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ch.srg.sam.generated.model


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * Values: HLS,HLS_DVR,HDS,HDS_DVR,RTMP,HTTP,HTTPS,HTTP_M_3_U,HTTP_MP_3_STREAM,DASH,DASH_DVR
 */

enum class ProtocolDto(val value: kotlin.String) {

    @JsonProperty(value = "HLS")
    HLS("HLS"),

    @JsonProperty(value = "HLS-DVR")
    HLS_DVR("HLS-DVR"),

    @JsonProperty(value = "HDS")
    HDS("HDS"),

    @JsonProperty(value = "HDS-DVR")
    HDS_DVR("HDS-DVR"),

    @JsonProperty(value = "RTMP")
    RTMP("RTMP"),

    @JsonProperty(value = "HTTP")
    HTTP("HTTP"),

    @JsonProperty(value = "HTTPS")
    HTTPS("HTTPS"),

    @JsonProperty(value = "HTTP-M3U")
    HTTP_M_3_U("HTTP-M3U"),

    @JsonProperty(value = "HTTP-MP3-STREAM")
    HTTP_MP_3_STREAM("HTTP-MP3-STREAM"),

    @JsonProperty(value = "DASH")
    DASH("DASH"),

    @JsonProperty(value = "DASH-DVR")
    DASH_DVR("DASH-DVR");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ProtocolDto) "$data" else null

        /**
         * Returns a valid [ProtocolDto] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ProtocolDto? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

