package com.samelody.samples.kotlin.coroutines

import com.samelody.samples.kotlin.User
import kotlinx.coroutines.delay

fun main() {
}

suspend fun callGetUser(userId: String) {
    getUserSuspend(userId)
}

suspend fun getUserSuspend(userId: String): User {
    delay(1000)
    return User(userId, "Belin")
}