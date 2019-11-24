import java.util.Scanner;

public class Inheritance{
    
    public static void main(String[] args) {
        A superOb = new A(10,20);
        B subOb = new B(100,60,50);
        System.out.println("\nContents of superOb: ");
        superOb.showij();
        superOb.sum();
        System.out.println("\nContents of subOb: ");
        subOb.showij();
        subOb.showk();
        subOb.sum();
        subOb.showSuper_m(); //prints m value of its superclass
        subOb.show_m();//prints m value of its own

        //Dynamic binding/Run time polymorphism 
        System.out.println("\nDynamic binding/run-time polymorphism implementation");
        A d_poly = new B();
        d_poly.sum();

        //implementing abstract class
        System.out.println("\nAbstract class implementation");
        D d = new D();
        d.m1();
        d.m2();

    }
}
class A{
    int i,j;
    int m=35;
    //intitializing the parameters in A
    A(){
        i=2;
        j=3;
    }
    //constructor overloading
    A(int p, int q){
        this.i = p;
        this.j = q;
    }
    void showij(){
        System.out.println("i and j: "+i+" "+j);
    }
    void sum (){
        System.out.println("i+j: "+(i+j));
    }
}
class B extends A{
    int k ;
    int m = 25;
    B(){
        k=1;
    }
    //constructor overloading
    B(int x){
        this.k = x;
    }
    //constructor overloading
    B(int x, int y, int z){
        this.i = x;
        this.j = y;
        this.k = z;
    }
    void showk(){
        System.out.println("k : "+k);   
    }
    //super keyword gives the values of its superclass
    void showSuper_m(){
        System.out.println("super_m : "+ super.m);
    }
    void show_m(){
        System.out.println("Own_m : "+m);
    }
    //method overloading
    void sum(){
        System.out.println("i+j+k : "+ (i+j+k));
    }
}

//demonstration of abstract class
abstract class C{
    abstract void m1();

    void m2(){
        System.out.println("This is a concrete method.");
    }

}
class D extends C{
    void m1(){
        System.out.println("D's implementation of m1.");
    }
}
//a method to scan inputs //eg. int a = scan();
public class functions{
    public static int scan() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }
}

//Finalkeyword in java : 

//Final variable: creates constant variables
//Final methods: preverts over-riding
//Final classes: prevents inheritance

//super keyword gives the values of its superclass