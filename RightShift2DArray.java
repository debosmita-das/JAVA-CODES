import java.util.*;
class RightShift2DArray
{
    Scanner sc=new Scanner(System.in);
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        input(arr);
        System.out.println("The original array: ");
        display(arr);
        rshift(arr);
        System.out.println("The array after right shift:");
        display(arr);
    }
    public void input(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int z=0; z<arr[0].length; z++)
            {
                System.out.print("Enter ["+i+","+z+"] element:");
                arr[i][z]=sc.nextInt();
            }
        }
    }
    public void display(int arr[][])
    {
        System.out.println("The array : ");
        for(int i=0; i<arr.length; i++)
        {
            for(int z=0; z<arr[0].length; z++)
            {
                String x=arr[i][z]+"";
                System.out.print(x+"    ".substring(x.length()-1));
            }
            System.out.println();
        }
    }
    public void rshift(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            int temp=arr[0][i];
            arr[0][i]=arr[i-1][i];
            arr[i-1][i]=temp;
        }
    }
}