import java.util.*;

public class Hmap1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt(); 
        sc.nextLine();
        Map <String,Integer> magazine = new HashMap<String, Integer>();
        String mag  = sc.nextLine();
        String[] words = mag.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(magazine.get(words[i])==null)
                magazine.put(words[i], 1);
            else    
                magazine.put(words[i], magazine.get(words[i])+1 );
        }
        //System.out.println(magazine);
        String note1 = sc.nextLine();
        String[] note = note1.split(" ");
        Boolean check = true;
        for (int i = 0; i < note.length; i++) {
            if(magazine.get(note[i])==null){
                check = false;
                break;
            }    
            else if(magazine.get(note[i])>0)
                magazine.put(note[i], magazine.get(note[i])-1);
            else{
                check = false;
                break;
            }  
        }
        if(check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}