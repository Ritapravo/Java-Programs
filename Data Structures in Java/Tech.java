import java.util.*;

public class Tech{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int a1[] = new int[n1];
        int a2[] = new int[n2];
        int a3[] = new int[n3];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        for (int i = 0; i < n3; i++) {
            a3[i] = sc.nextInt();
        }
        System.out.print(maxheight(a1, a2,  a3, n1, n2, n3));

    }


    public static int maxheight(int a1[], int a2[], int a3[], int n1, int n2,  int n3) {

        int s1 = 0, s2 = 0, s3 = 0; 
    
        for (int i=0; i < n1; i++) 
            s1 += a1[i]; 

        for (int i=0; i < n2; i++) 
            s2 += a2[i]; 
    
        for (int i=0; i < n3; i++) 
            s3 += a3[i]; 

        int t1 =0, t2 = 0, t3 = 0; 
        //int ans = 0; 
        while (true) 
        { 

            if (t1 == n1 || t2 == n2 || t3 == n3) 
                return 0; 

            if (s1 == s2 && s2 == s3) 
                return s1; 
    
            if (s1 >= s2 && s1 >= s3) 
                s1 -= a1[t1++]; 
            else if (s2 >= s3 && s2 >= s3) 
                s2 -= a2[t2++]; 
            else if (s3 >= s2 && s3 >= s1) 
                s3 -= a3[t3++]; 
        } 
    } 
}