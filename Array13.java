import java.util.*;
class Array13
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[15];
        int i,j;
        System.out.println("Enter the array elements");
        for(i=0;i<15;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=arr[4];
        arr[4]=arr[12];
        arr[12]=c;
        System.out.println("The new array is:");
        for(j=0;j<15;j++)
        {
            System.out.print(arr[j]+",");
        }
    }//close main
}//close class 