package br.com.appscorest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.R
import br.com.appscorest.databinding.ActivityBasqueteBinding
import br.com.appscorest.databinding.ActivityTrucoBinding

class Truco : AppCompatActivity() {

    var pontosTime1 = 0
    var pontosTime2 = 0

    private val binding by lazy {
        ActivityTrucoBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title = "Truco"



        binding.bntZerarTruco.setOnClickListener {
            zerarPlacar()
        }


        //Placar time 1


        binding.trucoMais1pnt.setOnClickListener {
            somarPontosTime1(1)
            binding.trucoPntTime1.text = pontosTime1.toString()

        }

        binding.trucoMenos1pnt.setOnClickListener {
            subtrairPontosTime1(1)
            binding.trucoPntTime1.text = pontosTime1.toString()
        }

        binding.btn3trucoTime1.setOnClickListener {
            somarPontosTime1(3)
            binding.trucoPntTime1.text = pontosTime1.toString()

        }

        binding.btn6trucoTime1.setOnClickListener {
            somarPontosTime1(6)
            binding.trucoPntTime1.text = pontosTime1.toString()
        }

        binding.btn9trucoTime1.setOnClickListener {
            somarPontosTime1(9)
            binding.trucoPntTime1.text = pontosTime1.toString()
        }
        binding.btn12trucoTime1.setOnClickListener {
            somarPontosTime1(12)
            binding.trucoPntTime1.text = pontosTime1.toString()
        }


        //Placar time 2

        binding.trucoMais1pntTime2.setOnClickListener {

            somarPontosTime2(1)
            binding.trucoPntTime2.text = pontosTime2.toString()
        }

        binding.trucoMenos1pntTime2.setOnClickListener {
            subtrairPontosTime2(1)
            binding.trucoPntTime2.text = pontosTime2.toString()
        }

        binding.btn3trucoTime2.setOnClickListener {
            somarPontosTime2(3)
            binding.trucoPntTime2.text = pontosTime2.toString()
        }

        binding.btn6trucoTime2.setOnClickListener {
            somarPontosTime2(6)
            binding.trucoPntTime2.text = pontosTime2.toString()
        }

        binding.btn9trucoTime2.setOnClickListener {
            somarPontosTime2(9)
            binding.trucoPntTime2.text = pontosTime2.toString()
        }
        binding.btn12trucoTime2.setOnClickListener {
            somarPontosTime2(12)
            binding.trucoPntTime2.text = pontosTime2.toString()
        }


    }

     fun somarPontosTime1(qnt: Int) {

        pontosTime1 = pontosTime1 + qnt


    }

     fun subtrairPontosTime1(menos1: Int = 1) {

        if (pontosTime1 >= 1) {
            pontosTime1 = pontosTime1 - menos1


        }
    }

    fun somarPontosTime2(qnt: Int) {

        pontosTime2 = pontosTime2 + qnt



    }

     fun subtrairPontosTime2(menos1: Int = 1) {

        if (pontosTime2 >= 1) {
            pontosTime2 = pontosTime2 - menos1


        }
    }

    fun zerarPlacar() {
        var pontosTime1 = 0
        var pontosTime2 = 0
        binding.trucoPntTime1.text = pontosTime1.toString()
        binding.trucoPntTime2.text = pontosTime2.toString()

    }
}

