package com.example.kotlinbasics

fun main() {
//    Arithmetic operators (+,-,*,/,%)
    var result = 5 + 3
    result = result / 2;
//    or
    result /= 2;
    println(result)

    result *= 2;
    println(result)

//    modulus or remainder operator
    result = 15 % 3
    println(result)

    val a = 5.0;
    val b = 3;

    var myresult: Double = (a / b).toDouble();
    println(myresult)
//    we can't divide double by Int


//    Assignment operators
//    +=, -=, /=, *=, %=

//    Increment and Decrement operators
    var myNum = 1;
    myNum++;
    println(myNum);
    println(myNum++);
    println(++myNum);
}
