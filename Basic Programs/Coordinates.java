//Java program to find the distance between two coordinates
import java.lang.Math;
import java.util.Scanner;

public class coordinates{
    int x,y;
    coordinates(int x1,int x2){
        this.x = x1;
        this.y = x2;
    }
    public static double distance(coordinates p1, coordinates p2){
        double temp = (p1.x - p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y);
        return Math.sqrt(temp);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter the coordinates of the first point: ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        coordinates c1 = new coordinates(x1,y1);
        coordinates c2 = new coordinates(x2,y2);
        double temp = distance(c1,c2);
        System.out.println("Distance: "+temp+ " units");
    }
}