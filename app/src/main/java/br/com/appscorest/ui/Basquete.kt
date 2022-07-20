package br.com.appscorest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.widget.*
import br.com.appscorest.R
import br.com.appscorest.databinding.ActivityBasqueteBinding
import java.lang.reflect.Array.get

class Basquete : AppCompatActivity() {
    private val binding by lazy {
        ActivityBasqueteBinding.inflate(layoutInflater)
    }
    var pauseAt = 0L


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnStartBasquete.setOnClickListener {
            binding.timerCount.base = SystemClock.elapsedRealtime() - pauseAt
            binding.timerCount.start()
        }

        binding.btnPauseBasquete.setOnClickListener {
            pauseAt = SystemClock.elapsedRealtime() - binding.timerCount.base
            binding.timerCount.stop()
        }

        binding.btnReplayBasquete.setOnClickListener {
            binding.timerCount.base = SystemClock.elapsedRealtime()
        }


    }
}