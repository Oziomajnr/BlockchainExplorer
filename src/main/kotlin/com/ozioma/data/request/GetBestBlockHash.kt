package com.ozioma.data.request

//import kotlinx.serialization.KSerializer
//import kotlinx.serialization.Serializable
//import kotlinx.serialization.Serializer
//import kotlinx.serialization.builtins.serializer
//import kotlinx.serialization.descriptors.PrimitiveKind
//import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
//import kotlinx.serialization.descriptors.SerialDescriptor
//import kotlinx.serialization.descriptors.listSerialDescriptor
//import kotlinx.serialization.encoding.Decoder
//import kotlinx.serialization.encoding.Encoder
//import kotlinx.serialization.serializer
//import java.util.*
//
//@Serializable
//object GetBestBlockHash : BlockChainCommand("getbestblockhash")
//
//@Serializable
//data class GetBlock(
//    @Transient val blockHash: String,
//    @Transient val verbosity: Int,
//    val params: List<BlockChainParam> = emptyList()
//) : BlockChainCommand("getblock")
//
//@Serializable
//sealed class BlockChainCommand(open val method: String)
//
//@Serializable
//data class StringBlockChainParam( val value1: String) : BlockChainParam(value1)
//
//@Serializable
//data class IntBlockChainParam( val value1: Int) : BlockChainParam(value1)
//
//@Serializable
//open class BlockChainParam( val value: Objects)