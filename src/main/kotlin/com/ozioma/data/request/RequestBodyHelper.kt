package com.ozioma.data.request

object RequestBodyHelper {
    fun getBlock(blockHash: String): String {
        return "{ \"method\":\"getblock\", \"params\": [\"$blockHash\", 3] }"
    }
}