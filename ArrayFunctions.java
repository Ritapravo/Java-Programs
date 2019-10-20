//Few array functions in java program
import java.util.Scanner;
import java.lang.Math;

public class ArrayFunctions{
    //ArraySum for float array
    public static double sum(double array[],int size){
        double s = 0;
        for (int i = 0; i< size; i++){
            s = s + array[i];
        }
        return s;
    }
    //ArraySum for int array
    public static int sum(int array[],int size){
        int s = 0;
        for (int i = 0; i< size; i++){
            s = s + array[i];
        }
        return s;
    }
    //For printing float array
    private static void printArray(double array[], int size) {
        for (int i = 0 ; i < size ; i++){
            if (Math.floor(array[i])==Math.ceil(array[i])){
                System.out.print(String.format("%.0f", array[i]) + " ");
            }
            else
                System.out.print(array[i]+ " ");
        }
    }
    //For printing int array
    private static void printArray(int array[], int size) {
        for (int i = 0 ; i < size ; i++){
            System.out.print(array[i]+ " ");
        }
    }
    // For scanning float array
    private static void scanArray(double array[],int size) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<size; i++){
            array[i] = scan.nextDouble();
        } 
    }
    //For scanning int array
    private static void scanArray(int array[],int size) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<size; i++){
            array[i] = scan.nextInt();
        } 
    }
    //For reversing a float array
    public static void reverse(double array[],int size) {
        int i=0, j=size-1;
        double temp;
        while(i<j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--; 
        }
    }
    
    private static int scan() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }

    public static void main(String[] args) {
        double array[] = new double[100];
        System.out.println("Enter the number of array elements: ");
        int n = scan();
        scanArray(array,n);
        System.out.println(sum(array,5));
        reverse(array,n);
        printArray(array,n);
    }
}
