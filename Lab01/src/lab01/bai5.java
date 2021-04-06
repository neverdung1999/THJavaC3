/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap vao so a: ");
        int a = x.nextInt();
        System.out.print("Nhap vao so b: ");
        int b = x.nextInt();
        
        System.out.println("UCLN cua a va b la: " + USCLN(a,b));
        System.out.println("BSNN cua a va b la: " + BSCNN(a,b));

        
    }
    
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    
    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
    
}
