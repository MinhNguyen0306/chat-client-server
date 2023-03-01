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
public class Bai5 {
    static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return Arrays.toString(arr);
    }
    
    static String upperString(String s) {
        for(char c : s.toCharArray()) {
            if(c > 96 && c < 123)   
                c = (char) (c - 32);
        }
        return s;
    }
    
    static String lowerString(String s) {
        for(char c : s.toCharArray()) {
            if(c > 64 && c < 91)   
                c = (char) (c + 32);
        }
        return s;
    }
    
    static String convertCaseString(String s) {
        for(char c : s.toCharArray()) {
            if(c > 64 && c < 91)   
                c = (char) (c + 32);
            else if(c > 96 && c < 123)   
                c = (char) (c - 32);
        }
        return s;
    }
    
    static int countChar(String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            count++;
        }
        return count;
    }
    
    static String nguyenAm(String s) {
        StringBuilder result = new StringBuilder();
        if(s == null || s.length() == 0) return s;
        String nAm = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(i < j && !nAm.contains(String.valueOf(arr[i]))) {
                i++;
            }
            result.append(arr[i]);
        }
        return result.toString();
    }
}
