import java.util.*;
class ShiftUserChoice extends InputDisplay2D
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int arr[][]=new int[sc.nextInt()][sc.nextInt()];
        System.out.println("Fill the array: ");
        input(arr);
        System.out.println("Original Array:");
        display(arr);
        System.out.println("Enter value of x:");
        int x=sc.nextInt();
        System.out.println("Enter 1 and 2 for right shift and left shift respectively:");
        switch(sc.nextInt())
        {
            case 1: rShift(arr,x);
                    break;
            case 2: lShift(arr,x);
                    break;
            default: System.out.println("Invalid Choice!");
                     return;
        }
        System.out.println("The matrix after successful shift:");
        display(arr);
    }
    public void rShift(int arr[][], int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<=x; j++)
            {
                int t=arr[i][arr[0].length-1];
                for(int z=arr[0].length-2; z>=0; z--)
                {
                    arr[i][z+1]=arr[i][z];
                }
                arr[i][0]=t;
            }
        }
    }
    public void lShift(int arr[][], int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=1; j<=x; j++)
            {
                int t=arr[i][0];
                for(int z=1; z<arr[0].length; z++)
                {
                    arr[i][z-1]=arr[i][z];
                }
                arr[i][arr[0].length-1]=t;
            }
        }
    }
}