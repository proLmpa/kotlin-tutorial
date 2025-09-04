package org.example.singleton

class Logger private constructor() {
    companion object {
        val instance: Logger by lazy { Logger() }
    }

    fun log(message: String) {
        println("Log: $message")
    }
}

fun main() {
    val log1 = Logger.instance
    val log2 = Logger.instance

    log1.log("First message")
    println(log1 === log2)
}