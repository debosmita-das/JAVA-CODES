import java.util.*;
public class Number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int nm[]=new int[5];
        System.out.println("Enter the nos.");
        for(int i=0;i<5;i++)
        {
            nm[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=(1+i);j<5;j++)
            {
                if((nm[i]>nm[j]))
                {
                    int t=nm[i];
                    nm[i]=nm[j];
                    nm[j]=t;
                }
            }
        }
        System.out.println("The arranged nos. are: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(nm[i]);
        }
    }
}