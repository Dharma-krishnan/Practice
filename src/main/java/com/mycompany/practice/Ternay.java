/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */
 class ternary{
    public int greater(int x,int y){
        int res=(x>y)?x:y;
        return res;
    }
}
public class Ternay {
    public static void main(String[] args){
        ternary obj =new ternary();
       int a=10,b=20;
      int res = obj.greater(a, b);
       System.out.println("Greater is "+res);
       
       
    }
    
}
