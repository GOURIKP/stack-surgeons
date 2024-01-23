import java.uti.*;
public class fibonnaci
{
    public static void main(string args[])
    {
        Scanner sc=new Scanner();
        int n,f=0,s=1,t;
        System.out.println("enter number of terms:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
        if(i==1)
        {
            System.out.println(f+s);
        }
        else
        {
            t=f+s;
            System.out.println(f+s+t);
            f=s;
            s=t;
        }
    }
}
