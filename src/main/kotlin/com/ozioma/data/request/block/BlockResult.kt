package com.ozioma.data.request.block

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BlockResult(

    @SerialName("hash") var hash: String? = null,
    @SerialName("confirmations") var confirmations: Int? = null,
    @SerialName("height") var height: Int? = null,
    @SerialName("version") var version: Long? = null,
    @SerialName("versionHex") var versionHex: String? = null,
    @SerialName("merkleroot") var merkleroot: String? = null,
    @SerialName("time") var time: Long? = null,
    @SerialName("mediantime") var mediantime: Long? = null,
    @SerialName("nonce") var nonce: Long? = null,
    @SerialName("bits") var bits: String? = null,
    @SerialName("difficulty") var difficulty: Double? = null,
    @SerialName("chainwork") var chainwork: String? = null,
    @SerialName("nTx") var nTx: Int? = null,
    @SerialName("previousblockhash") var previousblockhash: String? = null,
    @SerialName("nextblockhash") var nextblockhash: String? = null,
    @SerialName("strippedsize") var strippedsize: Int? = null,
    @SerialName("size") var size: Int? = null,
    @SerialName("weight") var weight: Int? = null,
    @SerialName("tx") var tx: ArrayList<Tx> = arrayListOf()

)