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

import ch.srg.sam.generated.model.BusinessUnitDto
import ch.srg.sam.generated.model.ShowDataDto
import ch.srg.sam.generated.model.TransmissionDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param urn 
 * @param businessUnit 
 * @param transmission 
 * @param externalId 
 * @param showData 
 */


data class ShowResponseDto (

    @field:JsonProperty("urn")
    val urn: kotlin.String,

    @field:JsonProperty("businessUnit")
    val businessUnit: BusinessUnitDto,

    @field:JsonProperty("transmission")
    val transmission: TransmissionDto,

    @field:JsonProperty("externalId")
    val externalId: kotlin.String,

    @field:JsonProperty("showData")
    val showData: ShowDataDto

)

