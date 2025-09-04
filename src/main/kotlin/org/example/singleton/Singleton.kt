package org.example.singleton

object Database {
    val name = "MyDatabase"

    fun connect() {
        println("$name connection successful!")
    }
}

fun main() {
    Database.connect()
    Database.connect()
}