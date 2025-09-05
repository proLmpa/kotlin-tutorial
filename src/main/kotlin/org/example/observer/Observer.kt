package org.example.observer

// Observer interface
interface Observer {
    fun update(message: String)
}

// Subject interface
interface Subject {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers(message: String)
}

// ConcreteSubject
class NewsPublisher : Subject {
    private val observers = mutableListOf<Observer>()

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers(message: String) {
        for (observer in observers) {
            observer.update(message)
        }
    }
}

// ConcreteObserver
class NewsSubscriber(val name: String) : Observer {
    override fun update(message: String) {
        println("$name received news: $message")
    }
}

fun main() {
    val publisher = NewsPublisher()

    val sub1 = NewsSubscriber("Alice")
    val sub2 = NewsSubscriber("Bob")

    publisher.addObserver(sub1)
    publisher.addObserver(sub2)

    publisher.notifyObservers("Breaking News: Kotlin is awesome!")
}