
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

   
    public static void main(String[] args) {
        int bankinh;
        double soPI = 3.14;
        double v;
        Scanner scanner = new Scanner(System.in);
         
    System.out.print("Nhập vào bán kính hình tròn: ");
    bankinh = scanner.nextInt();
    v = soPI * bankinh * bankinh;
       System.out.println ("Chu  hình tròn = " + (v));
}

        
    }
    
}
