package com.example.test_x1

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameRecibido = intent.getStringExtra("name")
        val nameTxt : TextView = findViewById(R.id.txt_name)

        nameTxt.text = "Welcome $nameRecibido!"
    }


}
