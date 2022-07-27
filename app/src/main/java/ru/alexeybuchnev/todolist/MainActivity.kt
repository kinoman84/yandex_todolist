package ru.alexeybuchnev.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.alexeybuchnev.todolist.presintation.list.TodoListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, TodoListFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}