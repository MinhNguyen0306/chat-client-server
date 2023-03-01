/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btjava_laptrinhmang;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class Bai6 {
    static void printString(String s) {
        int i = 0;
        while(i < s.length()) {
            System.out.println(s.charAt(i));
        }
    }
    
    static void printFrequencyChar(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(result.containsKey(s.charAt(i)))
            {
                result.put(s.charAt(i), result.get(s.charAt(i)) + 1);
            }
            else
            {
                result.put(s.charAt(i), 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            if(result.get(s.charAt(i)) != 0)
            {
                System.out.print(s.charAt(i) + ":" + result.get(s.charAt(i)) + " ");
                result.put(s.charAt(i), 0);
            }           
        } 
    }
}
