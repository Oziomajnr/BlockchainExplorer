Goal: Take block hash as input and get all the block information represented on a UI.

How to use

Download bitcoin core https://bitcoin.org/en/full-node

modify your bitcoin.conf
Example:
```regtest = 1
server=1
dbcache=1536
par=1
maxuploadtarget=137
maxconnections=16
rpcuser=ozioma
rpcpassword=password
rpcallowip=127.0.0.1
debug=tor
prune=550
mintxfee=0.001
txconfirmtarget=1
[test]
rpcbind=127.0.0.1
rpcport=18332
[main]
rpcbind=127.0.0.1
rpcport=8332
[regtest]
rpcbind=127.0.0.1
rpcport=18443
```

Install bitcoin-cli and Run bitcoin core as a daemon process
See https://bitcoin.org/en/full-node#other-linux-daemon

Clone project and from the project root folder run gradle assemble, 
From the project root folder run

`gradlew assemble`

if permission is denied, run
`chmod 755 gradlew` first  before gradlew assemble

this would build a .jar file that in the build folder that you can then run using

    java -jar /build/libs/com.ozioma.bitcoinexplorer-all.jar

goto: http://127.0.0.1:8080/block/full/{block_hash}/
to view the information about a block.

Http calls are made to the bitcoin node using https://ktor.io

Block information is rendered using FreeMarker https://ktor.io/docs/freemarker.html

This project is for experimenting and learning how to use the block chain, not for production.


