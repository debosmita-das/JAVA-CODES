//WAP IN JAVA TO ACCEPT N NO. OF ELEMENTS IN AN INTEGER ARRAY & DISPLAY THE SUM OF THE DIGITS OF EACH ELEMENT.
import java.util.*;
class Array
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            double sum=0.0;
            while(arr[j]>0)
            {
                int d=arr[j]%10;
                sum=sum+d;
                arr[j]=arr[j]/10;
            }
            System.out.println("Sum of digits = "+sum);
        }
    }
}