import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int ch=0,a,b,res;
        
        while(ch!=-1)
        {
            System.out.println("Enter the index of arra(-1 to quit): ");
            
            try
            {
                ch=sc.nextInt();
                System.out.println(arr[ch]);
                System.out.println("Enter two integers: ");
                a=sc.nextInt();
                b=sc.nextInt();
                res=a/b;
                System.out.println("Division result="+res);
            }
            catch(ArrayIndexOutOfBoundsException aie)
            {
                System.out.println("Index value is out of bounds: ");
            }
            catch(InputMismatchException ime)
            {
                System.out.println("Enter values are not valid");
            }
            catch(ArithmeticException am)
            {
                System.out.println("Denomintor cannot be zero");
            }
        }
    }
}