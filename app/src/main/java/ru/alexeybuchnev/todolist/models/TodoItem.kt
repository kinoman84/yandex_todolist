package ru.alexeybuchnev.todolist.models

import java.util.*

data class TodoItem(
    val id: UUID,
    var title: String,
    var description: String,
    var isCompleted: Boolean = false
)