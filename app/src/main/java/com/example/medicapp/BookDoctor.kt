package com.example.medicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.cardview.widget.CardView

class BookDoctor() : AppCompatActivity(), Parcelable {
    lateinit var bookdoc1:CardView
    lateinit var bookdoc2:CardView
    lateinit var bookdoc3:CardView

    constructor(parcel: Parcel) : this() {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BookDoctor> {
        override fun createFromParcel(parcel: Parcel): BookDoctor {
            return BookDoctor(parcel)
        }

        override fun newArray(size: Int): Array<BookDoctor?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_doctor)
            bookdoc1 = findViewById(R.id.book1)
            bookdoc2 = findViewById(R.id.book2)
            bookdoc3 = findViewById(R.id.book2)
        // SetOnCLIckListener
            bookdoc1.setOnClickListener{
                    var tembea = Intent(this, BookingForm::class.java)
                    startActivity(tembea)
            }
            bookdoc2.setOnClickListener{
                    var tembea = Intent(this, BookingForm::class.java)
                    startActivity(tembea)
            }
            bookdoc3.setOnClickListener{
                    var tembea = Intent(this, BookingForm::class.java)
                    startActivity(tembea)
            }
    }
}