package br.com.appscorest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.databinding.ActivityDadoDigitalBinding

class DadoDigital : AppCompatActivity() {




    private val binding by lazy {
        ActivityDadoDigitalBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)




        fun zerarDados(){
            var pntDado1 = 0
            var pntDado2 = 0

            binding.valorDado1.text = pntDado1.toString()

            binding.valorDado2.text = pntDado2.toString()


        }



        binding.btnDado1.setOnClickListener {
            var pntDado1 = (1..6).random()

            binding.valorDado1.text = pntDado1.toString()

        }

        binding.btnDado2.setOnClickListener {
            var pntDado2 = (1..6).random()

            binding.valorDado2.text = pntDado2.toString()
        }


        binding.dadoZerar.setOnClickListener {

            zerarDados()
        }





    }


}