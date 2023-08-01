import java.util.Scanner;
import java.util.StringTokenizer;

public class StrToken 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the integer string(space as delimeter) :");
        String intString=sc.nextLine();

        int sum=0;
        StringTokenizer st= new StringTokenizer(intString,"");
        System.out.println("Number of integer tokens = "+ st.countTokens());

        while(st.hasMoreTokens())
        {
            int val =Integer.parseInt(st.nextToken());
            sum=sum+val;
            System.out.println(val);
        }
        System.out.println("sum:"+sum);
    }
}
