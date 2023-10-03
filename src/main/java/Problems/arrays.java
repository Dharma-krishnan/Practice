/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problems;

/**
 *
 * @author dharma
 */
import java.util.*;
public class arrays {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int ros[];// declaration of array 
        ros= new int[5];//initialization
       
        System.out.println(ros.length);
       
        for(int i=0;i<5;i++){
            System.out.println("Enter element for "+i+":");
            ros[i]=obj.nextInt();
        }
        // printing the array using for loop
//        for(int i=0;i<5;i++){
//            System.out.print(ros[i]);
//        }
//  //using for each loop to print the array elements

    for(int num :ros){
        System.out.print(num+" ");
    }
    System.out.println(" ");
    change(ros); // checking arrays are mutable by modifing an element at 0th index
     for(int num :ros){
        System.out.print(num+" ");
    }
  }
     static void change(int[] sum){
    sum[0]=121 ; 
     }
     
  }
    

