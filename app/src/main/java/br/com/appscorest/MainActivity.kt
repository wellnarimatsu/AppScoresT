package br.com.appscorest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.databinding.ActivityFutebolBinding
import br.com.appscorest.databinding.ActivityMainBinding
import br.com.appscorest.extensions.vaiPara
import br.com.appscorest.ui.*

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


    }
}