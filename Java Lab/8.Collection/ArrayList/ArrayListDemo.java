
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList list=new ArrayList();

        System.out.println("List="+list);
        list.add(10);
        list.add(20);
        list.add(45.6);
        list.add(5.7);
        list.add("abc");
        list.add("xyz");
        
        //printing list
        System.out.println("List after insertion="+list);
        
        //accessing an index -list.get(ind)
        System.out.println("Enter a positive index to fetch an item:");
        int ind=sc.nextInt();
        System.out.println("Element at "+ind+"="+list.get(ind));
        
        //Removing and element at an index- list.remove(index)
        System.out.println("Enter a positive index to remove item:");
        ind=sc.nextInt();
        list.remove(ind);
        System.out.println("List after removing "+ind+"="+list);

        //update and element agt an index- list.set(index,value)
        list.set(ind, 100);
        System.out.println("List after updating value at "+ind+"="+list);
       
        //clearing a list -list.clear()
        list.clear();
        System.out.println("Now list="+list);
        sc.close();
    }
}