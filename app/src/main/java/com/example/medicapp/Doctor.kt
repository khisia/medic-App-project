package com.example.medicapp
import android.provider.ContactsContract.CommonDataKinds.Email

class Doctor {
        var name:String = ""
        var phone:String = ""
        var email:String = ""
        var id:String = ""


        constructor(name: String ,email: String, phone: String, id:String){
            this.name = name
            this.phone = phone
            this.email = email
            this .id = id
        }
        constructor()
    }
