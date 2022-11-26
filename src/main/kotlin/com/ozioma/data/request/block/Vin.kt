package com.ozioma.data.request.block

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Vin (

  @SerialName("coinbase"    ) var coinbase    : String?           = null,
  @SerialName("txinwitness" ) var txinwitness : ArrayList<String> = arrayListOf(),
  @SerialName("sequence"    ) var sequence    : Long?              = null

)