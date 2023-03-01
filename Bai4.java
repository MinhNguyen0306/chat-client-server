/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btjava_laptrinhmang;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Bai4 {
    static String reverseCharArray(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return Arrays.toString(arr);
    }
}
