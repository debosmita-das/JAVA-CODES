//WAP TO TAKE 10 USER INPUT NO. IN AN ARRAY & PRINT THEM ACCORDINGLY.
import java.util.*;
class Array2
{//open class
    public void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the nos.");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered values are;");
        for(int j=0;j<10;j++)
        {
            System.out.println(arr[j]);
        }
    }//close main
}//close class 