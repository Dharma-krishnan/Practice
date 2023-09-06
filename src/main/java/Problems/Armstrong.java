/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problems;

/**
 *
 * @author dharma
 */
public class Armstrong {
    public static void main(String[] args){
        int num=153;
        int ans=0;
        
        while(num>0){
           int rem = num % 10;
           int cube=rem*rem*rem;
           ans+=cube;
           num=num/10;
//           if(ans==num){
//               System.out.println(num+" is an armstrong number ");
           }
        System.out.println(ans);
        }
        
    }
    

