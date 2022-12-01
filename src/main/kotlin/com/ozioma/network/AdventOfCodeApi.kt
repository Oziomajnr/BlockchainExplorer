package com.ozioma.network

import com.ozioma.data.response.AOCStatResponse
import com.slack.api.Slack
import com.slack.api.methods.MethodsClient
import com.slack.api.methods.request.chat.ChatPostMessageRequest
import com.slack.api.methods.response.chat.ChatPostMessageResponse
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

object AdventOfCodeApi {
    suspend fun getStats(year: String): AOCStatResponse {
        return httpClient.post("https://adventofcode.com/${year}/leaderboard/private/view/1202163.json") {
            contentType(ContentType.Application.Json)
            accept(ContentType.Application.Json)
            headers {
                append(
                    HttpHeaders.Cookie,
                    "{AOC Cookie}"
                )
            }
        }.body()
    }

    suspend fun sendAocMessageToSlack(message: String): ChatPostMessageResponse {
        val slack = Slack.getInstance()

        val methods: MethodsClient =
            slack.methods("{Slack APi key}")

        val request = ChatPostMessageRequest.builder()
            .channel("#advent-of-code")
            .text(message)
            .build()
        return methods.chatPostMessage(request)
    }
}

val httpClient = createClient()

private fun createClient(): HttpClient {
    val client = HttpClient(CIO) {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }

    }
    return client
}