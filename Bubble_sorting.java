// Bubble sorting for single dimensional array(SDA) in Ascending order
import java.util.*;
public class Bubble_sorting
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int i,j,t;
        System.out.println("Enter the no. of array elements:");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter the array elements:");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<((n-1)-i);j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("The arranged numbers are :");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }//close main
}//close class 