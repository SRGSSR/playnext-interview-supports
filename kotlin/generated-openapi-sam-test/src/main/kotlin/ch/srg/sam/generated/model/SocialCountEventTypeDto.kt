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
 * Types of social count events. Does not include SRG_DISLIKE because it is not used.
 *
 * Values: SRG_VIEW,FB_SHARE,GOOGLE_SHARE,TWITTER_SHARE,SRG_LIKE,SEARCH_CLICKED,WHATS_APP_SHARE
 */

enum class SocialCountEventTypeDto(val value: kotlin.String) {

    @JsonProperty(value = "srgView")
    SRG_VIEW("srgView"),

    @JsonProperty(value = "fbShare")
    FB_SHARE("fbShare"),

    @JsonProperty(value = "googleShare")
    GOOGLE_SHARE("googleShare"),

    @JsonProperty(value = "twitterShare")
    TWITTER_SHARE("twitterShare"),

    @JsonProperty(value = "srgLike")
    SRG_LIKE("srgLike"),

    @JsonProperty(value = "searchClicked")
    SEARCH_CLICKED("searchClicked"),

    @JsonProperty(value = "whatsAppShare")
    WHATS_APP_SHARE("whatsAppShare");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is SocialCountEventTypeDto) "$data" else null

        /**
         * Returns a valid [SocialCountEventTypeDto] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): SocialCountEventTypeDto? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

