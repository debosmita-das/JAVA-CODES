//Wap to input m x n numbers in an array and find the maximum and minimum of each column. 
import java.util.*;
class MaxMinColumn2D extends InputDisplay2D
{
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
        System.out.println("The minimum element in each column are:");
        for(int z=0; z<arr[0].length; z++)
        {
            int min=arr[0][z];
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i][z]<min)
                {
                    min=arr[i][z];
                }
            }
            System.out.print(min+",");
        }
        System.out.println();
    }
    public void Maximum(int arr[][])
    {
        System.out.println("The maximum element in each column are:");
        for(int z=0; z<arr[0].length; z++)
        {
            int max=arr[0][z];
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i][z]>max)
                {
                    max=arr[i][z];
                }
            }
            System.out.print(max+",");
        }
        System.out.println();
    }
}