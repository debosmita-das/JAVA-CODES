// WAP to input 5 numbers and arrange then alphabetically.
import java.util.Scanner;
class Bubble_Sorting2
{//open class
    public static void main ()
    {//open main
        Scanner sc=new Scanner(System.in);
        int i,j;
        int t;
        System.out.println("Enter the no. of terms to be entered ");
        int n=sc.nextInt();
        int nm[]=new int[n];
        System.out.println("Enter the numbers:");
        for(i=0;i<n;i++)
        {
            nm[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=(i+1);j<n;j++)
            {
                if((nm[i])>(nm[j]))
                {
                    t=nm[i];
                    nm[i]=nm[j];
                    nm[j]=t;
                }
            }
        }
        System.out.println("The arranged numbers are:");
        for(i=0;i<n;i++)
        {
            System.out.println(nm[i]);
        }
    }//close main
}//close class 