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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import ch.srg.sam.generated.model.ChannelCreateRequestDto
import ch.srg.sam.generated.model.ChannelDataDto
import ch.srg.sam.generated.model.TransmissionDto

class ChannelCreateRequestDtoTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ChannelCreateRequestDto
        //val modelInstance = ChannelCreateRequestDto()

        // to test the property `transmission` - Primary content transmission channel
        should("test transmission") {
            // uncomment below to test the property
            //modelInstance.transmission shouldBe ("TODO")
        }

        // to test the property `externalId`
        should("test externalId") {
            // uncomment below to test the property
            //modelInstance.externalId shouldBe ("TODO")
        }

        // to test the property `channelData`
        should("test channelData") {
            // uncomment below to test the property
            //modelInstance.channelData shouldBe ("TODO")
        }

    }
}
