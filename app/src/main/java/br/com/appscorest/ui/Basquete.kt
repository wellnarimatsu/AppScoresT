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
    private var pauseAt = 0L
    private var pontoBasqTime1 = 0
    private var pontoBasqTime2 = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        cronometroBasquete()
        zerarBasq()
        title="Basquete"

        //Placar time 1

        binding.basq1Menos1.setOnClickListener {

            if(pontoBasqTime1 >=1){
                pontoBasqTime1--

                binding.basq1Ponto.text= pontoBasqTime1.toString()
            }




        }
        binding.basq1Mais1.setOnClickListener {
            pontoBasqTime1++
            binding.basq1Ponto.text= pontoBasqTime1.toString()

        }
        binding.btn1BasqMais2.setOnClickListener {
            pontoBasqTime1 = pontoBasqTime1 + 2
            binding.basq1Ponto.text= pontoBasqTime1.toString()

        }
        binding.btn1BasqMais3.setOnClickListener {
            pontoBasqTime1 = pontoBasqTime1 + 3
            binding.basq1Ponto.text= pontoBasqTime1.toString()

        }

        //Placar time 2

        binding.basq2Menos1.setOnClickListener {
            if(pontoBasqTime2>= 1){
                pontoBasqTime2--

                binding.basq2Ponto.text= pontoBasqTime2.toString()
            }



        }
        binding.basq2Mais1.setOnClickListener {
            pontoBasqTime2++
            binding.basq2Ponto.text= pontoBasqTime2.toString()

        }
        binding.btn2BasqMais2.setOnClickListener {
            pontoBasqTime2 = pontoBasqTime2 + 2
            binding.basq2Ponto.text= pontoBasqTime2.toString()

        }
        binding.btn2BasqMais3.setOnClickListener {
            pontoBasqTime2 = pontoBasqTime2 + 3
            binding.basq2Ponto.text= pontoBasqTime2.toString()

        }












    }

    fun zerarBasq(){
        binding.btnZerarBasq.setOnClickListener {
            pontoBasqTime1 = 0
            pontoBasqTime2 = 0

            binding.basq1Ponto.text = pontoBasqTime1.toString()
            binding.basq2Ponto.text = pontoBasqTime2.toString()
        }


    }

    fun cronometroBasquete(){

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