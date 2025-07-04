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
 * Values: OneToOne,FourToFive,FourToThree,NineToSixteen,SixteenToNine
 */

enum class AspectRatioDto(val value: kotlin.String) {

    @JsonProperty(value = "1:1")
    OneToOne("1:1"),

    @JsonProperty(value = "4:5")
    FourToFive("4:5"),

    @JsonProperty(value = "4:3")
    FourToThree("4:3"),

    @JsonProperty(value = "9:16")
    NineToSixteen("9:16"),

    @JsonProperty(value = "16:9")
    SixteenToNine("16:9");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is AspectRatioDto) "$data" else null

        /**
         * Returns a valid [AspectRatioDto] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): AspectRatioDto? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

