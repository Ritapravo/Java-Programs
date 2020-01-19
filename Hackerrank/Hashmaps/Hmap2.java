import java.util.*;

public class Hmap2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n>0){
            
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Map<Character,Integer> map=new HashMap<Character,Integer>();
            for (int i = 0; i < s1.length(); i++) {
                if(map.get(s1.charAt(i)) == null){
                    map.put(s1.charAt(i), 1);
                }
                else{
                    map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
                }
            }
            Boolean check = false;
            for (int i = 0; i < s2.length(); i++) {
                if(map.get(s2.charAt(i))!=null){
                    check = true;
                    break;
                }
            }
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");
            n--;
        }
    }
}