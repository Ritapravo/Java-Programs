import java.util.Scanner;

public class Exception{
    public static void main(String[] args){
    //String str = null;
    //System.out.println(str.length());
        try{
            int a = 30,b=0;
            int c= a/b;
            System.out.println("result = "+c);
            //throw new Exception("demo");
        }
        /* catch(Exception e){
            System.out.println("Exception found");
        } */
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}

def connectedComponents(self): 
    visited = [] 
    cc = [] 
    for i in range(self.V): 
        visited.append(False) 
    for v in range(self.V): 
        if visited[v] == False: 
            temp = [] 
            cc.append(self.DFSUtil(temp, v, visited)) 
    return cc