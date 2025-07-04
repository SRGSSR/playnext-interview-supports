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
import ch.srg.sam.generated.model.PageTypeDto
import ch.srg.sam.generated.model.SectionInfoDto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param id 
 * @param isPublished Indicate if this is the draft (false) or the published version (true) of the section.
 * @param vendor 
 * @param title 
 * @param type 
 * @param topicUrn 
 * @param sectionList 
 * @param nextSectionChange 
 * @param description 
 */


data class PageDto (

    @field:JsonProperty("id")
    val id: java.util.UUID,

    /* Indicate if this is the draft (false) or the published version (true) of the section. */
    @field:JsonProperty("isPublished")
    val isPublished: kotlin.Boolean,

    @field:JsonProperty("vendor")
    val vendor: BusinessUnitDto,

    @field:JsonProperty("title")
    val title: kotlin.String,

    @field:JsonProperty("type")
    val type: PageTypeDto,

    @field:JsonProperty("topicUrn")
    val topicUrn: kotlin.String? = null,

    @field:JsonProperty("sectionList")
    val sectionList: kotlin.collections.List<SectionInfoDto>? = null,

    @field:JsonProperty("nextSectionChange")
    val nextSectionChange: java.time.LocalDateTime? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null

)

