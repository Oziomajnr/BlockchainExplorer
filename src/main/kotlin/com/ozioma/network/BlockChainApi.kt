package com.ozioma.network

import com.ozioma.data.request.BlockChainResult
import com.ozioma.data.request.RequestBodyHelper
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.client.utils.*
import io.ktor.http.*
import io.ktor.server.routing.*
import kotlinx.serialization.json.Json
import io.ktor.serialization.kotlinx.json.*

object BlockChainApi {
   suspend fun executeBlockchainRequest(body: String): HttpResponse{
        return httpClient.post("http://127.0.0.1:18332/") {
            contentType(ContentType.Application.Json)
            accept(ContentType.Application.Json)
            setBody(body)
            headers {
                append(HttpHeaders.Authorization, "Basic b3ppb21hOmRhbmllbA==")
            }

        }
    }

    suspend fun getBlock(blockHash: String): BlockChainResult {
        val response = executeBlockchainRequest(RequestBodyHelper.getBlock(blockHash))
        return response.body()
    }

    suspend fun getTransaction(transactionHash: String): String {
        val response = executeBlockchainRequest(RequestBodyHelper.getTransaction(transactionHash))
        return response.bodyAsText()
    }
}

val httpClient = createClient()

private fun createClient(): HttpClient {
    val client = HttpClient(CIO) {
        install(io.ktor.client.plugins.contentnegotiation.ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
            })
        }

    }
    return client
}