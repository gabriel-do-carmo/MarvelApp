package com.gds.marvelapp.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gds.marvelapp.R
import com.gds.marvelapp.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setupSplash()
        supportActionBar?.hide()
    }

    private fun setupSplash() = with(binding) {
        tvSplash.alpha = 0f
        tvSplash.animate().setDuration(2000).alpha(1f).withEndAction{
            val intent = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}