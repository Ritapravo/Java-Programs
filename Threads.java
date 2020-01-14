import java.io.*; 
import java.lang.*; 


//Threads using runnable interface
class Threads { 
    public static void main(String[] args) 
    { 
        
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());
        t1.start();
        t2.start();

    } 
}  
class A implements Runnable{
    public void run() {
        int i;
        for (i = 0 ; i <= 10 ; i++ )
            System.out.println("Thread A "+i);
    }
}
class B implements Runnable{
    public void run() {
        int i;
        for (i = 0 ; i <= 10 ; i++ )
            System.out.println("Thread B "+i);
    }
    
}


//Threads using thread class in java

/* 
public class Experiment {
    public static void main(String[] args) {
        A o1 = new A();
        B o2 = new B();
        o1.start();
        o2.start();
    }
    
}

class A extends Thread{
    public void run (){
        int i;
        for (i = 0 ; i <= 10 ; i++){
            System.out.println("Thread A = " + i);
        }
    }
}
class B extends Thread{
    public void run (){
        int i;
        for (i = 0 ; i <= 10 ; i++){
            System.out.println("Thread B = " + i);
        }
    }
}
*/
