abstract class Demo
{
    abstract void show();
}

interface Printable
{
    void print();
}

class AbstractClass extends Demo implements Printable
{
    void show()
    {
        System.out.println("This is Abstract class method");
    }
    public void print()
    {
        System.out.println("This is interface method");
    }
    public static void main(String[] args)
    {
        AbstractClass a= new AbstractClass();
        a.show();
        a.print();
    }
}
