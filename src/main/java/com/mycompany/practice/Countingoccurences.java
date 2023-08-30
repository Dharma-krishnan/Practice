/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */
public class Countingoccurences {
    public static void main(String[] args){
        int n=1377777779;
        int count=0;
     while(n>0){
        int rem=n%10;
        if(rem==7){
            count++;
        }
        n=n/10;
        
    }
     System.out.println("Repeated occurences values:"+count);
    
    }
}
