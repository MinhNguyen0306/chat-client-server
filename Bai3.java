/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btjava_laptrinhmang;

/**
 *
 * @author Admin
 */
public class Bai3 {
    static int UCLN(int a, int b) {
        if(a == 0) return a;
        if(b == 0) return b;
        if(a == b) return a;
        if(a > b)
            return UCLN(a - b, b);
        else 
            return UCLN(a, b - a);
    } 
    
    static int BCNN(int a, int b) {
        int temp = a > b ? a : b;
        for(int i = a; i < a*b; i += a) {
            if(i % b == 0 && i % a == 0) return i;
        }
        return 0;
    }
}
