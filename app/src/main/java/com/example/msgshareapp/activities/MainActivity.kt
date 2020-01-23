package com.example.msgshareapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.msgshareapp.AppConstants
import com.example.msgshareapp.R
import com.example.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Log.i(TAG, getString(R.string.button_pressed))
            showToast(getString(R.string.button_pressed))
        }

        buttonSend.setOnClickListener {
            showToast(getString(R.string.data_success))
            val message: String? = etUserMsg.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(AppConstants.USER_MESG_KEY , message)
            startActivity(intent)
        }

        btnShare.setOnClickListener {
            val message: String? = etUserMsg.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT , message)
            intent.type = getString(R.string.data_type_text)
            startActivity(Intent.createChooser(intent,getString(R.string.share_app)))
        }

        btnRecView.setOnClickListener {
            val intentRec = Intent(this , HobbiesActivity::class.java)
            startActivity(intentRec)
        }

    }
}
