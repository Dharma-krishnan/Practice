/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */
public class FIbo {
    public static void main(String[] args){
        int n=7;
    int  a=0;
     int b=1;
     int count=2;
     while(count < n){
         System.out.print(a);
         
         int temp =b;
         b=b+a;
         a=temp;
           
        count++;
      
     }
         System.out.println(b);
     
     
    }
    
}
