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

import ch.srg.sam.generated.model.ShowDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param next URL to fetch next page
 * @param showList 
 */


data class ShowListDto (

    /* URL to fetch next page */
    @field:JsonProperty("next")
    val next: kotlin.String? = null,

    @field:JsonProperty("showList")
    val showList: kotlin.collections.List<ShowDto>? = null

)

