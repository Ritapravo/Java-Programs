import java.util.Scanner;

public class OOPStack{
    public static int scan() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        return x;
    }
    public static void main(String[] args) {
        /* Box myBox = new Box(10,5,2);
        double volume = myBox.vol();
        System.out.println(volume); */
        Stack myStack = new Stack();
        System.out.println("0.Exit  1.Push  2.Pop  3.Print");

        while(true){
            System.out.print("Enter your choice: ");
            int t = scan();
            if (t==0)
                break;
            switch(t){
                case 1:
                    System.out.print("Enter number to push: ");
                    int x = scan();
                    myStack.push(x);
                    break;
                case 2:
                    System.out.println("Popped element: " +myStack.pop());
                    break;   
                case 3:
                    myStack.print();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            } 
        }

    }
    
}

public class Box{
    double width;
    double height;
    double depth;
    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    double vol() {
        double volume = width *height *depth;
        return volume;
    }
}

class Stack {
    int stack[] = new int[10];
    int tos;  //top of stack
    Stack(){
        tos = -1;
    }
    void push(int item){
        if (tos==9)
            System.out.println("Stack is full");
        else{
            stack[++tos] = item;
        }
    }
    int pop(){
        if(tos<0){
            System.out.println("stack underflow");
            return 0;
        }
        else{
            return stack[tos--];
        }
    }
    void print(){
        if (tos == -1)
            System.out.println("Stack is empty.");
        for (int i =0; i<=tos; i++)
            System.out.print(stack[i]+" ");
        System.out.println("");
    }
}