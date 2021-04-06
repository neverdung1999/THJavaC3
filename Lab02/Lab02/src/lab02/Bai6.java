/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        try{
            n= Integer.parseInt(JOptionPane.showInputDialog(null,"Nhap so nguyen: ",""));
        }catch(java.lang.NumberFormatException e1){
            System.out.println(e1.toString());
        }finally{
            System.out.println("Have good fun");
        }
    }
}
