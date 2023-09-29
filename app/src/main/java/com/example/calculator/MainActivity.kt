package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var opChar:String = ""
    var num1:Int = 0
    var num2: String = ""
    fun num(view: View){
        val btn = view as Button
        val tv: TextView = findViewById(R.id.textView)
        when(btn.id){
        R.id.button24 -> tv.append("0")
            R.id.button19 -> tv.append("1")
            R.id.button20 -> tv.append("2")
            R.id.button21 -> tv.append("3")
            R.id.button15 -> tv.append("4")
            R.id.button16 -> tv.append("5")
            R.id.button17 -> tv.append("6")
            R.id.button3 -> tv.append("7")
            R.id.button4 -> tv.append("8")
            R.id.button5 -> tv.append("9")
            R.id.button2 -> tv.setText("0").toString()
            R.id.button -> {tv.append("/")
                            opChar = "/"
                            //num1 = (tv.getText())
                            tv.setText("0").toString()
            }
            R.id.button6 -> {tv.append("-")
                            opChar = "-"}
            R.id.button18 -> {tv.append("*")
                            opChar = "*"}
            R.id.button22 -> {tv.append("+")
                            opChar = "+"
                            //num1 = tv.getText().toString()
                            tv.setText("").toString()}
        }
    }

    fun btnEquals(view: View){
        val btn = view as Button
        val tv: TextView = findViewById(R.id.textView)
        num2 = tv.getText().toString()
        when(opChar){
       // "+" -> tv.text =
        }
    }
}