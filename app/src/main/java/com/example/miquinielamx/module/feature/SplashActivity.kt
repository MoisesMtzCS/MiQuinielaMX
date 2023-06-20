package com.example.miquinielamx.module.feature

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.miquinielamx.databinding.ActivitySplashBinding
import com.example.miquinielamx.module.feature_tools.context.navigateToActivityClearTop
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    /* Android resources */
    private val binding by lazy { ActivitySplashBinding.inflate(layoutInflater) }

    /*****************************************************************************************
     * LIFECYCLE
     ****************************************************************************************/

    /** Called at create the screen. */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        executeSplash()
    }

    /*****************************************************************************************
     * VIEWS - ACTIONS
     ****************************************************************************************/

    /** Execute the splash. */
    private fun executeSplash() {
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            navigateToActivityClearTop(MainActivity::class.java)
        }, 3000)
    }

}