//Wap to input m x n numbers in an array and find the maximum and minimum of each row. 
import java.util.*;
class MaxMinRow2D extends InputDisplay2D
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
        System.out.println("The minimum elements are:");
        for(int i=0; i<arr.length; i++)
        {
            int min=arr[i][0];
            for(int z=0; z<arr[0].length; z++)
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
        System.out.println("The maximum elements are:");
        for(int i=0; i<arr.length; i++)
        {
            int max=arr[i][0];
            for(int z=0; z<arr[0].length; z++)
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