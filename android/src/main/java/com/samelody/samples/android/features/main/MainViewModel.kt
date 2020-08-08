package com.samelody.samples.android.features.main

import android.app.Person
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _person: MutableLiveData<Person> = MutableLiveData<Person>()
    val person: LiveData<Person> get() = _person
}
