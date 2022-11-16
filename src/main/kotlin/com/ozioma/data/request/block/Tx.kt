package com.ozioma.data.request.block

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Tx(

    @SerialName("txid") var txid: String? = null,
    @SerialName("hash") var hash: String? = null,
    @SerialName("version") var version: Int? = null,
    @SerialName("size") var size: Int? = null,
    @SerialName("vsize") var vsize: Int? = null,
    @SerialName("weight") var weight: Int? = null,
    @SerialName("locktime") var locktime: Int? = null,
    @SerialName("vin") var vin: ArrayList<Vin> = arrayListOf(),
    @SerialName("vout") var vout: ArrayList<Vout> = arrayListOf(),
    @SerialName("hex") var hex: String? = null

)