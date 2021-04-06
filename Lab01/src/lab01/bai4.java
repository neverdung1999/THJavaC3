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
public class bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Scanner x=new Scanner(System.in);
        System.out.println("Nhap a, b: ");
        int a = x.nextInt();
        int b = x.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        System.out.println("Tong cua a va b: " + tong);
        System.out.println("Hieu cua a va b: " + hieu);
        System.out.println("Tich cua a va b: " + tich);
        System.out.println("Thuong cua a va b: " + thuong);
    }
    
}
