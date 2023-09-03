/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dharma
 */
public class Factorial {
    public static void main(String[] args){
        int num=5;
        factorial(num);
        
    }
    static void factorial(int num){
       
        int res=1;
        for(int i=2;i<=num;i++){
            
            res*=i;
            
        }
        System.out.println(res);
    }
}
