class One extends Thread
{
    public void run()
    {
       for(int i=0;i<=5;i++)
       {
        System.out.println("Thread 1");
       }
    }
}

class Two implements Runnable
{
    public void run()
    {
       for(int i=0;i<=5;i++)
       {
        System.out.println("Thread 2");
       }
    }
}
public class ThreadDemo 
{
    public static void main(String[] args)
    {
        One T1= new One();
        Two R= new Two();
        Thread T2 = new Thread(R);

        T1.start();
        T2.start();
    }
}

