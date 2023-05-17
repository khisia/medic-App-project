package com.example.medicapp

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class BookingForm : AppCompatActivity() {
    lateinit var edtname:EditText
    lateinit var edtphone:EditText
    lateinit var edtemail:EditText
    lateinit var mBtnSubmit:Button
    lateinit var progressDialog: ProgressDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking_form)
        edtname = findViewById(R.id.mTvBkName)
        edtphone = findViewById(R.id.mTvBkPhone)
        edtemail = findViewById(R.id.mTvBkEmail)
        mBtnSubmit = findViewById(R.id.BtnBkSubmit)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Submitting")
        progressDialog.setMessage("Please wait...")

        mBtnSubmit.setOnClickListener {
            var name = edtname.text.toString().trim()
            var email = edtphone.text.toString().trim()
            var phone = edtemail.text.toString().trim()
            var id = System.currentTimeMillis().toString()
            // Check if the user is submitting empty fields
            if (name.isEmpty()){
                edtname.setError("Please fill this input")
                edtname.requestFocus()
            }else if (phone.isEmpty()){
                edtemail.setError("Please fill out this input")
                edtemail.requestFocus()
            }else{
                //Proceed to save
                var user = Doctor(name, phone,email,id)
                //create a reference to the FirebaseDatabase
                var ref = FirebaseDatabase.getInstance().getReference().
                child("Users/"+id)
                progressDialog.show()
                ref.setValue(user).addOnCompleteListener {
                    progressDialog.dismiss()
                    if (it.isSuccessful){
                        Toast.makeText(this,"Doctor Booked Successfully",
                            Toast.LENGTH_LONG).show()
                    }else{
                        Toast.makeText(this,"Doctor booking failed",
                            Toast.LENGTH_LONG).show()
                    }
                }

            }
        }
    }
}