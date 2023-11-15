/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice;

/**
 *
 * @author dharma
 */

class Student{
    int rollno,marks;
    String name;
}
public class classofArrays {
    public static void main(String args[]){
        Student stud1=new Student();
        stud1.rollno=1;
        stud1.name="dharma";
        stud1.marks=62;
        
        
        Student stud2=new Student();
        stud2.rollno=2;
        stud2.name="rohit";
        stud2.marks=86;
        
        Student students[]=new Student[2];
        students[0]=stud1;
          students[1]=stud2;
        for(int i =0;i<students.length;i++){
            System.out.println("Name"+students[i].name);
        }
    }
    
}
