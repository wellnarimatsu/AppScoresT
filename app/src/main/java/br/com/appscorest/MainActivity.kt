package br.com.appscorest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.databinding.ActivityFutebolBinding
import br.com.appscorest.databinding.ActivityMainBinding
import br.com.appscorest.extensions.vaiPara
import br.com.appscorest.ui.Futebol

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.imgFutebol.setOnClickListener{
            vaiPara(Futebol::class.java)
        }


    }
}