package br.com.appscorest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import br.com.appscorest.R
import br.com.appscorest.databinding.ActivityBasqueteBinding
import java.lang.reflect.Array.get

class Basquete : AppCompatActivity() {
    private val binding by lazy{
        ActivityBasqueteBinding.inflate(layoutInflater)
    }

    lateinit var option : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)







        option = binding.spinner as Spinner
        result = binding.textView as TextView

        val options = arrayOf("10min","15min","20min")
        var dezMin = ""


        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                if(position == 0){
                    dezMin = "10:00"
                    result.text= dezMin

                }else if (position == 1){
                    dezMin = "15:00"
                    result.text = dezMin
                }else{
                    dezMin = "20:00"
                    result.text = dezMin
                }



            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                result.text = "Selecione o Tempo"
            }
        }





    }
}