/* Alternating characters
find the number of deletions of A and B such that all A's and B's in the string are alternate
Input:
5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB

Output:
3
4
0
0
4
 */

import java.util.*;
import java.lang.Math.*;

public class Str1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s = sc.nextLine();
            int x = 0; //C=0 signifies a
            int n1 = s.length();
            s = s +'/';
            //System.out.println(s);
            int count = 0;
            int m = 0;
            for (int i = 1; i <= n1; i++) {
                char c = s.charAt(i);
                char d = s.charAt(i-1);
                //System.out.println(c);
                if(c==d){
                    m += 1;
                    //System.out.println(c);
                }
                else{
                    count += m;
                    m=0;
                }   
            }
            System.out.println(count);
            t--;
        }
    }
}