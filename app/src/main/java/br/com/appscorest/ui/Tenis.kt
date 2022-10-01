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

    private var gameTime1 = 0
    private var gameTime2 = 0

    private var setTime1 = 0
    private var setTime2 = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        contagemNormalTime1()

        contagemNormalTime2()

        binding.tenisCenter.setOnClickListener {
            pntTime1 = 0
            binding.tenisPntTime1.text = pntTime1.toString()
            pntTime2 = 0
            binding.tenisPntTime2.text = pntTime2.toString()
            gameTime1 = 0
            binding.gameTime1.text = gameTime1.toString()
            gameTime2 = 0
            binding.gameTime2.text = gameTime2.toString()
            setTime1 = 0
            binding.tenisSetTime1.text = setTime1.toString()
            setTime2 = 0
            binding.tenisSetTime2.text = setTime2.toString()

        }


    }

    private fun contagemNormalTime1() {


        binding.tenisMaisTime1.setOnClickListener {

            if (pntTime1 < 40) {
                pntTime1 += 15
                binding.tenisPntTime1.text = pntTime1.toString()

                if (pntTime1 > 30) {
                    pntTime1 = 40
                    binding.tenisPntTime1.text = pntTime1.toString()
                    verificarGame()

                }
            } else if (pntTime1 >= 40 && pntTime2 >= 40) {
                contagemVantagemTime1()

            }else if (pntTime1 == 40 && pntTime2 < 40){
                pntTime1 ++
                binding.tenisPntTime1.text = pntTime1.toString()
                verificarGame()
            }


        }

        binding.tenisMenosTime1.setOnClickListener {
            pntTime1 -= 5
            binding.tenisPntTime1.text = pntTime1.toString()

        }


    }

    private fun contagemNormalTime2() {

        binding.tenisMaisTime2.setOnClickListener {
            if (pntTime2 < 40) {
                pntTime2 += 15
                binding.tenisPntTime2.text = pntTime2.toString()
                if (pntTime2 > 30) {
                    pntTime2 = 40
                    binding.tenisPntTime2.text = pntTime2.toString()
                    verificarGame()



                }
            } else if (pntTime2 >= 40 && pntTime1 >= 40) {
                contagemVantagemTime2()

            }else if (pntTime2 == 40 && pntTime1 < 40){
                pntTime2 ++
                binding.tenisPntTime2.text = pntTime2.toString()
                verificarGame()
            }

            binding.tenisMenosTime2.setOnClickListener {
                pntTime2 -= 5
                binding.tenisPntTime2.text = pntTime2.toString()
            }





        }


    }


    private fun contagemVantagemTime1() {

        pntTime1++
        binding.tenisPntTime1.text = pntTime1.toString()
        if (pntTime1 - pntTime2 >= 2) {
            gameTime1++
            binding.gameTime1.text = gameTime1.toString()
            zeraPlacar()

        } else if (pntTime2 - pntTime1 >= 2) {
            gameTime2++
            binding.gameTime2.text = gameTime2.toString()
            zeraPlacar()
        }


    }

    private fun contagemVantagemTime2() {

        pntTime2++
        binding.tenisPntTime2.text = pntTime2.toString()

        if (pntTime1 - pntTime2 >= 2) {
            gameTime1++
            binding.gameTime1.text = gameTime1.toString()
            zeraPlacar()
            verificarSet()

        } else if (pntTime2 - pntTime1 >= 2) {
            gameTime2++
            binding.gameTime2.text = gameTime2.toString()
            zeraPlacar()
            verificarSet()
        }


    }


    private fun verificarGame() {
        if (pntTime1 >= 40 || pntTime2 >= 40) {
            if (pntTime1 - pntTime2 > 10) {
                gameTime1++
                binding.gameTime1.text = gameTime1.toString()
                zeraPlacar()
                verificarSet()

            } else if (pntTime2 - pntTime1 > 10) {
                gameTime2++
                binding.gameTime2.text = gameTime2.toString()
                zeraPlacar()
                verificarSet()
            }
        }


    }
    private fun verificarSet(){
        if(gameTime1 >= 6 || gameTime2 >= 6){
            if(gameTime1 - gameTime2 > 2){
                setTime1++
                binding.tenisSetTime1.text = setTime1.toString()
                gameTime1 = 0
                binding.gameTime1.text = gameTime1.toString()
                gameTime2 = 0
                binding.gameTime2.text = gameTime2.toString()
            }else if (gameTime2 - gameTime1 >2){
                setTime2++
                binding.tenisSetTime2.text = setTime2.toString()
                gameTime2 = 0
                binding.gameTime2.text = gameTime2.toString()
                gameTime1 = 0
                binding.gameTime1.text = gameTime1.toString()
            }
        }

    }

    private fun zeraPlacar() {
        pntTime1 = 0
        pntTime2 = 0

        binding.tenisPntTime1.text = pntTime1.toString()
        binding.tenisPntTime2.text = pntTime2.toString()

    }
}

