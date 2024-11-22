import java.util.*;
class RevOrderRow extends InputDisplay2D
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
        revRowOrder(arr);
        System.out.println("New array after reversing order of each row: ");
        display(arr);
    }
    public void revRowOrder(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int z=0; z<arr[0].length/2; z++)
            {
                int t=arr[i][z];
                arr[i][z]=arr[i][arr[0].length-1-z];
                arr[i][arr[0].length-1-z]=t;
            }
        }
    }
}