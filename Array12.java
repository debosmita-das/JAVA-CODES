//WAP TO INPUT 'N' INTEGERS IN AN ARRAY.STORE THE ODD INTEGERS OF THE ARRAY IN ANOTHER ARRAY AND PRINT THE NEW ARRAY.
import java.util.*;
class Array12
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values of the array");//elements of the array to be entered
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int b[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                b[j]=arr[i];
                j++;
            }
        }
        System.out.println("The new array with odds are:");
        for(int i=0;i<j;i++)
        {
            System.out.println(b[i]);
        }
    }//close main
}//close class 