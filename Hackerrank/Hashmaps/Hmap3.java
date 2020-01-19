/* 
Sherlock and Anagrams
link:
https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
print the number of anagrams in a string
Sample Input 
2
abba
abcd
ifailuhkqq
kkkk
Sample Output 
4
0
3
10
*/


import java.util.*;

public class Hmap3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){

            String str = sc.nextLine();
            System.out.println(anagrams(str));

            t--;
        }
    }

    static int anagrams(String s){
        int n = s.length();
        Map <String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String sp = "";
            for (int j = i; j < n; j++) {
                sp = Ssort(sp + s.charAt(j));
                if(map.get(sp) == null)
                    map.put(sp,1);
                else
                    map.put(sp, map.get(sp)+1);
            }  
        }

        int an  = 0;
        for(Map.Entry<String, Integer> entry:map.entrySet()){    
            String s1 = entry.getKey();  
            int v = entry.getValue();  
            an += (v*(v-1))/2;   
        } 
        return (an);
    }
    static String Ssort(String str) 
    { 
        char array[] = str.toCharArray(); 
    
        Arrays.sort(array); 

        return new String(array); 
    }
}