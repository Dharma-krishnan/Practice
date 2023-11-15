/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */
public class jaggedarrays {
    void main(){  //jdk 21 updated version
        int nums[][] =new int[3][];
        nums[0]= new int[3];
        nums[1]=new int[6];
        nums[2]=new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*100);
            }
        }
        // printing the jagged array elements
        for(int n[]:nums){
            for(int k:n){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
        
    }
}
