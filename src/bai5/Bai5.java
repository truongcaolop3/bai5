/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x , y;
        double a , b;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap tham so a: ");
        a = sc.nextDouble();   
        System.out.println("nhap tham so b: ");
        b = sc.nextDouble();
        sc.close();
        
        if (a==0){
            if (b==0){
                System.out.println("phuong trinh vo so nghiem! ");
            }else {
                System.out.println("phuong trinh vo nghiem");
            }
        }else{
            System.out.println("phuong trinh có nghiem x = " + ( -b/a));
        }
    }

}
