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
import ch.srg.sam.generated.model.EpisodeDataDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param urn 
 * @param businessUnit 
 * @param externalId 
 * @param episodeData 
 */


data class EpisodeResponseDto (

    @field:JsonProperty("urn")
    val urn: kotlin.String,

    @field:JsonProperty("businessUnit")
    val businessUnit: BusinessUnitDto,

    @field:JsonProperty("externalId")
    val externalId: kotlin.String,

    @field:JsonProperty("episodeData")
    val episodeData: EpisodeDataDto

)

