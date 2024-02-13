package com.example.test_x1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var sendButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnviar : Button = findViewById(R.id.botonEnviar)
        val editText : EditText = findViewById(R.id.textoEditable)


        btnEnviar.setOnClickListener{
            val name = editText.text.toString()
            val intent = Intent(this,SecondActivity::class.java).apply {
                putExtra("name", name)
            }
            startActivity(intent)
        }




    }
}
