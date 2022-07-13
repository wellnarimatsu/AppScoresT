package br.com.appscorest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.databinding.ActivityFutebolBinding
import br.com.appscorest.databinding.ActivityMainBinding
import br.com.appscorest.extensions.vaiPara
import br.com.appscorest.ui.Futebol
import br.com.appscorest.ui.Tenis
import br.com.appscorest.ui.Volei

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


    }
}