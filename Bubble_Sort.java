/*To input n integer elements in an array and sort them in ascending order using the bubble
 * sort technique*/
import java.util.*;
public class Bubble_Sort
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements in an array");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int temp;
        int x=arr.length;
        for(int i=0;i<x-1;i++)                 //bubble sort technique
        {
            for(int j=0;j<x-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array is : ");
        for(int i=0;i<x;i++)                 //loop to print elements
        {
            System.out.print(arr[i]+" ");
        }
    }//close main
}//close class 