/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problems;

/**
 *
 * @author dharma
 */
public class Palindrome {
    public static void main(String[] args){
        int n=121,sum=0,temp,r;
        temp=n;
        while(n>0){
          r=n%10;
          sum = sum*10+r;
          n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome number");
        }else
            System.out.println("not a palindrome");
       
    }
    
    
}
