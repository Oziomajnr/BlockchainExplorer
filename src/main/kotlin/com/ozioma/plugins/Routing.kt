package com.ozioma.plugins


import com.ozioma.data.request.RequestBodyHelper
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/") {
            val client = createClient()
            val response = client.post("http://127.0.0.1:18332/") {
                contentType(ContentType.Application.Json)
                accept(ContentType.Application.Json)
                headers {
                    append(HttpHeaders.Authorization, "Basic b3ppb21hOmRhbmllbA==")
                }
                setBody(RequestBodyHelper.getBlock("0000000000000039b23cc0b3769286b7fd2cc5de82a8174a959c31d899f8e252"))
            }
            println("Printing response")
            println(response.bodyAsText())
            call.respond(response.bodyAsText())
        }
    }
}

private fun createClient(): HttpClient {
    val client = HttpClient(CIO){
        install(io.ktor.client.plugins.contentnegotiation.ContentNegotiation){
            json(Json {
                prettyPrint = true
                isLenient = true
            })
        }
        }

    return client
}
