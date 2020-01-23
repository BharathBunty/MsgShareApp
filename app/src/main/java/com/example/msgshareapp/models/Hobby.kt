package com.example.msgshareapp.models

data class Hobby(var title: String)

object ListOfHobbies {
    val hobbies = listOf(
        Hobby("Swimming"),
        Hobby("Reading"),
        Hobby("Walking"),
        Hobby("Traveling"),
        Hobby("Games"),
        Hobby("Adventure Games")
    )
}