//Wap to input n numbers in an array and display the sum of all the prime numbers.
import java.util.*;
class ArrayPrime
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        { 
            int j = 2;
            int p = 1;
            while (j < arr[i]) 
            {
                if (arr[i] % j == 0) 
                {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) 
            {
                sum = sum + arr[i];
            }
            System.out.println("The sum of the elements of the array is :"+sum);
        }
    }
}