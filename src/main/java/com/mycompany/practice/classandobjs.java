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
    static int sub(int x,int y){
        return x-y;
    }
    public static void main(String[] args){
      calci obj=new calci();
      int f=  obj.add(8,19); // using static method from other class needs to create object
        System.out.println(f);
    sub(4,2); //using static method from the main class which not uses to create object for it without object we can use this method(shared)
    
    
    
    }
    
}
