package org.example.builder

data class User(
    var name: String = "",
    var age: Int = 0,
    var email: String? = null,
    var phone: String? = null,
    var address: String? = null
)

fun user(block: User.() -> Unit): User = User().apply(block)

fun main() {
    val user = user {
        name = "Gildong Hong"
        age = 30
        email = "hong@test.com"
        address = "Seoul-city"
    }
    println(user)
}