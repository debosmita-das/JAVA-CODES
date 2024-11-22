import java.util.*;
class RevOrderCol extends InputDisplay2D
{
    public void main()
    {
        System.out.println("Enter number of rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Fill array:");
        input(arr);
        System.out.println("You have entered the following matrix:");
        display(arr);
        revColOrder(arr);
        System.out.println("New array after reversing order of each col: ");
        display(arr);
    }
    public void revColOrder(int arr[][])
    {
        for(int i=0; i<arr.length/2; i++)
        {
            for(int z=0; z<arr[0].length; z++)
            {
                int t=arr[i][z];
                arr[i][z]=arr[arr.length-1-i][z];
                arr[arr.length-1-i][z]=t;
            }
        }
    }
}