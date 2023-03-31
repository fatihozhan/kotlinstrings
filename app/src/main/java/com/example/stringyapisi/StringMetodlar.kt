package com.example.stringyapisi

fun main(){
    val str1 = "Merhaba"
    println(str1.subSequence(0,4))

    val str2 = "Merhaba"

    if (str2.contains("er"))println("İçeriir")

    val str3 = "Merhaba"

    println(str3.uppercase())
    println(str3.lowercase())

    val str4 = "Merhaba Nasılsın"

    val dizi = str4.split(" ")
    println(dizi.toString())
    for (d in dizi){
        println(d)
    }

    val str5 = " Merhaba "
    println(str5.trim())
}