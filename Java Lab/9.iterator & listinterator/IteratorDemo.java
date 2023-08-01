import java.util.*;

public class IteratorDemo 
{
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();
        
        for(int i=10;i<15;i++)
        {
            list.add(i);
        }

        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+"\t");
        }

        System.out.print("\n");
        
        ListIterator lit=list.listIterator();
        while(lit.hasNext())
        {
            System.out.print(lit.next()+"\t");
        }
        System.out.print("\n");

        while(lit.hasPrevious())
        {
            System.out.print(lit.previous()+"\t");
        }

    }
}
