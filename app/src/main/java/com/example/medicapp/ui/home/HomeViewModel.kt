package com.example.medicapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Medic Hospital conducts numerous major and minor surgeries and draws together faculty and staff from several departments enhance patient care and research."
    }
    val text: LiveData<String> = _text
}