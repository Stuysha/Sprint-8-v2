package com.example.sprint8


import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
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

//        val intent = Intent(this@MainActivity, SettingsActivity::class.java)
//        startActivity(intent)

        val buttonShareApp = findViewById<FrameLayout>(R.id.share_app)
        buttonShareApp.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(
                Intent.EXTRA_TEXT,
                 getString(R.string.share_app_step2)
            )
            startActivity(intent)
        }
    }
}