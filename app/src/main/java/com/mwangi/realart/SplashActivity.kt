package com.mwangi.realart


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // Delay for 2 seconds
        Handler().postDelayed({
            // Check if the user is already logged in
            val intent = Intent(this, GetStartedActivity::class.java)
            startActivity(intent)
            finish() // prevent the user from coming back to the SplashActivity after going to the getstarted activity
        }, 2000) // 2000 milliseconds = 2 seconds
    }
}
