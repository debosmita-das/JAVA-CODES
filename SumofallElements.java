//Wap to input m x n elements in an array and find the sum of all the elements. 
import java.util.*;
class SumofallElements extends InputDisplay2D
{
    public void main()
    {        
        System.out.println("Enter the number of rows and columns: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        input(arr);
        display(arr);
        Sum(arr);
    }
    public void Sum(int arr[][])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int z=0; z<arr[0].length; z++)
            {
                sum+=arr[i][z];
                System.out.print(arr[i][z]+" ");
            }
        }
        System.out.println(": "+sum);
    }
}