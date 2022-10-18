package br.com.appscorest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.databinding.ActivityMainBinding
import br.com.appscorest.extensions.vaiPara
import br.com.appscorest.ui.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(binding.root)
        title ="ScoresT"

        binding.imgFutebol.setOnClickListener{
            vaiPara(Futebol::class.java)
        }

        binding.imgVolei.setOnClickListener{
            vaiPara(Volei::class.java)
        }

        binding.imgTenis.setOnClickListener{
            vaiPara(Tenis::class.java)
        }

        binding.imgTaco.setOnClickListener{
            vaiPara(Taco::class.java)
        }

        binding.imgBasquete.setOnClickListener{
            vaiPara(Basquete::class.java)
        }

        binding.imgTruco.setOnClickListener{
            vaiPara(Truco::class.java)
        }
        binding.imgDadoDigital.setOnClickListener {
            vaiPara(DadoDigital::class.java)
        }

        binding.imgTimer.setOnClickListener {
            vaiPara(SimpleTimer::class.java)
        }
        binding.imgMaisEmbreve.setOnClickListener {
            Snackbar.make(it,"Em Breve Novas Funcionalidades", Snackbar.LENGTH_LONG).show()

        }


    }
}