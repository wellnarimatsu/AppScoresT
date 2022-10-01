package br.com.appscorest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.appscorest.databinding.ActivityTenisBinding

class Tenis : AppCompatActivity() {
    private val binding by lazy {
        ActivityTenisBinding.inflate(layoutInflater)

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        title = "Tênis"
        var pntTime1 = 0
        var pntTime2 = 0

        var gameTime1 = 0
        var gameTime2 = 0

        var setTime1 = 0
        var setTime2 = 0


        //PLACAR TIME 1






    }
}

