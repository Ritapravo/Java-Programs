import java.util.*;

public class PS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair array[] = new Pair [n];
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            array[i] = new Pair(i,p);
        }
        /* for (int i = 0; i < n; i++) {
            System.out.println(array[i].x +" " + array[i].y);
        } */
        Arrays.sort(array, new Pairsort());
        /* for (int i = 0; i < n; i++) {
            System.out.println(array[i].x +" " + array[i].y);
        } */
        Boolean vis[] = new Boolean[n];
        Arrays.fill(vis,false);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(vis[i] || array[i].x == i)
                continue;
            int cycles = 0;
            int j = i;
            while(!vis[j]){
                vis[j] = true;
                j = array[j].x;
                cycles++;
            }
            ans += cycles-1;
        }

        System.out.println(ans);
    }
}

public class Pair{
    int x,y;
    Pair(int a , int b){
        this.x = a;
        this.y = b;
    }
}
class Pairsort implements Comparator<Pair> 
{ 
    public int compare(Pair a, Pair b) 
    { 
        return a.y - b.y; 
    }    
}