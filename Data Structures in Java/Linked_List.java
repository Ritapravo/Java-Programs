import java.util.Scanner;


public class Linked_List{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean flag = true;
        while (flag) {
            System.out.println("0. Exit");
            System.out.println("1. Add item at start");
            System.out.println("2. Add item at end");
            System.out.println("3. Add item at position");
            System.out.println("4. Delete first item");
            System.out.println("5. Delete last item");
            System.out.println("6. Delete at position");
            System.out.println("7. View list");

            int choice = sc.nextInt();
            int pos, val;
            switch (choice) {
                case 1:
                    System.out.println("Enter value of list item");
                    val = sc.nextInt();
                    list.insertAtFirst(val);
                    break;
                case 2:
                    System.out.println("Enter value of list item");
                    val = sc.nextInt();
                    list.insertAtLast(val);
                    break;
                case 3:
                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    System.out.println("Enter value of list item");
                    val = sc.nextInt();
                    list.insertAtPos(val, pos);
                    break;
                case 4:
                    list.delFirst();
                    break;
                case 5:
                    list.delLast();
                    break;
                case 6:
                    System.out.println("Enter position");
                    pos = sc.nextInt();
                    list.delAtPos(pos);                   
                    break;
                case 7:
                    list.viewList();
                    break;
                case 0:
                    flag = false;    
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }
}
class Node{

    private int data;
    private Node next;
    public Node(){
        data = 0;
        next = null;
    }
    public Node(int d, Node n){
        data = d;
        next = n;
    }
    public void setNext(Node n) {
        next = n;
    }
    public void setData(int d) {
        data = d;
    }
    public int getData() {
        return (data);
    }
    public Node getNext() {
        return (next);
    }

}

class LinkedList{
    private int size;
    private Node start;
    public LinkedList(){
        size = 0;
        start = null;
    }
    public boolean isEmpty(){
        if(start == null)
            return (true);
        else
            return(false);
    }
    public int getListSize(){
        return (size);
    }
    public void viewList(){
        Node t;
        if(isEmpty())
            System.out.println("List Empty");
        else{
            t = start;
            for (int i = 1; i < size + 1; i++) {
                System.out.println(" "+t.getData());
                t = t.getNext();
            }
        }
    }
    public void insertAtFirst(int d){
        Node t ;
        t = new Node();
        t.setData(d);
        t.setNext(start);
        start = t; 
        size ++;
    }
    public void insertAtLast(int d){
        Node n,t ;
        n = new Node();
        n.setData(d);
        n.setNext(null);
        t = start; 
        if(t == null)
            start = n;
        else{
            while (t.getNext()!=null) {
                t = t.getNext();
            }
            t.setNext(n);
            //t=n;
        }
        size++;
    }
    public void insertAtPos(int val , int pos) {
        Node t,n;
        n = new Node(val, null);
        t= start;
        for (int i = 1; i < pos-1 ; i++) {
            t = t.getNext();
        }
        n.setNext(t.getNext());
        t.setNext(n);
        size ++;
    }
    public void delFirst() {
        if(start != null){
            start = start.getNext();
            size--;
        }
        else{
            System.out.println("List empty");
        }
    }
    public void delLast() {
        if(start == null)
            System.out.println("List empty");
        else if (size == 1){
            start = null;
            size--;
        }
        else{
            Node t;
            t = start;
            for (int i = 1; i < size-1; i++) {
                t = t.getNext();                               
            }
            t.setNext(null);
            size--;
        }
    }
    public void delAtPos(int pos) {
        if(start == null)
            System.out.println("List empty");
        else if(pos<1 ||pos>size)
            System.out.println("Invalid Position");
        else if(pos == 1)
            delFirst();
        else if(pos == size)
            delLast();
        else{
            Node t;
            t = start;
            for (int i = 1; i < pos-1; i++) {
                t = t.getNext();
            }
            Node t1 = t.getNext();
            t.setNext(t1.getNext());
            size--;
        }
        
    }

}

