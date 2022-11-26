package com.ozioma.plugins


import com.ozioma.data.request.RequestBodyHelper
import com.ozioma.network.BlockChainApi
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.client.utils.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.server.freemarker.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        blockChainRouting()
    }
}

fun Route.blockChainRouting(){
    route("/") {
        get("") {
            call.respondText(
                "Home"
            )
        }
    }
    route("/block") {
        get("/") {
             call.respondText(
                "Block related apis /{blockHash} /hash/{blockNumber} /hash/best")
        }
        get("/full/{blockHash}/") {
            val blockHash = call.parameters["blockHash"] ?: return@get call.respondText(
                "Missing blockHash",
                status = HttpStatusCode.BadRequest
            )
            val response = BlockChainApi.getBlock(blockHash)
            call.respondTemplate("index.ftl", mapOf("result" to response.result))
        }

        get("/hash/{blockNumber}/") {
            val blockNumber = call.parameters["blockNumber"] ?: return@get call.respondText(
                "Missing blockNumber",
                status = HttpStatusCode.BadRequest
            )
            println("Block number is $blockNumber")
            val response =
                BlockChainApi.executeBlockchainRequest(RequestBodyHelper.getBlockHash(blockNumber.toInt()))
            call.respondText(response.bodyAsText(), status = response.status)
        }

        get("/best/") {
            val body = RequestBodyHelper.getBestBlockHash()
            println(body)
            val response = BlockChainApi.executeBlockchainRequest(body)

            call.respondText(response.bodyAsText(), status = response.status)
        }
    }


    route("/txs") {
        get("/{transactionHash}/") {
            val transactionHash = call.parameters["transactionHash"] ?: return@get call.respondText(
                "Missing blockHash",
                status = HttpStatusCode.BadRequest
            )
            val response = BlockChainApi.getTransaction(transactionHash)
            call.respond(response)
        }
    }
}


