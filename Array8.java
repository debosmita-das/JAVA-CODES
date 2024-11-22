import java.util.*;
public class Array8
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int ArrayNum[]=new int[20];
        System.out.println("Enter 20 integers");
        for(int i=0;i<20;i=i+1)
        {
            ArrayNum[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<20;i++)
        {
            if(ArrayNum[i]%2==0)
            sum+=(int)Math.pow(ArrayNum[i],2);
            else
            sum+=(int)Math.pow(ArrayNum[i],3);
        }
        System.out.println("Required sum is :"+sum);
    }//close main
}//close class 