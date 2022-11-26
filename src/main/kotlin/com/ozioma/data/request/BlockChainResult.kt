package com.ozioma.data.request

import com.ozioma.data.request.block.BlockResult
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BlockChainResult (
  @SerialName("result" ) var result : BlockResult? = BlockResult(),
  @SerialName("error"  ) var error  : BlockChainError? = null,
  @SerialName("id"     ) var id     : String? = null
)