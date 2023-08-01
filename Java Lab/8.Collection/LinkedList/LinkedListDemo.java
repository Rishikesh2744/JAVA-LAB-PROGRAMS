import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList list= new LinkedList();
        System.out.println("The list is :"+list);
        list.add(10);
        list.add(20);
        list.add(20.20);
        list.add("abc");
        list.add("asd");
        System.out.println("list after adding elements: "+list+",size: "+list.size());

        list.addFirst(1);   // add at first
        list.addLast(99);   // add at last
        list.add(3,50); //add index,value

        System.out.println("Linked List after add first,last and 3rd index: \n"+list+"\nSize: "+list.size());

        //accessing an index -list.get(ind)
        System.out.println("Enter a positive index to fetch an item: ");
        int ind=sc.nextInt();
        System.out.println("Element at "+ind+" is : "+list.get(ind));

        //to remove an element at an index
        System.out.println("Enter a positive index to remove an item: ");
        ind=sc.nextInt();
        list.remove(ind);
        list.removeFirst();
        list.removeLast();
        System.out.println("Linked list after remove "+ind+",first and last : "+list+" ,size of list: "+list.size());

        //to update an element at an index -list.set(ind)
        list.set(ind,100);
        System.out.println("List after updating element at "+ ind+" is :"+ list);

        //clear a list - list.clear()
        list.clear();
        System.out.println("Now List ="+ list+",size: "+list.size());
    }
}
