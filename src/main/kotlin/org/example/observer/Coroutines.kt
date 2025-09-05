package org.example.observer

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun main() = runBlocking {
    // ConcreteSubject
    val publisher = flow {
        emit("Breaking News #1")
        emit("Breaking News #2")
        delay(5000)
        emit("Breaking News #3")
    }

    // ConcreteObserver
    val subscriber1 = launch {
        publisher.collect { message ->
            println("[Observer1]Subscriber received : $message")
        }
    }

    val subscriber2 = launch {
        publisher.collect { message ->
            println("[Observer2]Subscriber received : $message")
        }
    }

    val subscriber3 = launch {
        publisher.collect { message ->
            println("[Observer3]Subscriber received : $message")
        }
    }

    joinAll(subscriber1, subscriber2, subscriber3)
}