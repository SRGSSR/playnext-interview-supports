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
 * @param name 
 * @param coverUrlLarge 
 * @param coverUrlSmall 
 */


data class CdDto (

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("coverUrlLarge")
    val coverUrlLarge: kotlin.String? = null,

    @field:JsonProperty("coverUrlSmall")
    val coverUrlSmall: kotlin.String? = null

)

