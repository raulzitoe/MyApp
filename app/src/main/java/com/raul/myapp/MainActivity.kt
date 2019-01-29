package com.raul.myapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.view.accessibility.AccessibilityEventCompat.setAction
import android.view.View


class MainActivity : AppCompatActivity() {
    var toggle: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button1)
        button.setOnClickListener {
            callSnackbar()
            toggle = !toggle
        }
    }

    fun callToast(){
        val text = "Good morning Toronto!"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
    fun callSnackbar(){
        val snackbar = Snackbar.make(
            main_screen, // Parent view
            "Good morning Toronto!", // Message to show
            Snackbar.LENGTH_INDEFINITE // How long to display the message.
        )

        snackbar.setAction("DISMISS") { snackbar.dismiss() }

//        if (toggle){
//            snackbar.dismiss()
//        }
//        else {
            snackbar.show()
//        }

    }


}
