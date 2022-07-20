package br.com.appscorest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.R
import br.com.appscorest.databinding.ActivityBasqueteBinding
import br.com.appscorest.databinding.ActivityTrucoBinding

class Truco : AppCompatActivity() {

    private val binding by lazy {
        ActivityTrucoBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var pntTime1 = 0
        var pntTime2 = 0

        fun zerarPlacar(){
            pntTime1 = 0
            pntTime2 = 0
            binding.trucoPntTime1.text = pntTime1.toString()
            binding.trucoPntTime2.text = pntTime2.toString()

        }

        binding.bntZerarTruco.setOnClickListener {
            zerarPlacar()
        }


        //Placar time 1


        binding.trucoMais1pnt.setOnClickListener {
            pntTime1 = pntTime1 + 1
            binding.trucoPntTime1.text = pntTime1.toString()

        }

        binding.trucoMenos1pnt.setOnClickListener {

            if (pntTime1 >= 1) {
                pntTime1 = pntTime1 - 1
                binding.trucoPntTime1.text = pntTime1.toString()
            }
        }

        binding.btn3trucoTime1.setOnClickListener {
            pntTime1 = pntTime1 +3
            binding.trucoPntTime1.text = pntTime1.toString()

        }

        binding.btn6trucoTime1.setOnClickListener {
            pntTime1 = pntTime1 + 6
            binding.trucoPntTime1.text = pntTime1.toString()
        }

        binding.btn9trucoTime1.setOnClickListener {
            pntTime1 = pntTime1 + 9
            binding.trucoPntTime1.text = pntTime1.toString()
        }
        binding.btn12trucoTime1.setOnClickListener {
            pntTime1 = pntTime1 + 12
            binding.trucoPntTime1.text = pntTime1.toString()
        }


        //Placar time 2

        binding.trucoMais1pntTime2.setOnClickListener {

            pntTime2 = pntTime2 + 1
            binding.trucoPntTime2.text = pntTime2.toString()
        }

        binding.trucoMenos1pntTime2.setOnClickListener {
            if (pntTime2 >= 1) {
                pntTime2 = pntTime2 - 1
                binding.trucoPntTime2.text = pntTime2.toString()
            }
        }

        binding.btn3trucoTime2.setOnClickListener {
            pntTime2 = pntTime2 +3
            binding.trucoPntTime2.text = pntTime2.toString()

        }

        binding.btn6trucoTime2.setOnClickListener {
            pntTime2 = pntTime2 + 6
            binding.trucoPntTime2.text = pntTime2.toString()
        }

        binding.btn9trucoTime2.setOnClickListener {
            pntTime2 = pntTime2 + 9
            binding.trucoPntTime2.text = pntTime2.toString()
        }
        binding.btn12trucoTime2.setOnClickListener {
            pntTime2 = pntTime2 + 12
            binding.trucoPntTime2.text = pntTime2.toString()
        }
    }
}