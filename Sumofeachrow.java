//Wap to input m x n elements in an array and find the sum of each row.
import java.util.*;
class Sumofeachrow extends InputDisplay2D
{
    public void main()
    {        
        System.out.println("Enter the number of rows and columns: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        input(arr);
        display(arr);
        sumofRow(arr);
    }
    public void sumofRow(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            int s=0;
            for(int z=0; z<arr[0].length; z++)
            {
                s+=arr[i][z];
                System.out.print(arr[i][z]+" ");
            }
            System.out.println(" : "+s);
        }
    }
}