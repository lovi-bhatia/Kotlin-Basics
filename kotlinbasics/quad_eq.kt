package com.example.kotlinbasics

fun main(args: Array<String>) {
    val a = 2.5
    val b = 4.6
    val c = 15.6
    val root1:Double;
    val root2:Double;
    val output:String;

    val determinant = b*b - (4.0*a*c);

    if(determinant > 0 ){
        root1 = (-b + Math.sqrt(determinant)) / (2*a)
        root2 = (-b - Math.sqrt(determinant)) / (2*a)
        output = "root1 = %.2f and root2 = %.2f".format(root1,root2)
    }
    else if(determinant == 0.0){
        root2 = -b/(2*a);
        root1 = root2;

        output = "root1 = root2 = %.2f".format(root1,root2)
    }
    else{
        val realPart = -b/(2*a);
        val imaginaryPart = Math.sqrt(-determinant) / (2*a)

        output = "root1 = %.2f+%.2fi and root2 = %.2f+%.2fi".format(realPart,imaginaryPart,realPart,imaginaryPart)
    }
    println(output)
}