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
 * Analytics values primarily for TagCommander analytics.
 *
 * @param mediaEpisodeId 
 * @param mediaTvId 
 * @param mediaShowId 
 * @param mediaShow 
 * @param mediaEpisode 
 * @param mediaIsLivestream 
 * @param mediaFullLength 'full' if requested media is the full length media, 'partial' otherwise
 * @param mediaEnterpriseUnits 
 * @param mediaUrn 
 * @param mediaContentGroup Comma separated list of topics
 * @param mediaChannelId Id of the channel
 * @param mediaChannelName Title / name of the channel
 * @param mediaSincePublicationD 
 * @param mediaSincePublicationH 
 * @param mediaThumbnail 
 * @param mediaPublicationDate 
 * @param mediaPublicationTime 
 * @param mediaPublicationDatetime 
 * @param mediaSegmentLength Duration of segment in seconds
 * @param mediaEpisodeLength Duration of full length media (i.e. episode) in seconds
 * @param mediaSegmentId 
 * @param mediaType 
 * @param mediaDurationCategory Either 'short', 'long' or 'infinit.livestream'
 * @param mediaSegment If it's a livestream 'Livestream', otherwise the media title
 * @param mediaIsGeoblocked 
 * @param mediaAssignedTags List of topics separated by ; (semicolon)
 * @param mediaUrl Resource URL
 * @param mediaStreamingQuality 
 * @param mediaSpecialFormat 
 * @param mediaChannelCs Mediapulse channel code
 * @param mediaTvDate 
 * @param mediaTvTime 
 * @param mediaIsWebOnly 
 * @param mediaJoker1 
 * @param mediaJoker2 
 * @param mediaJoker3 
 * @param mediaLanguage 
 * @param mediaSubSetId 
 * @param mediaTopicList 
 * @param mediaSignlanguageOn 
 */


data class AnalyticsMetadataDto (

    @field:JsonProperty("media_episode_id")
    val mediaEpisodeId: kotlin.String? = null,

    @field:JsonProperty("media_tv_id")
    val mediaTvId: kotlin.String? = null,

    @field:JsonProperty("media_show_id")
    val mediaShowId: kotlin.String? = null,

    @field:JsonProperty("media_show")
    val mediaShow: kotlin.String? = null,

    @field:JsonProperty("media_episode")
    val mediaEpisode: kotlin.String? = null,

    @field:JsonProperty("media_is_livestream")
    val mediaIsLivestream: kotlin.String? = null,

    /* 'full' if requested media is the full length media, 'partial' otherwise */
    @field:JsonProperty("media_full_length")
    val mediaFullLength: kotlin.String? = null,

    @field:JsonProperty("media_enterprise_units")
    val mediaEnterpriseUnits: kotlin.String? = null,

    @field:JsonProperty("media_urn")
    val mediaUrn: kotlin.String? = null,

    /* Comma separated list of topics */
    @field:JsonProperty("media_content_group")
    val mediaContentGroup: kotlin.String? = null,

    /* Id of the channel */
    @field:JsonProperty("media_channel_id")
    val mediaChannelId: kotlin.String? = null,

    /* Title / name of the channel */
    @field:JsonProperty("media_channel_name")
    val mediaChannelName: kotlin.String? = null,

    @field:JsonProperty("media_since_publication_d")
    val mediaSincePublicationD: kotlin.String? = null,

    @field:JsonProperty("media_since_publication_h")
    val mediaSincePublicationH: kotlin.String? = null,

    @field:JsonProperty("media_thumbnail")
    val mediaThumbnail: kotlin.String? = null,

    @field:JsonProperty("media_publication_date")
    val mediaPublicationDate: java.time.LocalDate? = null,

    @field:JsonProperty("media_publication_time")
    val mediaPublicationTime: java.time.LocalTime? = null,

    @field:JsonProperty("media_publication_datetime")
    val mediaPublicationDatetime: java.time.LocalDateTime? = null,

    /* Duration of segment in seconds */
    @field:JsonProperty("media_segment_length")
    val mediaSegmentLength: kotlin.String? = null,

    /* Duration of full length media (i.e. episode) in seconds */
    @field:JsonProperty("media_episode_length")
    val mediaEpisodeLength: kotlin.String? = null,

    @field:JsonProperty("media_segment_id")
    val mediaSegmentId: kotlin.String? = null,

    @field:JsonProperty("media_type")
    val mediaType: kotlin.String? = null,

    /* Either 'short', 'long' or 'infinit.livestream' */
    @field:JsonProperty("media_duration_category")
    val mediaDurationCategory: kotlin.String? = null,

    /* If it's a livestream 'Livestream', otherwise the media title */
    @field:JsonProperty("media_segment")
    val mediaSegment: kotlin.String? = null,

    @field:JsonProperty("media_is_geoblocked")
    val mediaIsGeoblocked: kotlin.String? = null,

    /* List of topics separated by ; (semicolon) */
    @field:JsonProperty("media_assigned_tags")
    val mediaAssignedTags: kotlin.String? = null,

    /* Resource URL */
    @field:JsonProperty("media_url")
    val mediaUrl: kotlin.String? = null,

    @field:JsonProperty("media_streaming_quality")
    val mediaStreamingQuality: kotlin.String? = null,

    @field:JsonProperty("media_special_format")
    val mediaSpecialFormat: kotlin.String? = null,

    /* Mediapulse channel code */
    @field:JsonProperty("media_channel_cs")
    val mediaChannelCs: kotlin.String? = null,

    @field:JsonProperty("media_tv_date")
    val mediaTvDate: java.time.LocalDate? = null,

    @field:JsonProperty("media_tv_time")
    val mediaTvTime: java.time.LocalTime? = null,

    @field:JsonProperty("media_is_web_only")
    val mediaIsWebOnly: kotlin.String? = null,

    @field:JsonProperty("media_joker1")
    val mediaJoker1: kotlin.String? = null,

    @field:JsonProperty("media_joker2")
    val mediaJoker2: kotlin.String? = null,

    @field:JsonProperty("media_joker3")
    val mediaJoker3: kotlin.String? = null,

    @field:JsonProperty("media_language")
    val mediaLanguage: kotlin.String? = null,

    @field:JsonProperty("media_sub_set_id")
    val mediaSubSetId: kotlin.String? = null,

    @field:JsonProperty("media_topic_list")
    val mediaTopicList: kotlin.String? = null,

    @field:JsonProperty("media_signlanguage_on")
    val mediaSignlanguageOn: kotlin.String? = null

)

