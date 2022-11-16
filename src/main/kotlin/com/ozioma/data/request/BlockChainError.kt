package com.ozioma.data.request

import kotlinx.serialization.Serializable

@Serializable
data class BlockChainError(val code: Int, val message: String)
