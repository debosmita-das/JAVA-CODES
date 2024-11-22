//Wap to input m x n numbers in an array and find the maximum and minimum element. 
import java.util.*;
class MaxMin2D extends InputDisplay2D
{
    Scanner sc=new Scanner(System.in);
    public void main()
    {        
        System.out.println("Enter the number of rows and columns: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        input(arr);
        display(arr);
        Minimum(arr);
        Maximum(arr);
    }
    public void Minimum(int arr[][])
    {
        System.out.println("The minimum element is:");
        int min=arr[0][0];
        for(int i=0; i<arr.length; i++)
        {
            for(int z=0; z<arr[0].length; z++)
            {
                if(arr[i][z]<min)
                {
                    min=arr[i][z];
                }
            }
        }
        System.out.println(min+",");
    }
    public void Maximum(int arr[][])
    {
        System.out.println("The maximum element is:");
        int max=arr[0][0];
        for(int i=0; i<arr.length; i++)
        {
            for(int z=0; z<arr[0].length; z++)
            {
                if(arr[i][z]>max)
                {
                    max=arr[i][z];
                }
            }
        }
        System.out.println(max+",");
    }
}