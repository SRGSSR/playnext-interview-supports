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
import ch.srg.sam.generated.model.EpisodeDataWithUrnDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param businessUnit 
 * @param episodes 
 * @param next URL to fetch next page
 */


data class EpisodesResponseDto (

    @field:JsonProperty("businessUnit")
    val businessUnit: BusinessUnitDto,

    @field:JsonProperty("episodes")
    val episodes: kotlin.collections.List<EpisodeDataWithUrnDto>,

    /* URL to fetch next page */
    @field:JsonProperty("next")
    val next: kotlin.String? = null

)

