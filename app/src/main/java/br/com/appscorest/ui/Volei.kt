package br.com.appscorest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.appscorest.R
import br.com.appscorest.databinding.ActivityBasqueteBinding
import br.com.appscorest.databinding.ActivityVoleiBinding

class Volei : AppCompatActivity() {
    private val binding by lazy {
        ActivityVoleiBinding.inflate(layoutInflater)

    }
    var pntTime1 = 0
    var pntTime2 = 0

    var setTime1 = 0
    var setTime2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title="Volei"

        // BTN ZERAR TUDO

        binding.voleyZerar.setOnClickListener {
            zerarTudo()
        }



        // PLACAR TIME 1


        binding.mais1VoleiTime1.setOnClickListener {
            pntTime1++
            binding.pontuacaoVoleiTime1.text = pntTime1.toString()

//            binding.vezTime1.visibility = View.VISIBLE
//            binding.vezTime2.visibility = View.GONE
            verificarSet()
        }

        binding.menos1VoleiTime1.setOnClickListener {
            if (pntTime1 >= 0) {

                pntTime1--
                binding.pontuacaoVoleiTime1.text = pntTime1.toString()
            }

        }


//         PLACAR TIME 2


        binding.mais1VoleiTime2.setOnClickListener {

            pntTime2++
            binding.pontuacaoVoleiTime2.text = pntTime2.toString()

//            binding.vezTime2.visibility = View.VISIBLE
//            binding.vezTime1.visibility = View.GONE
            verificarSet()

        }

        binding.menos1VoleiTime2.setOnClickListener {

            if (pntTime2 >= 1) {

                pntTime2--
                binding.pontuacaoVoleiTime2.text = pntTime2.toString()
            }
        }


    }

    fun zeraPlacar() {
        pntTime1 = 0
        pntTime2 = 0

        binding.pontuacaoVoleiTime1.text = pntTime1.toString()
        binding.pontuacaoVoleiTime2.text = pntTime2.toString()
    }

    fun verificarSet() {
        if (pntTime1 >= 25 || pntTime2 >= 25) {
            if (pntTime1 - pntTime2 >= 2) {
                setTime1++
                binding.setTime1.text = setTime1.toString()
                zeraPlacar()

            } else if (pntTime2 - pntTime1 >= 2) {
                setTime2++
                binding.setTime2.text = setTime2.toString()
                zeraPlacar()
            }
        }
    }

    fun zerarTudo() {

        pntTime1 = 0
        pntTime2 = 0
        setTime1 = 0
        setTime2 = 0

        binding.pontuacaoVoleiTime1.text = pntTime1.toString()
        binding.pontuacaoVoleiTime2.text = pntTime2.toString()
        binding.setTime1.text = setTime1.toString()
        binding.setTime2.text = setTime2.toString()


    }


}