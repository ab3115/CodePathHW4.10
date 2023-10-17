package com.example.tipcalc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editText = findViewById<EditText>(R.id.InitialCost)
        val button = findViewById<Button>(R.id.myButton)
        val tipAmountTextView = findViewById<TextView>(R.id.tipAmountTextView)

        button.setOnClickListener {
            val inputValue = editText.text.toString().toDoubleOrNull() ?: 0.0
            val tipAmount = inputValue * 0.15
            tipAmountTextView.text = "Tip Amount: $${"%.2f".format(tipAmount)}"
        }
    }
}