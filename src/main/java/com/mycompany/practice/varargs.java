/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;
import java.util.Arrays;
/**
 *
 * @author dharma
 */
public class varargs {
    
    static void varargs(int ...a){
        System.out.println(Arrays.toString(a));
    }
    
    
    
    public static void main(String[] args){
           varargs(23,123,34,12,233,32);
    }
    
}
