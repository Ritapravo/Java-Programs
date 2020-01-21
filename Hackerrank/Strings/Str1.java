/* String Anagrams
Given two strings. Find number of deletions such that both are anagrams.
Input:
cde
abc
Output:
4
*/

import java.util.*;
import java.lang.Math.*;

public class Str1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        Map<Character,Integer> map1 = new HashMap<Character, Integer>();
        Map<Character,Integer> map2 = new HashMap<Character, Integer>();
        Map<Character,Boolean> vis = new HashMap<Character, Boolean>();
        for (int i = 0; i < n1; i++) {
            char c = s1.charAt(i);
            if(map1.get(c)==null){
                map1.put(c,1);
            }
            else 
                map1.put(c,1+map1.get(c));
        }
        for (int i = 0; i < n2; i++) {
            char c = s2.charAt(i);
            if(map2.get(c)==null){
                map2.put(c,1);
            }
            else 
                map2.put(c,1+map2.get(c));
        }
        int count = 0;
        for (int i = 0; i < n1; i++) {
            char c = s1.charAt(i);
            if(vis.get(c)==null){
                vis.put(c,true);
                if(map2.get(c)==null){                   
                    count += map1.get(c);
                }
                else
                    count += Math.abs(map1.get(c)-map2.get(c)) ;
            }
        }
        for (int i = 0; i < n2; i++) {
            char c = s2.charAt(i);
            if(vis.get(c)==null){
                vis.put(c,true);
                if(map1.get(c)==null){                   
                    count += map2.get(c);
                }
                else
                    count += Math.abs(map1.get(c)-map2.get(c)) ;
            }
        }
        System.out.println(count);
    }
}