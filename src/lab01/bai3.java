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
public class bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap MSSV: ");
        int mssv = x.nextInt();
        System.out.print("Nhap Ho ten: ");
        x.nextLine();
        String hoten = x.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = x.nextInt();
        System.out.print("Nhap nam sinh: ");
        int namsinh = x.nextInt();
        System.out.print("Nhap diem trung binh: ");
        float dtb = x.nextFloat();
       
        System.out.println(mssv);
        System.out.println(hoten);
        System.out.println(tuoi);
        System.out.println(namsinh);
        System.out.println(dtb);
        
    }
    
}
