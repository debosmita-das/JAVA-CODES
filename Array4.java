//WAP TO INPUT 'N' INTEGERS IN AN ARRAY.STORE THE ODD INTEGERS OF THE ARRAY IN ANOTHER ARRAY & PRINT THE NEW ARRAY.
import java.util.*;
class Array4
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("Enter size of the array");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter elements in the array");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int b[]=new int[n];
            int j=0;
            for(int i=0;i<n;i++)
            {
                if(a[i]%2!=0)
                {
                    b[j]=a[i];
                    j++;
                }
            }
            System.out.println("The new array with odds are :");
            for(int i=0;i<j;i++)
            {
                 System.out.println(b[i]);
            }
        }
    }//close main
}//close class 