package br.com.appscorest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.R
import br.com.appscorest.databinding.ActivityBasqueteBinding
import br.com.appscorest.databinding.ActivityTacoBinding

class Taco : AppCompatActivity() {

    private val binding by lazy{
        ActivityTacoBinding.inflate(layoutInflater)

    }

    private var pntTaco1 = 0
    private var pntTaco2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        title="Taco"



        binding.tacoCenter.setOnClickListener {

            pntTaco1 = 0
            binding.tacoPntTime1.text = pntTaco1.toString()

            pntTaco2 = 0
            binding.tacoPntTime2.text = pntTaco2.toString()
        }

        binding.tacoMaisTime1.setOnClickListener {
            pntTaco1++

            binding.tacoPntTime1.text = pntTaco1.toString()


        }

        binding.tacoMenosTime1.setOnClickListener {
            pntTaco1--
            binding.tacoPntTime1.text = pntTaco1.toString()
        }




        //TIME 2

        binding.tacoMaisTime2.setOnClickListener {
            pntTaco2++

            binding.tacoPntTime2.text = pntTaco2.toString()


        }

        binding.tacoMenosTime2.setOnClickListener {
            pntTaco2--
            binding.tacoPntTime2.text = pntTaco2.toString()
        }


    }
}