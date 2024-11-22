// Write a program to input 5 names and arrange then alphabetically
import java.util.Scanner;
public class Bubble_sort_name
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int i,j;
        String t;
        String nm[]=new String[5];
        System.out.println("Enter 5 names :");
        for(i=0;i<5;i++)
        {
            nm[i]=sc.nextLine();
        }
        for(i=0;i<4;i++)
        {
            for(j=(i+1);j<5;j++)
            {
                if(nm[i].compareTo(nm[j])>0)
                {
                    t=nm[i];
                    nm[i]=nm[j];
                    nm[j]=t;
                }
            }
        }
        System.out.println("The arranged names are:");
        for(i=0;i<5;i++)
        System.out.println(nm[i]);
    }//close main
}//close class 