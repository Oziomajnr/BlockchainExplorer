package com.ozioma.data.request

object RequestBodyHelper {
    fun getBlock(blockHash: String): String {
        return "{ \"method\":\"getblock\", \"params\": [\"$blockHash\", 3] }"
    }

    fun getBlockHash(blockID: Int): String {
        return "{\"jsonrpc\": \"1.0\", \"id\": \"curltest\", \"method\": \"getblockhash\", \"params\": [$blockID]}"
    }

    fun getBestBlockHash(): String {
        return "{\"method\":\"getbestblockhash\"}"
    }
    fun getTransaction(transactionHash: String): String {
        return "{ \"method\":\"gettransaction\", \"params\": [\"$transactionHash\"] }"
    }
}