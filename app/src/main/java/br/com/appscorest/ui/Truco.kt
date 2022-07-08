package br.com.appscorest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.appscorest.R
import br.com.appscorest.databinding.ActivityBasqueteBinding
import br.com.appscorest.databinding.ActivityTrucoBinding

class Truco : AppCompatActivity() {

    private val binding by lazy{
        ActivityTrucoBinding.inflate(layoutInflater)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}