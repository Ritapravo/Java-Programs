//Java program to reverse every word in a string
import java.util.Scanner;

public class Practice{
    public static void reverse(String str) {
        String[] words = str.split(" ");
        String revstr = "";
        for (int i =0; i < words.length; i++){
            String word = words[i];
            String revword = "";
            for (int j = word.length()-1; j>=0; j--){
                revword = revword + word.charAt(j);
            }
            revstr = revstr + revword + " ";
        }
        //System.out.println(str);
        System.out.println(revstr);
    }
    public static void revSent(String str) {
        String[] words = str.split(" ");
        String rev = "";
        for(int i=words.length-1; i>=0; i--){
            rev = rev + words[i] +" ";
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        reverse(str);
        revSent(str);
    }
}