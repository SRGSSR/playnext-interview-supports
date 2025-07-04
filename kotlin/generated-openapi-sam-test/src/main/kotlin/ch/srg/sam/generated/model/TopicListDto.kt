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

import ch.srg.sam.generated.model.TopicDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A list of topics. See Topic for further details
 *
 * @param topicList 
 */


data class TopicListDto (

    @field:JsonProperty("topicList")
    val topicList: kotlin.collections.List<TopicDto>? = null

)

