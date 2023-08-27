package com.mycompany.practice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author dharma
 */
//public class test{
//    
//}

public class Inputs {
    public int add(int a,int b){
        int c=a+b;
        return c;
    
}
    public static void main(String[] args){
        Inputs ob = new Inputs();
    Scanner obj =new Scanner(System.in);
    
    int num1= obj.nextInt();
    int num2=obj.nextInt();
    System.out.println("sum="+ob.add(num1,num2));
    
    }
}