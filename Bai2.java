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
public class Bai2 {
    static int tong(int m){
        int sum = 0;
        while(m > 0) {
            int sodu = m % 10;
            m /= 10;
            sum += sodu;
        }
        return sum;
    }
    
    static int tich(int m) {
        int tich = 0;
        while(m > 0) {
            int sodu = m % 10;
            m /= 10;
            tich *= sodu;
        }
        return tich;
    }
}
