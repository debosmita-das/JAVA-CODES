//Wap to input m x n numbers in an array and find the sum of each column. 
import java.util.*;
class Sumofeachcolumn extends InputDisplay2D
{
    public void main()
    {        
        System.out.println("Enter the number of rows and columns: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        input(arr);
        display(arr);
        sumofColumn(arr);
    }
    public void sumofColumn(int arr[][])
    {
        for(int i =0;i<arr[0].length;i++)
        {
            int s=0;
            for (int j=0;j<arr.length;j++)
            {
                s+=arr[j][i];
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" : "+s);
        }
    }
}