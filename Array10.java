import java.util.*;
public class Array10
{//open class 
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int n=0; int s=0,k=0;
        int a[]=new int[n];
        System.out.println("Enter the array size:");
        n=sc.nextInt();
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The Entered elements are:");
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
                s=s+a[i];
        }
        System.out.println(+s);
        for(int i=0;i<n;i++)
        {
               if (a[i]%2==0)
               k=k+a[i];
        }
        System.out.println(+k);
    }//close main
}//close class 