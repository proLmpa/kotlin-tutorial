//package org.example.builder
//
//class User private constructor (
//    val name: String,
//    val age: Int,
//    val email: String?,
//    val phone: String?,
//    val address: String?
//) {
//    class Builder(private val name: String, private val age: Int) {
//        private var email: String? = null
//        private var phone: String? = null
//        private var address: String? = null
//
//        fun email(email: String) = apply { this.email = email }
//        fun phone(phone: String) = apply { this.phone = phone }
//        fun address(address: String) = apply { this.address = address }
//
//        fun build() = User(name, age, email, phone, address)
//    }
//
//    override fun toString(): String {
//        return "User(name=$name, age=$age, email=$email, phone=$phone, address=$address)"
//    }
//}
//
//fun main() {
//    val user = User.Builder("Gildong Hong", 30)
//        .email("hong@test.com")
//        .address("Seoul")
//    .build()
//
//    println(user.toString())
//}