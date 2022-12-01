package com.ozioma.plugins


import com.ozioma.data.response.AOCStatResponse
import com.ozioma.data.response.AgodaAocStats
import com.ozioma.data.response.toStats
import com.ozioma.network.AdventOfCodeApi
import com.slack.api.Slack
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import com.slack.api.methods.response.chat.ChatPostMessageResponse

import com.slack.api.methods.request.chat.ChatPostMessageRequest

import com.slack.api.methods.MethodsClient


fun Application.configureRouting() {
    // Starting point for a Ktor app:
    routing {
        aocRouting()
    }
}

fun Route.aocRouting() {
    route("/") {
        get("") {
            call.respondText(
                "Home"
            )
        }
        get("/stats/json/{year}") {
            println("Getting advent of code stats")
            val response = AdventOfCodeApi.getStats(getYear(call))
            call.respond(response)
        }

        get("/stats/summary/{year}") {
            println("Getting advent of code stats as text")
            val response = AdventOfCodeApi.getStats(getYear(call))
            call.respond(response.toStats())
        }

        get("/stats/summary/text/{year}") {
            println("Getting advent of code stats as text")
            val response = AdventOfCodeApi.getStats(getYear(call))
            call.respond(response.toStats().summary)
        }

        get("/stats/summary/text/{year}/slack") {
            println("Getting advent of code stats as text")
            val response = AdventOfCodeApi.getStats(getYear(call))

            val slackResponse = AdventOfCodeApi.sendAocMessageToSlack(response.toStats().summary)
            call.respond(
                if (slackResponse.isOk) "Successfully posted AOC summary to slack #advent-of-code channel ${response.toStats().summary}" else {
                    "Failed to post AOC summary to slack #advent-of-code channel error: ${slackResponse.error} "
                }
            )
        }


    }

}

private fun getYear(call: ApplicationCall): String {
    return call.parameters["year"] ?: "2022"
}



