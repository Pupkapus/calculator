<p align = "center">МИНИСТЕРСТВО НАУКИ И ВЫСШЕГО ОБРАЗОВАНИЯ
РОССИЙСКОЙ ФЕДЕРАЦИИ
ФЕДЕРАЛЬНОЕ ГОСУДАРСТВЕННОЕ БЮДЖЕТНОЕ
ОБРАЗОВАТЕЛЬНОЕ УЧРЕЖДЕНИЕ ВЫСШЕГО ОБРАЗОВАНИЯ
«САХАЛИНСКИЙ ГОСУДАРСТВЕННЫЙ УНИВЕРСИТЕТ»</p>
<br>
<p align = "center">Институт естественных наук и техносферной безопасности</p>
<p align = "center">Кафедра информатики</p>
<p align = "center">Пак Никита Витальевич</p>
<br>
<p align = "center">Лабораторная работа №-</p>
<p align = "center">«Создание простого калькулятора»</p>
<p align = "center">01.03.02 Прикладная математика и информатика</p>
<br>
<p align = "right" >Научный руководитель</p>
<p align = "right" >Соболев Евгений Игоревич</p>
<p align = "center" >Южно-Сахалинск</p>
<p align = "center" >2023 г.</p>
<p align = "center" ><b>ВВЕДЕНИЕ</b></p>
<p>Kotlin (Ко́тлин) — статически типизированный, объектно-ориентированный язык программирования, работающий поверх Java Virtual Machine и разрабатываемый компанией JetBrains. Также компилируется в JavaScript и в исполняемый код ряда платформ через инфраструктуру LLVM. Язык назван в честь острова Котлин в Финском заливе, на котором расположен город Кронштадт</p>
<p>Авторы ставили целью создать язык более лаконичный и типобезопасный, чем Java, и более простой, чем Scala. Следствием упрощения по сравнению со Scala стали также более быстрая компиляция и лучшая поддержка языка в IDE. Язык полностью совместим с Java, что позволяет Java-разработчикам постепенно перейти к его использованию; в частности, язык также встраивается Android, что позволяет для существующего Android-приложения внедрять новые функции на Kotlin без переписывания приложения целиком.</p>
<p align = "center" >РЕШЕНИЕ ЗАДАЧ</p>

<p align = "center" >Калькулятор</p>

<p align = "center" >activity_main.xml</p>

```kotlin

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="610dp"
        android:orientation="horizontal"></LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent">

        <TextView
            android:id="@+id/TextView"
            android:layout_width="match_parent"
            android:layout_height="71dp"
            android:layout_marginStart="24dp"
            android:layout_marginTop="8dp"
            android:layout_marginEnd="24dp"
            android:layout_marginBottom="8dp"
            android:textAlignment="center"
            android:textSize="30dp" />


    </LinearLayout>

    <LinearLayout
        android:layout_width="453dp"
        android:layout_height="75dp"
        android:orientation="horizontal">

        <Button
            android:id="@+id/one"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="1" />

        <Button
            android:id="@+id/two"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="2" />


        <Button
            android:id="@+id/three"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="3" />

        <Button
            android:id="@+id/division"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="/" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="76dp"
        android:orientation="horizontal">

        <Button
            android:id="@+id/four"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="4" />

        <Button
            android:id="@+id/five"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="5" />

        <Button
            android:id="@+id/six"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="6" />

        <Button
            android:id="@+id/multiplication"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="*" />
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="75dp"
        android:orientation="horizontal">

        <Button
            android:id="@+id/seven"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="7" />

        <Button
            android:id="@+id/eight"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="8" />

        <Button
            android:id="@+id/nine"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="9" />

        <Button
            android:id="@+id/addition"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="+" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="529dp"
        android:orientation="horizontal">

        <Button
            android:id="@+id/zero"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="0" />

        <Button
            android:id="@+id/minus"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="-" />

        <Button
            android:id="@+id/equals"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="=" />

        <Button
            android:id="@+id/cleaning"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="C" />


    </LinearLayout>
</LinearLayout>
```

***

<p align = "center" >MainActivity</p>

```kotlin

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

```

![Screenshot](https://github.com/Pupkapus/calculator/blob/main/calculator.png)

***

<p align = "center" >ВЫВОД</p>
<p>Подводя итог всему сказанному, могу сделать вывод, что, поработав c kotlin, создал простой калькулятор.</p>
