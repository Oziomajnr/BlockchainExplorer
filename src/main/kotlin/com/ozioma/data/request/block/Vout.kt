package com.ozioma.data.request.block

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Vout(

    @SerialName("value") var value: Double? = null,
    @SerialName("n") var n: Int? = null,
    @SerialName("scriptPubKey") var scriptPubKey: ScriptPubKey? = ScriptPubKey()

)