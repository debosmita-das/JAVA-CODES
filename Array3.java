//WAP TO INPUT 'N' INTEGERS IN AN ARRAY.FIND THE LARGEST AND SMALLEST IN THE ARRAY.
import java.util.*;
class Array3
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int m=sc.nextInt();
        int arr[]=new int[m];
        System.out.println("Enter integers in the array");
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=1;i<m;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Largest element ="+max);
        System.out.println("Smallest element ="+min);
    }//close main
}//close class 