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

import ch.srg.sam.generated.model.DistributionVectorDto
import ch.srg.sam.generated.model.OrderMediaListByDto
import ch.srg.sam.generated.model.PushLanguageDto
import ch.srg.sam.generated.model.PushLinkDto
import ch.srg.sam.generated.model.QualityDto
import ch.srg.sam.generated.model.ShowBroadcastInformationDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param title 
 * @param lead 
 * @param description 
 * @param imageUrl 
 * @param imageTitle 
 * @param imageCopyright 
 * @param bannerImageUrl 
 * @param posterImageUrl 
 * @param podcastImageUrl 
 * @param homepageUrl 
 * @param podcastSubscriptionUrl 
 * @param podcastFeedSdUrl 
 * @param podcastFeedHdUrl 
 * @param podcastDeezerUrl 
 * @param podcastSpotifyUrl 
 * @param timeTableUrl Link to program guide
 * @param hiddenInAToZ Used by public endpoint showList-alphabetical
 * @param suppressWebIndexing If true, clients should make sure that this show is not indexed by web crawlers
 * @param links 
 * @param topicUrns 
 * @param channelUrn 
 * @param broadcastInformation 
 * @param qualities Available video qualities.
 * @param audioLanguages Available audio languages.
 * @param subtitleLanguages Available subtitle languages.
 * @param audioDescriptionAvailable 
 * @param subtitlesAvailable Indicates that subtitles are available, does not have to reflect contents of subtitleLanguages
 * @param multiAudioLanguagesAvailable Indicates that more than one audio language is available, does not have to reflect contents of audioLanguages
 * @param orderMediaListBy Ordering of the show's media list. Defaults to MEDIA_START_DATE_DESC.
 * @param hiddenInHbbTv Indicates if this show should be hidden in platform HbbTv
 * @param onlyVisibleByIdOnVectors This show will be hidden in most endpoints (e.g. showList, search) if the requested vector is contained in the list. Use this for shows that, for example, are just containers for episodes and should therefore not appear in search results. By urn(s) and by externalId(s) requests ignore this field. If empty or unset, the show visibility will not be restricted. If no explicit vector is requested, this show is only hidden if all vectors are set.
 * @param validFromAToZ Sets a date from which this show should appear in showList-alphabetical. By urn(s) and by externalId(s) requests ignore this field.
 * @param validToAToZ Sets a date up to which this show should appear in showList-alphabetical. By urn(s) and by externalId(s) requests ignore this field.
 * @param uniqueNameSrf SRF has another ID for a show called uniqueName, some SRF backend systems know only this id.
 */


data class ShowDataDto (

    @field:JsonProperty("title")
    val title: kotlin.String,

    @field:JsonProperty("lead")
    val lead: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("imageUrl")
    val imageUrl: kotlin.String? = null,

    @field:JsonProperty("imageTitle")
    val imageTitle: kotlin.String? = null,

    @field:JsonProperty("imageCopyright")
    val imageCopyright: kotlin.String? = null,

    @field:JsonProperty("bannerImageUrl")
    val bannerImageUrl: kotlin.String? = null,

    @field:JsonProperty("posterImageUrl")
    val posterImageUrl: kotlin.String? = null,

    @field:JsonProperty("podcastImageUrl")
    val podcastImageUrl: kotlin.String? = null,

    @field:JsonProperty("homepageUrl")
    val homepageUrl: kotlin.String? = null,

    @field:JsonProperty("podcastSubscriptionUrl")
    val podcastSubscriptionUrl: kotlin.String? = null,

    @field:JsonProperty("podcastFeedSdUrl")
    val podcastFeedSdUrl: kotlin.String? = null,

    @field:JsonProperty("podcastFeedHdUrl")
    val podcastFeedHdUrl: kotlin.String? = null,

    @field:JsonProperty("podcastDeezerUrl")
    val podcastDeezerUrl: kotlin.String? = null,

    @field:JsonProperty("podcastSpotifyUrl")
    val podcastSpotifyUrl: kotlin.String? = null,

    /* Link to program guide */
    @field:JsonProperty("timeTableUrl")
    val timeTableUrl: kotlin.String? = null,

    /* Used by public endpoint showList-alphabetical */
    @field:JsonProperty("hiddenInAToZ")
    val hiddenInAToZ: kotlin.Boolean? = false,

    /* If true, clients should make sure that this show is not indexed by web crawlers */
    @field:JsonProperty("suppressWebIndexing")
    val suppressWebIndexing: kotlin.Boolean? = null,

    @field:JsonProperty("links")
    val links: kotlin.collections.List<PushLinkDto>? = null,

    @field:JsonProperty("topicUrns")
    val topicUrns: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("channelUrn")
    val channelUrn: kotlin.String? = null,

    @field:JsonProperty("broadcastInformation")
    val broadcastInformation: ShowBroadcastInformationDto? = null,

    /* Available video qualities. */
    @field:JsonProperty("qualities")
    val qualities: kotlin.collections.List<QualityDto>? = null,

    /* Available audio languages. */
    @field:JsonProperty("audioLanguages")
    val audioLanguages: kotlin.collections.List<PushLanguageDto>? = null,

    /* Available subtitle languages. */
    @field:JsonProperty("subtitleLanguages")
    val subtitleLanguages: kotlin.collections.List<PushLanguageDto>? = null,

    @field:JsonProperty("audioDescriptionAvailable")
    val audioDescriptionAvailable: kotlin.Boolean? = null,

    /* Indicates that subtitles are available, does not have to reflect contents of subtitleLanguages */
    @field:JsonProperty("subtitlesAvailable")
    val subtitlesAvailable: kotlin.Boolean? = null,

    /* Indicates that more than one audio language is available, does not have to reflect contents of audioLanguages */
    @field:JsonProperty("multiAudioLanguagesAvailable")
    val multiAudioLanguagesAvailable: kotlin.Boolean? = null,

    /* Ordering of the show's media list. Defaults to MEDIA_START_DATE_DESC. */
    @field:JsonProperty("orderMediaListBy")
    val orderMediaListBy: OrderMediaListByDto? = null,

    /* Indicates if this show should be hidden in platform HbbTv */
    @field:JsonProperty("hiddenInHbbTv")
    @Deprecated(message = "This property is deprecated.")
    val hiddenInHbbTv: kotlin.Boolean? = null,

    /* This show will be hidden in most endpoints (e.g. showList, search) if the requested vector is contained in the list. Use this for shows that, for example, are just containers for episodes and should therefore not appear in search results. By urn(s) and by externalId(s) requests ignore this field. If empty or unset, the show visibility will not be restricted. If no explicit vector is requested, this show is only hidden if all vectors are set. */
    @field:JsonProperty("onlyVisibleByIdOnVectors")
    val onlyVisibleByIdOnVectors: kotlin.collections.List<DistributionVectorDto>? = null,

    /* Sets a date from which this show should appear in showList-alphabetical. By urn(s) and by externalId(s) requests ignore this field. */
    @field:JsonProperty("validFromAToZ")
    val validFromAToZ: java.time.LocalDateTime? = null,

    /* Sets a date up to which this show should appear in showList-alphabetical. By urn(s) and by externalId(s) requests ignore this field. */
    @field:JsonProperty("validToAToZ")
    val validToAToZ: java.time.LocalDateTime? = null,

    /* SRF has another ID for a show called uniqueName, some SRF backend systems know only this id. */
    @field:JsonProperty("uniqueNameSrf")
    val uniqueNameSrf: kotlin.String? = null

)

