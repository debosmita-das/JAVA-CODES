import java.util.*;
class ArraySum_Rec
{//open class
    public void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The sum of all the elements of the array is: "+Sum(arr,n));
    }//close main
    public int Sum(int[] arr,int n) 
    {
        int sum = 0;
        for(int i=0;i<n;i++) 
        {
            sum = sum + arr[i];
        }
        return sum;
    }
}//close class 