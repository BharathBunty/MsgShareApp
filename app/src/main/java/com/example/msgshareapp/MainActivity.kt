package com.example.msgshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Log.i("MainActivity", "Button was Pressed!")
            Toast.makeText(this , "Button was pressed!" , Toast.LENGTH_SHORT).show()
        }

        buttonSend.setOnClickListener {
            Toast.makeText(this , "Data Send Successfully",Toast.LENGTH_SHORT).show()
            val message: String = etUserMsg.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Message" , message)
            startActivity(intent)
        }

    }
}
