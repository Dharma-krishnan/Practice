/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problems;
import java.util.Scanner;
/**
 *
 * @author dharma
 */
public class Largest {
    public static void main(String[] args){
       Scanner obj = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = obj.nextInt();
        System.out.println("Enter num2: ");
        int num2 = obj.nextInt();
        System.out.println("Enter num3: ");
        int num3 = obj.nextInt();
        
        int max = 0;
        
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        
        System.out.println("Largest of three integers is: " + max);
    }
}
