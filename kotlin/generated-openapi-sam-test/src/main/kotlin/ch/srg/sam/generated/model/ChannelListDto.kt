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

import ch.srg.sam.generated.model.ChannelDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param channelList 
 */


data class ChannelListDto (

    @field:JsonProperty("channelList")
    val channelList: kotlin.collections.List<ChannelDto>? = null

)

