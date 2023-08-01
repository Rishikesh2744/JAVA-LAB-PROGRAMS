import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        TreeMap tm= new TreeMap();

        System.out.println("ThreaaMap: "+ tm);
        tm.put(81,"BRK");
        tm.put(115,"VVS");
        tm.put(121,"BVK");
        tm.put(123,"DDD");
        System.out.println("TreeMap : "+tm+"size: "+tm.size());

        //fetch a vale -tm.get(key)
        System.out.println("Enter a key to fetch value: ");
        int key=sc.nextInt();
        System.out.println("The value at "+key+" is : "+ tm.get(key));

        System.out.println("first entry of Treemap is : "+tm.firstEntry()); //to access first entry - tm.firstEntry()
        System.out.println("second entry of Treemap is : "+tm.lastEntry()); //to access last entry - tm.lastEntry()
        System.out.println("Higher entry than 115 : "+tm.higherEntry(115));// to access values of key higher than x - tm.higerEntry(key) 
        System.out.println("Lower entry than 121 : "+tm.lowerEntry(121)); // to acces values of key lower than x - tm.lowerEntry(key)
        
        // replace a value - tm.replace(key,"value")
        tm.replace(121,"Risky");
        System.out.println("TreeMap after replacement : "+tm+"size: "+tm.size());
        
        // remove a value -tm.remove(key)
        System.out.println("TreeMap after removing a value at : "+key+" is :"+tm+"size: "+tm.size());

        // to clear Treemap - tm.cear()
        tm.clear();
        System.out.println("TreeMap after clearing : "+tm+"size: "+tm.size());
    }
}
