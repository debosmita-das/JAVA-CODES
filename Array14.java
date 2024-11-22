// Wap to input n numbers in an array and bring the largest element to the last index and display the array. 
import java.util.*;
public class Array14
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,temp;;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array");  
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum value in the array is:"+max);
    }
}