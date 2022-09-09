package com.tmm.kmmexample

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}