import java.util.*;    
class Coordinates {    
    int x,y;    
    public Coordinates(int a, int b) {    
        this.x = a;    
        this.y = b;    
    }    
}    
public class HMap {    
public static void main(String[] args) {    
    //Creating map of Books    
    Map<Coordinates,Boolean> map=new HashMap<Coordinates,Boolean>();    
    //Creating Books 
    Coordinates c1 = new Coordinates(1,1);
    Coordinates c2 = new Coordinates(2,2);
    Coordinates c3 = new Coordinates(3,3);
        
    //Adding Books to map   
    map.put(c1,false);  
    map.put(c2,true);  
    map.put(c3,true);  
      
    //System.out.println(map);
    //Traversing map  
    for(Map.Entry<Coordinates,Boolean> entry:map.entrySet()){    
        Coordinates c = entry.getKey();  
        Boolean b = entry.getValue();  
        System.out.print("("+c.x+","+c.y+")"+" :");  
        System.out.println(b);   
    }   
}    
}   