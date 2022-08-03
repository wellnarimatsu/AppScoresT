package br.com.appscorest.ui

import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import br.com.appscorest.databinding.ActivityFutebolBinding
import br.com.appscorest.extensions.FuncoesPlacar


class Futebol : AppCompatActivity() {
    private val binding by lazy {
        ActivityFutebolBinding.inflate(layoutInflater)

    }

    private var time1 = 0
    private var time2 = 0

    private var pauseAt = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        cronometro()


        title = "Fut"



        //Placar time 1
        binding.futMais1.setOnClickListener {
            time1 = time1 + 1
            binding.pontuacaoFutTime1.text = time1.toString()
        }

        binding.futMenos1.setOnClickListener {



            if (time1 >= 1) {
                time1 = time1 - 1
                binding.pontuacaoFutTime1.text = time1.toString()
            }

        }


        //Placar time2
        binding.fut2Mais1.setOnClickListener {
            time2 = time2 + 1
            binding.pontuacaoFutTime2.text = time2.toString()
        }

        binding.fut2Menos1.setOnClickListener {


            if (time2 >= 1) {
                time2 = time2 - 1
                binding.pontuacaoFutTime2.text = time2.toString()
            }
        }




        binding.btnZerarFut.setOnClickListener {
            zerarPlacar()

        }

    }
    private fun zerarPlacar() {
        time1 = 0
        time2 = 0

        binding.pontuacaoFutTime1.text = time1.toString()
        binding.pontuacaoFutTime2.text = time2.toString()

    }

    private fun cronometro(){

        binding.btnPlayFut.setOnClickListener {
            binding.chronometerFut.base = SystemClock.elapsedRealtime() - pauseAt
            binding.chronometerFut.start()
        }

        binding.btnPauseFut.setOnClickListener {
            pauseAt = SystemClock.elapsedRealtime() - binding.chronometerFut.base
            binding.chronometerFut.stop()
        }

        binding.btnResetFut.setOnClickListener {
            binding.chronometerFut.base = SystemClock.elapsedRealtime()
        }


    }
}