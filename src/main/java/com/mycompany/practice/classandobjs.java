/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */



class calci{
    static int add(int x,int y){
        return x+y;
    }
}
public class classandobjs {
    public static void main(String[] args){
      calci obj=new calci();
      int f=  obj.add(8,19);
        System.out.println(f);
     }
    
}
