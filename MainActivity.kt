package com.example.lab2android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Пример списка книг
        val books = listOf(
            Book("Бесы", "Фёдор Достоевский", "https://www.lib.cam.ac.uk/files/20131029_talk_image.jpg"),
            Book("1984", "George Orwell", "https://www.kino-teatr.ru/news/5940/62560.jpg"),
            Book("ЪУЪ", "The creation of our nation", "https://i.pinimg.com/736x/8a/cc/55/8acc555cc2f18ddc5db251a1af673e1b.jpg")
        )

        //recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(books)
    }
}
