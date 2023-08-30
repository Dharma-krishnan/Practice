/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */
public class reverse {
    public static void main(String[] args){
    int num=842;
    int ans=0;
    
    while(num > 0){
    int rem=num%10;
    num=num/10;
    ans=ans*10+rem;
}
    System.out.print(ans);
    
    } 
}
