package com.ozioma

import com.ozioma.cron.createCron
import com.ozioma.data.response.toStats
import com.ozioma.network.AdventOfCodeApi
import com.ozioma.network.AdventOfCodeApi.sendAocMessageToSlack
import com.ozioma.plugins.configureRouting
import com.ozioma.plugins.configureSerialization
import com.ozioma.util.DateTimeUtil
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*


fun main() {
    embeddedServer(Netty, port = 8080, host = "127.0.0.1", module = Application::module)
        .start(wait = true)
}


fun Application.module() {
    configureSerialization()
    configureRouting()
    createCron(this, DateTimeUtil.tenAmCurrentDay - DateTimeUtil.currentTime, 20000) {
        println("Running cron job")
        val response = AdventOfCodeApi.getStats("2021")
        sendAocMessageToSlack(response.toStats().summary)
    }
}
