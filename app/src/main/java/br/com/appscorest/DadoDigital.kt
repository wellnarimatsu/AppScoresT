package br.com.appscorest

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


    }
}