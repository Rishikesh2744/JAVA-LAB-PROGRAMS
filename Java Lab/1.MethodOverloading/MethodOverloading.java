class Sum
{
    int sum(int x,int y)
    {
        System.out.println("Sum of 2 integr arguments invoked: ");
        return (x+y);
    }

    double sum(double x,double y)
    {
        System.out.println("sum of 2 double arguments: ");
        return(x+y);
    }

    int sum(int x,int y,int z)
    {
        System.out.println("sum of 3 intger arguments : ");
        return(x+y+z);
    }
}
public class MethodOverloading
{
    public static void main(String[] args)
    {
        Sum s= new Sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10.10,20.20));
        System.out.println(s.sum(10,20,30));
    }
}