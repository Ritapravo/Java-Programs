/* import java.io.*; 
import java.lang.*; */ 
  
class Experiment { 
    public static void main(String[] args) 
    { 
        // Declare String without using new operator 
        String s = "Geeks"; 
        s = s + "forGeeks";
        s = s + "!!";
        String s2  = "" + s.charAt(3);
  
        // Prints the String. 
        System.out.println("String s2 = " + s2); 
  
        // Declare String using new operator 
        String s1 = new String("GeeksforGeeks"); 
  
        // Prints the String. 
        System.out.println("String s1 = " + s1); 
        sys
        
    } 
} 