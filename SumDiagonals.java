import java.util.*;
class SumDiagonals extends InputDisplay2D
{
    public void main()
    {
        System.out.println("Enter number of rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        if(m!=n)
        {
            System.out.println("Diagonal Not Present! Exitting...");
            return;
        }
        System.out.println("Fill array:");
        input(arr);
        System.out.println("You have entered the following matrix:");
        display(arr);
        System.out.println("Sum of Leading Diagonal Elements: "+sumLeadDiag(arr));
        System.out.println("Sum of Reverse Diagonal Elements: "+sumReverseDiag(arr));
    }
    public int sumLeadDiag(int arr[][])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i][i];
        }
        return sum;
    }
    public int sumReverseDiag(int arr[][])
    {
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i][arr[0].length-i-1];
        }
        return sum;
    }
}