//Java program to reverse an array 
import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args) {
        int c, i=0, j=0, temp;
        int array[] = new int[100];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        c = scan.nextInt();

        for(i=0;i<c;i++){
            array[i] = scan.nextInt();
        }
        j=i-1;
        i=0;
        while(i<j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed array is: ");
        for (i=0; i<c; i++){
            System.out.print(array[i] + " ");
        }
    }
}