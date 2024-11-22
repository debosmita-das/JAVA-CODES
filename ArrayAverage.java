import java.util.*;
class ArrayAverage
{//openclass
    public static void main (String[] args)
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
        printBelowAvg(arr,n);
    }//close main
    static void printBelowAvg(int arr[], int n)
    {
        double avg = 0,total=0;
        for (int i = 0; i<n; i++)
        {
            total = total + arr[i];
            avg = total / n;
        }
        for (int i = 0; i < n; i++)
            if (arr[i] < avg)
                System.out.println(arr[i] + " ");
    }
}//closeclass 