//Wap to input n numbers in an array and calculate and print the sum of all the elements
import java.io.*;
class ArraySum
{//open class
    public void main()throws IOException
    {//open main
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the array:");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        System.out.println("Enter "+n+" numbers:");
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("The sum of all the elements ="+sum(arr));
    }//close main
    public int sum(int arr[])
    {
        int s=0;
        for(int i=0; i<arr.length; i++)
        {
            s+=arr[i];
        }
        return s;
    }
}//close class 