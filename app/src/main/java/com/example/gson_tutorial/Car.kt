package com.example.gson_tutorial

class Car (
    var name: String = "",
    var price: Int = 0
) {
    fun getInfo() = "this car named $name that is $price$."
}