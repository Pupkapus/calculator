package com.example.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var seven: Button
    private lateinit var eight: Button
    private lateinit var nine: Button
    private lateinit var zero: Button
    private lateinit var multiplication: Button
    private lateinit var division: Button
    private lateinit var addition: Button
    private lateinit var subtraction: Button
    private lateinit var equal:Button
    private lateinit var Cleaning: Button

    private var number1 = 0
    private var number2 = 0
    private var result = 0
    private var operation = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.TextView)
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)
        multiplication = findViewById(R.id.multiplication)
        division= findViewById(R.id.division)
        addition = findViewById(R.id.addition)
        subtraction = findViewById(R.id.minus)
        equal = findViewById(R.id.equals)
        Cleaning = findViewById(R.id.cleaning)

        one.setOnClickListener{
            textView.text = if(textView.text == "0") "1" else {textView.text.toString() + "1"}
        }
        two.setOnClickListener{
            textView.text = if(textView.text == "0") "2" else {textView.text.toString() + "2"}
        }
        three.setOnClickListener{
            textView.text = if(textView.text == "0") "3" else {textView.text.toString() + "3"}
        }
        four.setOnClickListener{
            textView.text = if(textView.text == "0") "4" else {textView.text.toString() + "4"}
        }
        five.setOnClickListener{
            textView.text = if(textView.text == "0") "5" else {textView.text.toString() + "5"}
        }
        six.setOnClickListener{
            textView.text = if(textView.text == "0") "6" else {textView.text.toString() + "6"}
        }
        seven.setOnClickListener{
            textView.text = if(textView.text == "0") "7" else {textView.text.toString() + "7"}
        }
        eight.setOnClickListener{
            textView.text = if(textView.text == "0") "8" else {textView.text.toString() + "8"}
        }
        nine.setOnClickListener{
            textView.text = if(textView.text == "0") "9" else {textView.text.toString() + "9"}
        }
        zero.setOnClickListener{
            textView.text = if(textView.text == "0") "0" else {textView.text.toString() + "0"}
        }
        division.setOnClickListener{
            number1 = textView.text.toString().toInt()
            textView.text = "0"
            operation = 1
        }
        multiplication.setOnClickListener{
            number1 = textView.text.toString().toInt()
            textView.text = "0"
            operation = 2
        }
        addition.setOnClickListener{
            number1 = textView.text.toString().toInt()
            textView.text = "0"
            operation = 3
        }
        subtraction.setOnClickListener {
            number1 = textView.text.toString().toInt()
            textView.text = "0"
            operation = 4
        }
        equal.setOnClickListener {
            number2 = textView.text.toString().toInt()
            when(operation){
                1->{
                    result = number1 / number2
                }
                2->{
                    result = number1 * number2
                }
                3->{
                    result = number1 + number2
                }
                4->{
                    result = number1 - number2
                }
            }
            textView.text = result.toString()
            number1 = result
        }
        Cleaning.setOnClickListener {
            textView.text = ""
            number1=0
            number2=0
            operation=0
            result = 0
        }
    }
}
