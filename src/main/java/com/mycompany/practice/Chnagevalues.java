/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */
public class Chnagevalues {
    public static void main(String[] args){
        int a=10;
        {
            a=100;
            int c=40;
        }
        System.out.println(a);
        System.out.println(c);
    int arr[]={1,3,5,7,9};
    changevalue(arr);
    
}
    static void changevalue(int val[]){
        val[0]=99;
    }
}
