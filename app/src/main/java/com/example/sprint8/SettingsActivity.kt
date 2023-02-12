package com.example.sprint8


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_screen)
        val buttonArrow = findViewById<Toolbar>(R.id.arrow)
        buttonArrow.setOnClickListener {
            onBackPressed()
        }
    }
}