/* Calculate the minimum number of adjacent swaps required to sort an array. 
    Sample input: 
    2
    8
    1 2 5 3 7 8 6 4
    6
    3 5 6 4 2 1

    Output:
    7
    11

    Hint : Number of inversions in merge Sort
*/


import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t>0){
            int n  = sc.nextInt();
            int a[] = new int[n];

            for(int i = 0 ; i<n ; i++){
                a[i] = sc.nextInt();
            }
           
            int c = M.ms(a,0,n-1);
            System.out.println(c);
        
            t--;
        }
        /* int a[] = {3,5,6,4,2,1};       
        int c = M.ms(a,0,5);
        System.out.println(c); */
        
    }
    
}


public class M{
 
    static int ms(int[] arr, int l, int r){
        int inv = 0;
        if(l<r){
            int m = l+(r-l)/2;
            inv += ms(arr, l, m);
            inv += ms(arr, m+1, r);
            inv += merge(arr,l,m,r);
        }
        return inv;
    }

    static int merge(int[] arr, int l, int m , int r){
        int i,j,k,inv = 0;
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int [n1];
        int R[] = new int [n2];
        for (i = 0; i < n1; i++) {
            L[i] = arr[l+i];
        }
        for(j = 0 ; j<n2 ;j++){
            R[j] = arr[m+j+1];
        }
        i = 0;
        j = 0;
        k = l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            
                inv += m-(l+i)+1;
                //System.out.println(inv);
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
        return inv;
    }
}
