package com.example.kotlinbasics

fun main() {
//    TODO: Add new function
//    in bottom bar we can todo option

//    type String
    val myName = "Lovish";
//    type int
    val myAge = 31;

//  Integer Types

//  Byte: 8 bit
    val myByte: Byte = 124;
//  Short: 16 bit
    val myShort: Short = 12345;
//    Int : 32 bit
    val myInt: Int = 123456789;
//    Long : 64 bit
    val myLong: Long = 123_456_789_012_345;

//    Double type
//    Float : 32 bit
    val myFloat: Float = 23.23F;
//    Double : 64 bit
    val myDouble: Double = 2345.45;

//    Float is used in games like stuff for fast processing over precision

//    Booleans
//    Boolean type is used to represent logic value
//    It can have two possible values true and false
    var isSunny: Boolean = true;
    isSunny = false;

//    Characters
    var letterChar: Char = 'A';
    var digitChar = '1'; //'$'

//    String
    val myStr: String = "Hello World";
    val firstChar = myStr[0];
    val lastChar = myStr[myStr.length - 1];


}