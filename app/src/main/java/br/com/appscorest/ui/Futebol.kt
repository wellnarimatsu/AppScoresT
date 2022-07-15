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

        title="Fut"

        var time1 = 0
        var time2 = 0


        fun zerarPlacar(){
            time1 = 0
            time2 = 0

            binding.pontuacaoTime1.text = time1.toString()
            binding.pontuacaoTime2.text = time2.toString()

        }



            binding.imgMain1pnt.setOnClickListener{
                time1 = time1 + 1
                binding.pontuacaoTime1.text = time1.toString()
            }

            binding.imgMenos1pnt.setOnClickListener{


                if(time1 >= 1){
                    time1 = time1 - 1
                    binding.pontuacaoTime1.text = time1.toString()
                }

            }



            binding.img2Mais1pnt.setOnClickListener{
                time2 = time2 + 1
                binding.pontuacaoTime2.text = time2.toString()
            }

            binding.img2Menos1pnt.setOnClickListener{


                if(time2 >=1){
                    time2 = time2 - 1
                binding.pontuacaoTime2.text = time2.toString()
                }
            }




        binding.btnZerar.setOnClickListener{
             zerarPlacar()

        }

    }
}