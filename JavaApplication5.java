/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author quangdung
 */
import java.util.Scanner;

public class JavaApplication5 {
    
public static void main(String[] args) {
        int a, b;
        double nghiem;
        try{
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        System.out.println("Phương trình nhập vào là: " + a + "x + " + b + " = 0.");
        if (a == 0) {
            if (b == 0) {
                System.out.println(" Phương trình n có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -b / a;  
            System.out.println("Phương trình có nghiệm x = " + (nghiem) + ".");
           
        } 
        } catch (NullPointerException e) {
            System.out.println("lỗi ");
                  }
                
              }
 
           }
      

    
    

