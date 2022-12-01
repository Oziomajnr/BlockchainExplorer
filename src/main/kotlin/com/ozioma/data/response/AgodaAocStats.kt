package com.ozioma.data.response

import kotlinx.serialization.Serializable

@Serializable
data class AgodaAocStats(
    val totalNumberOfStars: Long,
    val totalNumberOfUsersWithAtLeastOneStar: Int,
    val ranking: List<Member>,
    val summary: String = getNumberOfStarsMessage(totalNumberOfStars)

)

private val GOAL_NUMBER_OF_STARS = 250

private fun getNumberOfStarsMessage(collectedStars: Long): String {
    return if (collectedStars >= 250) {
        ":clap4: We have surpassed our goal of $GOAL_NUMBER_OF_STARS stars :star_mario2:  We have gathered $collectedStars. How many more stars can we collect? :pepe-yayy:"
    } else {
        ":muscle:  We have gathered $collectedStars stars :star_mario2: We need ${GOAL_NUMBER_OF_STARS-collectedStars} to reach our goals of How many more stars can we collect? :pepe-yayy:"
    }
}