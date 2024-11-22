import java.util.Scanner;
public class Array6
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int i; int s=0,k=0;
        int a[]=new int [5];
        System.out.println("Enter the array elements:");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The Entered elements are:");
        {
            for(i=0;i<5;i++)
            {
                System.out.print(a[i]+" ");
            }
                System.out.println();
        }
        for(i=0;i<5;i++)
        {
                s=s+a[i];
        }
        System.out.println(+s);
        for(i=0;i<5;i++)
        {
               if (a[i]%2==0)
               k=k+a[i];
        }
        System.out.println(+k);
    }//close main
}//close class 