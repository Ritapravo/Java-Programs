/* Sherlock and the valid string(medium/solved after seeing one test case)
Is it possible to delete onlt one character such that the frequency of all the characters become equal
input: aabbcd
output: NO
input: aabbccddeefghi
output: NO
input: aabbc
output: YES
Hint: create a hashmap of the frequency values of the characters. Here I have used two hashmaps.
*/

import java.util.*;
import java.lang.Math.*;

public class Str1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
    
        Map<Character,Integer> map1 = new HashMap<Character, Integer>();
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(map1.get(c)==null){
                map1.put(c,1);
            }
            else 
                map1.put(c,1+map1.get(c));
        }
        Map<Integer,Integer> map2 = new HashMap<Integer, Integer>();

        for(Map.Entry<Character, Integer> entry:map1.entrySet()){    
            char c = entry.getKey();  
            int v = entry.getValue();  
            if(map2.get(v)==null){
                map2.put(v,1);
            }
            else 
                map2.put(v,1+map2.get(v));   
        }
        int size  = map2.size();
        int[] keys = new int[2];
        int[] values = new int[2];
        if(size>2)
            System.out.println("NO");
        else{
            if(size==1)
                System.out.println("YES");
            else{
                int i =0,j=0;
                for(Map.Entry<Integer, Integer> entry:map2.entrySet()){    
                    int f = entry.getKey();  
                    int v = entry.getValue();  
                    keys[i++] = f;
                    values[j++] = v;
                }
                if(values[0] == 1 ){
                    if(keys[0]-keys[1]==1 || keys[0]==1)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else if(values[1] == 1){
                    if(keys[1]-keys[0]==1 || keys[1]==1)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else 
                    System.out.println("NO");
            }
        }
        /* System.out.println(map2);
        System.out.println(keys[0]+" "+keys[1]);
        System.out.println(values[0]+" "+values[1]); */
    }
}