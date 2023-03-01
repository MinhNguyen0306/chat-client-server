/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btjava_laptrinhmang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    static void checkSo(){
        int chon;
        do{
            System.out.println("-----------Bai1-----------");
            System.out.println("1. Kiem tra so nguyen to.");
            System.out.println("2. Kiem tra so chinh phuong.");
            System.out.println("3. Kiem tra so hoan hao.");
            System.out.println("4. Kiem tra so amstrong.");
            System.out.println("0. Thoat chuong trinh\n");

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap lua chon cua ban: ");
            chon = sc.nextInt();
            System.out.println("Nhap so can kiemt tra: ");
            int so = sc.nextInt();
            switch (chon) {
                case 1:
                    if(isSoNguyenTo(so)) 
                        System.out.println(so + " la so nguyen to!");
                    else
                        System.out.println(so + " khong la so nguyen to!");
                    break;
                case 2:
                    if(isSoChinhPhuong(so))
                        System.out.println(so + " la so chinh phuong!");
                    else
                        System.out.println(so + " khong la so chinh phuong!");
                    break;
                case 3:
                    if(isSoHoanHao(so))
                        System.out.println(so + " la so hoan hao!");
                    else
                        System.out.println(so + " khong la so hoan hao!");
                    break;
                case 4:
                    if(isSoAmstrong(so))
                        System.out.println(so + " la so Amstrong!");
                    else
                        System.out.println(so + " khong la so Amstrong!");
                    break;
                default:
                    System.out.println("Khong co lua chon nhu vay!!!");
            }
        }while (chon != 0);
    }
    
    static boolean isSoNguyenTo(int n) {
        if(n == 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static boolean isSoChinhPhuong(int n) {
        if(Math.sqrt(n) % Math.round(Math.sqrt(n)) == 0){
            return true;
        }
        return false;
    }
    
    static boolean isSoHoanHao(int n) {
        int sum = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }
    
    static boolean isSoAmstrong(int n) {
        int sum = 0;
        int nClone = n;
        int nClone2 = n;
        int numLength = 1;
        int sodu = 0;
        while(nClone > 10) {
            nClone /= 10;
            numLength++;
        }
        while(n > 0) {
            sodu = n % 10;
            n /= 10;
            sum += Math.pow(sodu, numLength);
        }
        
        return sum % nClone2 == 0;
    }
}
