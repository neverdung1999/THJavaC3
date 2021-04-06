/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập sd: ");
        int sd = x.nextInt();
        System.out.print("Nhập sc: ");
        int sc = x.nextInt();
        int a[][];
        a = new int[sd][sc];
        for (int i = 0; i < sd; i++) {
            for (int j = 0; j < sc; j++) {
                a[i][j] = (int) (Math.random()*50);
            }
        }
        
        System.out.println("Mảng là: ");
        xuatMang(a, sd, sc);
        tinhtong(a,sd,sc);
    }
    
    public static void xuatMang(int a[][], int sd, int sc){
        for (int i = 0; i < sd; i++) {
            System.out.println("");
            for (int j = 0; j < sc; j++) {
                System.out.print(" a["+i+"]["+j+"]: " + a[i][j]);
            }
        }
    }
    
    public static void tinhtong(int a[][], int sd, int sc){
        System.out.println("");
        System.out.print("Nhập số dòng cần tính tổng: ");
        int k = x.nextInt();
        int sum = 0;
        for (int i = 0; i < sc ; i++) {
            sum = sum + a[k][i];
        }
        System.out.println("Tong la: " + sum);
    }
}
