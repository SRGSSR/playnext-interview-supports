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
 * @param date 
 * @param count 
 */


data class SearchResultMediaListAggregationsDateDto (

    @field:JsonProperty("date")
    val date: java.time.LocalDate,

    @field:JsonProperty("count")
    val count: kotlin.Int

)

