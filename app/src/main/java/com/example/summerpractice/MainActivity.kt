package com.example.summerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button)
        button?.setOnClickListener{
            val name=findViewById<EditText>(R.id.name).text.toString()
            val height = findViewById<EditText>(R.id.height).text.toString().toInt()
            val weight = findViewById<EditText>(R.id.weight).text.toString().toFloat()
            val age  = findViewById<EditText>(R.id.age).text.toString().toInt()
            val res=findViewById<TextView>(R.id.result)
            if(name.length<0 || name.length>50 || height<0 || height>250 || weight<0 || weight>250 || age<0 || age<150){
                res.text="Данные введены некорректно"
            }
            else{

                val result=(height*5)-(age*6.8)+(weight*13.7)+66
                res.text="$name Ваша норма каллорий:$result"
                //Qм = ( рост в см х 5) - ( возраст в годах х 6,8) +( вес тела в кг х13,7) + 66 , где Qм -количество суточной нормы калорий
            }
        }
    }
}