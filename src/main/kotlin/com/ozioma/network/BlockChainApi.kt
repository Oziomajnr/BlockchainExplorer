package com.ozioma.network

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.client.utils.*
import io.ktor.http.*
import io.ktor.server.routing.*
import kotlinx.serialization.json.Json
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.delay

object BlockChainApi {
   suspend fun executeBlockchainRequest(body: String): HttpResponse{
        val response = httpClient.post("http://127.0.0.1:18332/") {
            contentType(ContentType.Application.Json)
            accept(ContentType.Application.Json)
            setBody(body)
            headers {
                append(HttpHeaders.Authorization, "Basic b3ppb21hOmRhbmllbA==")
            }

        }
       return response
    }
}

val httpClient = createClient()

private fun createClient(): HttpClient {
    val client = HttpClient(CIO) {
        install(io.ktor.client.plugins.contentnegotiation.ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }

    }
    return client
}