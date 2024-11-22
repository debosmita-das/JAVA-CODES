//WAP TO INPUT n NOS. IN AN ARRAY AND COUNT THE NUMBER OF PRIME NOS.
import java.util.*;
class Primecount_Array
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The prime elements are as follows:");
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                count++;
            }
        }
        System.out.println("There are "+count+" prime nos. in the array.");
    }//close main
}//close class