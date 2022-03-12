package com.example.study03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.numberView)
        val reset = findViewById<Button>(R.id.resetBtn)
        val remove = findViewById<Button>(R.id.removeBtn)
        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btn10 = findViewById<Button>(R.id.btn10)
        val btn11 = findViewById<Button>(R.id.btn11)

        reset.setOnClickListener{textView.text = ""}
        remove.setOnClickListener{
            var str = textView.text.toString()

            str = str.substring(0, str.length - 1)
            textView.setText(str)
        }
        btn0.setOnClickListener{textView.append("0")}
        btn1.setOnClickListener{textView.append("1")}
        btn2.setOnClickListener{textView.append("2")}
        btn3.setOnClickListener{textView.append("3")}
        btn4.setOnClickListener{textView.append("4")}
        btn5.setOnClickListener{textView.append("5")}
        btn6.setOnClickListener{textView.append("6")}
        btn7.setOnClickListener{textView.append("7")}
        btn8.setOnClickListener{textView.append("8")}
        btn9.setOnClickListener{textView.append("9")}
        btn10.setOnClickListener{textView.append("*")}
        btn11.setOnClickListener{textView.append("#")}
    }
}
