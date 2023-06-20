package com.example.miquinielamx.module.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miquinielamx.R
import com.example.miquinielamx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /* Android resources */
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    /*****************************************************************************************
     * LIFECYCLE
     ****************************************************************************************/

    /** Called at create the screen. */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}