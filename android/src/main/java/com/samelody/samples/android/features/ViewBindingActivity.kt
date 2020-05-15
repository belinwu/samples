package com.samelody.samples.android.features

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.samelody.samples.android.databinding.ActivityAboutBinding

class ViewBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
