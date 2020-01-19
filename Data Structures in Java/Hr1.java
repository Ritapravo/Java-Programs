import java.util.Scanner;
import java.util.*; 
   
public class Hr1 {    
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);    
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();    
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            if(map.get(key)==null)
                map.put(key,1);
            else
                map.put(key, map.get(key) + 1);
        }
        int pairs = 0;
        for (int k : map.keySet())  
        {  
            int value = map.get(k); 
            pairs += value/2 ; 
        }
        System.out.println(pairs);
        //System.out.println(map);
        //System.out.println(map.get(2));   
         
        /* map.put(c1,false);  
        map.put(c2,true);  
        map.put(c3,true);  
          
        
        //Traversing map  
        for(Map.Entry<Coordinates,Boolean> entry:map.entrySet()){    
            Coordinates c = entry.getKey();  
            Boolean b = entry.getValue();  
            System.out.print("("+c.x+","+c.y+")"+" :");  
            System.out.println(b);   
        } */   
    }    
}   

/* import java.util.Scanner;
import java.io.*;
//import java.lang.*;

public class Hr2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Scanner ss = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s = sc.nextLine();
        //s = sc.nextLine();
        int valleys = 0;
        int level = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            int temp = level;
            if(s.charAt(i) == 'D')
                level = level-1;
            else
                level = level+1;
            if(temp == 0 && level ==-1)
                valleys += 1;
        }
        System.out.println(valleys);
    }
}
 */

/* import java.util.Scanner;

public class Hr2{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n  = sc.nextInt();
        int d  = sc.nextInt();
        int num[]  = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int num2[]= new int[n];
        for (int i = 0; i < n; i++) {
            num2[i] = num[(i+d)%n];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(num2[i] + " ");
        }
    }
} */