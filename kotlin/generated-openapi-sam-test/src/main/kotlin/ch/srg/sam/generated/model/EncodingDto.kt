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
 * Values: H264,VP6F,MPEG2,WMV3,AAC,AAC_HE,MP3,MP2,WMAV2
 */

enum class EncodingDto(val value: kotlin.String) {

    @JsonProperty(value = "H264")
    H264("H264"),

    @JsonProperty(value = "VP6F")
    VP6F("VP6F"),

    @JsonProperty(value = "MPEG2")
    MPEG2("MPEG2"),

    @JsonProperty(value = "WMV3")
    WMV3("WMV3"),

    @JsonProperty(value = "AAC")
    AAC("AAC"),

    @JsonProperty(value = "AAC-HE")
    AAC_HE("AAC-HE"),

    @JsonProperty(value = "MP3")
    MP3("MP3"),

    @JsonProperty(value = "MP2")
    MP2("MP2"),

    @JsonProperty(value = "WMAV2")
    WMAV2("WMAV2");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is EncodingDto) "$data" else null

        /**
         * Returns a valid [EncodingDto] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): EncodingDto? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

