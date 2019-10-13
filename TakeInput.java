import java.util.Scanner;

public class TakeInput{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
        System.out.print("Enter any numner: ");
        int num =scan.nextInt();
        scan.close(); //closing scanner after use
        System.out.println("You entered "+num);
    }
}