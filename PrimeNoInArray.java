//WAP TO INPUT n NOS. IN AN ARRAY AND COUNT THE NUMBER OF PRIME NOS.
import java.util.*;
class PrimeNoInArray
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The prime elements are as follows:");
        for(int i=0;i<arr.length;i++)//Index ranges from 0 to arr.length-1
        {
            int c=0;//For every array element c must be 0
            for(int j=1;j<=arr[i];j++)
            {
                if(arr[i]%j==0)//We are counting factors of arr[i] here
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(arr[i]);
            }
        }
    }//close main
}//close class 