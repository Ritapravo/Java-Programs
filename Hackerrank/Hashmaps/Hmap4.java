/*Counting triplets which are in GP in a given series 
code taken from gfg
input:
6 3
1 3 9 9 27 81
output:
6
*/    


import java.util.*;

public class Hmap4{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        long n = sc.nextInt();
        long r = sc.nextInt();
        long count = 0l;
        Map<Long, Long> map = new HashMap<Long, Long>();
        for(int i = 0 ; i < n ; i++){
            long x = sc.nextInt();
            //map.put(x,true);
            

            if(map.get(x/r)!= null && map.get(x/(r*r))!=null){
                //System.out.println(i+" "+x);
                long m1 = map.get(x/r);
                long m2 = map.get(x/(r*r));
                if(r==1)
                    count += m1*(m1-1)/2;
                else
                    count += m1*m2;
            }       
            if(map.get(x)==null)
                map.put(x,1l);
            else
                map.put(x,map.get(x)+1);
        }
        System.out.println(count);
    }
}