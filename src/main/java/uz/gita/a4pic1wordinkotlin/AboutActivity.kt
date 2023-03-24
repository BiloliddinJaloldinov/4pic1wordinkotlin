package uz.gita.a4pic1wordinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backBtn = findViewById<ImageView>(R.id.btnBackInAbout)
        backBtn.setOnClickListener{
            finish()
        }
    }
}