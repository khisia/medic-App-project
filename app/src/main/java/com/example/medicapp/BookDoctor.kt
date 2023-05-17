package com.example.medicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class BookDoctor : AppCompatActivity() {
    lateinit var bookdoc1:CardView
    lateinit var bookdoc2:CardView
    lateinit var bookdoc3:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_doctor)
            bookdoc1 = findViewById(R.id.book1)
            bookdoc2 = findViewById(R.id.book2)
            bookdoc3 = findViewById(R.id.book2)
        // SetOnCLIckListener
            bookdoc1.setOnClickListener{}
            bookdoc1.setOnClickListener{}
            bookdoc1.setOnClickListener{}
    }
}