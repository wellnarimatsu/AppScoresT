package br.com.appscorest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.appscorest.databinding.ActivityTenisBinding

class Tenis : AppCompatActivity() {
    private val binding by lazy {
        ActivityTenisBinding.inflate(layoutInflater)

    }

    private var pntTime1 = 0
    private var pntTime2 = 0

    private var melhor2_time1 = 0
    private var melhor2_time2 = 0


    private var gameTime1 = 0
    private var gameTime2 = 0

    private var setTime1 = 0
    private var setTime2 = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        title = "Tênis"

        //PLACAR TIME 1
        while (gameTime1 >=0 || gameTime1 <=6 || gameTime2>=0 || gameTime2<=6){
            placarTime1()
            placarTime2()

        }


        //ZERAR TUDO

        binding.tenisCenter.setOnClickListener {

        }


        //PLACAR TIME2




    }

    private fun placarTime2() {
        binding.tenisMaisTime2.setOnClickListener {

            pntTime2 = pntTime2 + 15
            binding.tenisPntTime2.text = pntTime2.toString()


            if (pntTime2 > 30) {
                pntTime2 = 40
                binding.tenisPntTime2.text = pntTime2.toString()

                verificarMelhor2()
            }

        }
    }

    private fun placarTime1() {
        binding.tenisMaisTime1.setOnClickListener {

            pntTime1 = pntTime1 + 15
            binding.tenisPntTime1.text = pntTime1.toString()
            if (pntTime1 > 30) {
                pntTime1 = 40
                binding.tenisPntTime1.text = pntTime1.toString()
               verificarMelhor2()
            }

        }
    }

    private fun verificarMelhor2(){

        if (pntTime1 >= 40 && pntTime2 >= 40) {
            binding.tenisMaisTime1.setOnClickListener {

                melhor2_time1++
                binding.melhor2Time1.text = melhor2_time1.toString()


            }

            binding.tenisMaisTime2.setOnClickListener {
                melhor2_time2++
                binding.melhor2Time2.text = melhor2_time2.toString()


            }

            verificarGame()


        }
    }

    private fun verificarGame(){

        if (pntTime1 >= 40 || pntTime2 >= 40) {
            if (melhor2_time1 - melhor2_time2 >= 2) {
                gameTime1++
                binding.gameTime1.text = gameTime1.toString()
                zerarPontos()
                verificarSet()


            } else if (melhor2_time2 - melhor2_time1 >= 2) {
                gameTime2++
                binding.gameTime2.text = gameTime2.toString()
                zerarPontos()
                verificarSet()

            }
        }

    }
        private fun zerarPontos() {

        pntTime1 = 0
        pntTime2 = 0

        binding.tenisPntTime1.text = pntTime1.toString()
        binding.tenisPntTime2.text = pntTime2.toString()




    }

    private fun verificarSet(){

        if (gameTime1 >= 6 || gameTime2 >= 6) {

            if (gameTime1 - gameTime2 >= 2) {
                setTime1++
                binding.tenisSetTime1.text = setTime1.toString()
                gameTime1 = 0
                binding.gameTime1.text = gameTime1.toString()
                pntTime1 = 0
                binding.tenisPntTime1.text = pntTime1.toString()
            } else if (gameTime2 - gameTime1 >= 6) {

                setTime2++
                binding.tenisSetTime2.text = setTime2.toString()
                gameTime2 = 0
                binding.gameTime2.text = gameTime2.toString()
                pntTime2 = 0
                binding.tenisPntTime2.text = pntTime2.toString()
            }


        }


    }


    }




//    private fun contagemTime1() {
//
//        pntTime1 = pntTime1 + 15
//        binding.tenisPntTime1.text = pntTime1.toString()
//        if (pntTime1 > 30) {
//            pntTime1 = 40
//            binding.tenisPntTime1.text = pntTime1.toString()
//
//
//        }
//
//        verificarPontos()
//
//    }
//
//
//    private fun contagemTime2() {
//
//        pntTime2 = pntTime2 + 15
//        binding.tenisPntTime2.text = pntTime2.toString()
//
//
//        if (pntTime2 > 30) {
//            pntTime2 = 40
//            binding.tenisPntTime2.text = pntTime2.toString()
//        }
//
//
//
//
//        verificarPontos()
//
//    }
//
//
//
//    private fun verificarPontos() {
//
//        if (pntTime1 >= 40 && pntTime2 >= 40) {
//            binding.tenisMaisTime1.setOnClickListener {
//
//                pntTime1++
//                binding.tenisPntTime1.text = pntTime1.toString()
//
//
//            }
//
//            binding.tenisMaisTime2.setOnClickListener {
//                pntTime2++
//                binding.tenisPntTime2.text = pntTime2.toString()
//
//
//            }
//
//
//        }
//
//
//    }
//
//    private fun verificarPontosGame() {
//        if (pntTime1 >= 41 || pntTime2 >= 41) {
//            if (pntTime1 - pntTime2 >= 2) {
//                gameTime1++
//                binding.gameTime1.text = gameTime1.toString()
//                zerarPontos()
//
//
//            } else if (pntTime2 - pntTime1 >= 2) {
//                gameTime2++
//                binding.gameTime2.text = gameTime2.toString()
//                zerarPontos()
//
//            }
//        }
//    }
//
//    private fun verificarGameSet() {
//        if (gameTime1 >= 6 || gameTime2 >= 6) {
//
//            if (gameTime1 - gameTime2 >= 2) {
//                setTime1++
//                binding.tenisSetTime1.text = setTime1.toString()
//                gameTime1 = 0
//                binding.gameTime1.text = gameTime1.toString()
//            } else if (gameTime2 - gameTime1 >= 6) {
//
//                setTime2++
//                binding.tenisSetTime2.text = setTime2.toString()
//                gameTime2 = 0
//                binding.gameTime2.text = gameTime2.toString()
//            }
//
//
//        }
//
//
//    }
//
//    private fun zerarPontos() {
//
//        pntTime1 = 0
//        pntTime2 = 0
//
//        binding.tenisPntTime1.text = pntTime1.toString()
//        binding.tenisPntTime2.text = pntTime2.toString()
//
//
//
//
//    }
//
//    private fun zeraTudo() {
//
//
//        pntTime2 = 0
//        pntTime1 = 0
//        gameTime1 = 0
//        gameTime2 = 0
//        setTime1 = 0
//        setTime2 = 0
//
//        binding.tenisPntTime1.text = pntTime1.toString()
//        binding.tenisPntTime2.text = pntTime2.toString()
//
//        binding.gameTime1.text = gameTime1.toString()
//        binding.gameTime2.text = gameTime2.toString()
//
//        binding.tenisSetTime1.text = setTime1.toString()
//        binding.tenisSetTime2.text = setTime2.toString()
//
//
//
//    }
