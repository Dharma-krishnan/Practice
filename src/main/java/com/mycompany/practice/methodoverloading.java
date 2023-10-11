/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */
class calculator{
    public int sum( int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public int sum(int n1,int n2){
        return n1+n2;
    }
}
public class methodoverloading {
    public static void main(String[] args){
    calculator obj=new calculator();
    int a=obj.sum(7,6);
    System.out.println(a);
}
}