import java.util.*;
class ArrayEvenRec
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The number of even elements of the array are:"+EvenNum(arr,n));
    }
    public static int EvenNum(int arr[],int n) 
    {
        int c=0;
        for(int i = 0; i<n;i++)
        {
            if (arr[i] % 2 == 0) 
            {
                c++;
            }
        }
        return c;
    }
}