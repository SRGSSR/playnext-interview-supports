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
 * SRG business units and external content providers in lower case, used in path parameters.
 *
 * Values: SRF,RTS,RSI,RTR,SWI,SSATR
 */

enum class VendorPathParameterDto(val value: kotlin.String) {

    @JsonProperty(value = "srf")
    SRF("srf"),

    @JsonProperty(value = "rts")
    RTS("rts"),

    @JsonProperty(value = "rsi")
    RSI("rsi"),

    @JsonProperty(value = "rtr")
    RTR("rtr"),

    @JsonProperty(value = "swi")
    SWI("swi"),

    @JsonProperty(value = "ssatr")
    SSATR("ssatr");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is VendorPathParameterDto) "$data" else null

        /**
         * Returns a valid [VendorPathParameterDto] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): VendorPathParameterDto? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

