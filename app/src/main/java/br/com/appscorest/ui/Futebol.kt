package br.com.appscorest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.appscorest.databinding.ActivityFutebolBinding

class Futebol : AppCompatActivity() {
    private val binding by lazy{
        ActivityFutebolBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var time1 = 0
        var time2 = 0


        binding.pontuacaoTime1.setOnClickListener{
            time1 = time1 + 1
            binding.pontuacaoTime1.text = time1.toString()

        }

        binding.pontuacaoTime2.setOnClickListener{
            time2 = time2 + 1
            binding.pontuacaoTime2.text = time2.toString()

        }

    }



}