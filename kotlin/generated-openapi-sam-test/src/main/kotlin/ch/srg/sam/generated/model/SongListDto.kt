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

import ch.srg.sam.generated.model.SongDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param next 
 * @param songList 
 */


data class SongListDto (

    @field:JsonProperty("next")
    val next: kotlin.String? = null,

    @field:JsonProperty("songList")
    val songList: kotlin.collections.List<SongDto>? = null

)

