package com.example.kotlinbasics

//import java.util.ArrayList
//fun main(args:Array<String>){
//    val list1 = ArrayList<String>();
////    adding single element
//    list1.add("a");
//    list1.add("c");
//
//    val list2 = ArrayList<String>();
//    list2.add("b");
//
//    val joined = ArrayList<String>();
//
////    adding all elements of list to another list
////    joined.addAll(list1);
//    joined.addAll(list2);
//
//    joined.addAll(0,list1);
//
//    println("list1: $list1 ");
//    println("list2: $list2 ");
//    println("Joined List: $joined ");
//}
//import java.util.ArrayList
//import org.apache.commons.collections4.ListUtils;

//fun main(){
//    val list1 = ArrayList<String>();
////    adding single element
//    list1.add("a");
//    list1.add("c");
//
//    val list2 = ArrayList<String>();
//    list2.add("b");
//
//    val joined = Listutils.union(list1,list2);
//}

import java.util.ArrayList
//fun main(){
////    arraylist of vowels
//    val vowels_list : List<String> = listOf("a","e","i","o","u");
////    converting array list to array
//    val vowels_array: Array<String> = vowels_list.toTypedArray();
////    prinitng
//    vowels_array.forEach{print(it)}
//}

//fun main(){
////    arraylist of vowels
//    val vowels_array : Array<String> = arrayOf("a","e","i","o","u");
////    converting array list to array
//    val vowels_list: List<String> = vowels_array.toList();
////    prinitng
//    vowels_list.forEach{print(it)}
//}

//Map to list
import java.util.HashMap
fun main(){
    val map = HashMap<Int,String>();
    map.put(1,"a");
    map.put(2,"b");
    map.put(3,"c");
    map.put(4,"d");
    map.put(5,"e");

    val keyList = ArrayList(map.keys);
    val valueList = ArrayList(map.values);
    println("keylist: $keyList");
    println("valuelist: $valueList");
}