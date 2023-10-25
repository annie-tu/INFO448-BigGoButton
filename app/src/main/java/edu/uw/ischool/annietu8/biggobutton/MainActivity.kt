package edu.uw.ischool.annietu8.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private var clickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            clickButton()
        }
    }

    private fun clickButton() {
        clickCount++
        val newText = "You have pushed me $clickCount time${if (clickCount == 1) "" else "s"}!"
        button.text = newText
    }
}