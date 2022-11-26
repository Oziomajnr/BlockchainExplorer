package com.ozioma.data.request.block

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ScriptPubKey(

    @SerialName("asm") var asm: String? = null,
    @SerialName("desc") var desc: String? = null,
    @SerialName("hex") var hex: String? = null,
    @SerialName("address") var address: String? = null,
    @SerialName("type") var type: String? = null

)