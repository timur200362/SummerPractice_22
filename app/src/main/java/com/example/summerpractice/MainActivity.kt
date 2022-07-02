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
            val name = findViewById<EditText>(R.id.name).text
            val height = findViewById<EditText>(R.id.height).text
            val weight = findViewById<EditText>(R.id.weight).text
            val age  = findViewById<EditText>(R.id.age).text
            val res=findViewById<TextView>(R.id.result)
            if (name.length>0 && height.length>0 && weight.length>0 && age.length>0){
                if(name.length<=50 && height.toString().toInt()<=250 && weight.toString().toFloat()<=250 && age.toString().toInt()<=150 && weight.toString().toFloat()>0 && height.toString().toInt()>0 && age.toString().toInt()>0){
                    val result=(height.toString().toInt()*5)-(age.toString().toInt()*6.8)+(weight.toString().toFloat()*13.7)+name.length+66
                    res.text="$name Ваша норма каллорий:$result"
                }
                else{
                    res.text="Данные введены некорректно"
                    //Qм = ( рост в см х 5) - ( возраст в годах х 6,8) +( вес тела в кг х13,7) + длина имени + 66 , где Qм -количество суточной нормы калорий
                }
            }
            else{
                res.text="Значения не могут быть пустыми"
            }
        }
    }
}