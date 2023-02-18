package com.example.sprint8


import android.content.Intent
import android.net.Uri
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
        val buttonWriteSupport = findViewById<FrameLayout>(R.id.write_support)
        buttonWriteSupport.setOnClickListener {
            val message = getString(R.string.text_message)
            val topic = getString(R.string.topic_message)
            val email = getString(R.string.e_mail)



            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:") // only email apps should handle this
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                putExtra(Intent.EXTRA_SUBJECT, topic)
                putExtra(Intent.EXTRA_TEXT, message)
            }
            startActivity(intent)
             }
        }

    }
}
