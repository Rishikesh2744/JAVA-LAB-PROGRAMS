import java.io.File;
import java.util.*;

public class FileDemo {                                    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file with .ext: ");
        String fname=sc.nextLine();
        File file=new File(fname);

        if(file.exists())
        {
            System.out.println(fname+" exists");
            System.out.println("file can read?"+file.canRead());
            System.out.println("file can write?"+file.canWrite());
            System.out.println("file Location : "+file.getAbsolutePath());
            System.out.println("File size: "+file.length()+" bytes");

            int index=fname.lastIndexOf(".");
            if(index>0)
            {
                String type=fname.substring(index);
                System.out.println("Type : "+type);
            }
        }
        else
        {
            System.out.println("File doesn't exist");
        }
    }
}
