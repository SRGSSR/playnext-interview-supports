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

import ch.srg.sam.generated.model.AnalyticsDataDto
import ch.srg.sam.generated.model.AnalyticsMetadataDto
import ch.srg.sam.generated.model.AudioCodecDto
import ch.srg.sam.generated.model.AudioTrackDto
import ch.srg.sam.generated.model.DrmDto
import ch.srg.sam.generated.model.EncodingDto
import ch.srg.sam.generated.model.MediaContainerDto
import ch.srg.sam.generated.model.PresentationDto
import ch.srg.sam.generated.model.ProtocolDto
import ch.srg.sam.generated.model.QualityDto
import ch.srg.sam.generated.model.StreamingDto
import ch.srg.sam.generated.model.SubtitleInformationDto
import ch.srg.sam.generated.model.TokenTypeDto
import ch.srg.sam.generated.model.VideoCodecDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A resource is a playable item. It contains the url of the video or audio file / stream that a player can play.
 *
 * @param url 
 * @param quality 
 * @param protocol 
 * @param encoding 
 * @param presentation 
 * @param streaming 
 * @param dvr 
 * @param live 
 * @param mediaContainer 
 * @param audioCodec 
 * @param videoCodec 
 * @param tokenType 
 * @param drmList 
 * @param mimeType 
 * @param audioTrackList 
 * @param subtitleInformationList 
 * @param analyticsData 
 * @param analyticsMetadata 
 * @param streamOffset Stream offset in milliseconds
 */


data class ResourceDto (

    @field:JsonProperty("url")
    val url: kotlin.String,

    @field:JsonProperty("quality")
    val quality: QualityDto,

    @field:JsonProperty("protocol")
    val protocol: ProtocolDto,

    @field:JsonProperty("encoding")
    val encoding: EncodingDto,

    @field:JsonProperty("presentation")
    val presentation: PresentationDto,

    @field:JsonProperty("streaming")
    val streaming: StreamingDto,

    @field:JsonProperty("dvr")
    val dvr: kotlin.Boolean,

    @field:JsonProperty("live")
    val live: kotlin.Boolean,

    @field:JsonProperty("mediaContainer")
    val mediaContainer: MediaContainerDto,

    @field:JsonProperty("audioCodec")
    val audioCodec: AudioCodecDto,

    @field:JsonProperty("videoCodec")
    val videoCodec: VideoCodecDto,

    @field:JsonProperty("tokenType")
    val tokenType: TokenTypeDto,

    @field:JsonProperty("drmList")
    val drmList: kotlin.collections.List<DrmDto>? = null,

    @field:JsonProperty("mimeType")
    val mimeType: kotlin.String? = null,

    @field:JsonProperty("audioTrackList")
    val audioTrackList: kotlin.collections.List<AudioTrackDto>? = null,

    @field:JsonProperty("subtitleInformationList")
    val subtitleInformationList: kotlin.collections.List<SubtitleInformationDto>? = null,

    @field:JsonProperty("analyticsData")
    val analyticsData: AnalyticsDataDto? = null,

    @field:JsonProperty("analyticsMetadata")
    val analyticsMetadata: AnalyticsMetadataDto? = null,

    /* Stream offset in milliseconds */
    @field:JsonProperty("streamOffset")
    val streamOffset: kotlin.Int? = null

)

