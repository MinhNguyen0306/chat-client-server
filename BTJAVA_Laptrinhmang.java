/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btjava_laptrinhmang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BTJAVA_Laptrinhmang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chon;
        do{
            System.out.println("-----------Chon bai-----------");
            System.out.println("1. Bai 1");
            System.out.println("2. Bai 2");
            System.out.println("3. Bai 3");
            System.out.println("4. Bai 4");
            System.out.println("5. Bai 5");
            System.out.println("6. Bai 6");
            System.out.println("0. Thoat chuong trinh\n");

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap lua chon cua ban: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    System.out.println("Thoát chương trình!!!");
                    System.exit(0);
                case 1:
                    Bai1.checkSo();
                    break;
                case 2:
                    break;
                case 3:
                    Bai3.UCLN(3, 6);
                    Bai3.BCNN(3, 6);
                    break;
                case 4:
                    Bai4.reverseCharArray("dcsfdsf");
                    break;
                case 5:
                    Bai5.convertCaseString("sdafds");
                    Bai5.countChar("dadssfdvh");
                    Bai5.lowerString("SDFcdsfd");
                    Bai5.nguyenAm("minh");
                    Bai5.reverseString("nguyenminh");
                    Bai5.upperString("minh");
                    break;
                case 6:
                    Bai6.printFrequencyChar("minh");
                    Bai6.printString("minh");
                    break;
                default:
                    System.out.println("Khong co lua chon nhu vay!!!");
            }
        }while (true);
    }
    
}
