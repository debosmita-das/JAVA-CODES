import java.util.*;
class Array9
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int i,sumodd=0,sumeven=0;
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            sumeven=sumeven+arr[i];
            else
            sumodd=sumodd+arr[i];
        }
        System.out.println("Sum of all even nos.= "+sumeven);
        System.out.println("Sum of all odd nos.= "+sumodd);
    }//close main
}//close class 