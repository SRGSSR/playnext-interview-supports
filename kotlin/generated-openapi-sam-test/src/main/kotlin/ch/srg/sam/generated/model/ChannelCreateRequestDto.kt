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

import ch.srg.sam.generated.model.ChannelDataDto
import ch.srg.sam.generated.model.TransmissionDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param transmission Primary content transmission channel
 * @param externalId 
 * @param channelData 
 */


data class ChannelCreateRequestDto (

    /* Primary content transmission channel */
    @field:JsonProperty("transmission")
    val transmission: TransmissionDto,

    @field:JsonProperty("externalId")
    val externalId: kotlin.String,

    @field:JsonProperty("channelData")
    val channelData: ChannelDataDto

)

