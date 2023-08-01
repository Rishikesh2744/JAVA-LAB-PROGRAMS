class One
{
    String one_str="class one ";
    void displayOne()
    {
        System.out.println("parent "+ one_str);
    }
}

class Two extends One
{
    String two_str="class Two ";
    void displayTwo()
    {
        super.displayOne();
        System.out.println("Single level Inheritance: ");
        System.out.println("Child "+two_str+"inherited from " + one_str);
    }
}

class Three extends Two
{
    String three_str="class Three ";
    void displayThree()
    {
        super.displayTwo();
        System.out.println("Multiple level Inheritance: ");
        System.out.println("Child "+three_str+"inheted from " + two_str+"and "+one_str);
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        Three obj =new Three();
        obj.displayThree();
    }
}
