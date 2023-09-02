package com.mycompany.practice;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dharma
 */
public class methods {
    public static void main(String[] args){
       int x=100;
        int y=200;
       swap(x,y);
    }
    static void swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
       
    }
    
}
