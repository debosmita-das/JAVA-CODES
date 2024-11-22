//WAP TO INPUT 'N' INTEGERS IN AN ARRAY .FIND THE MAXIMUM AND THE MINIMUM IN THE ARRAY.
import java.util.*;
class MaxMin
{//open class
    public void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int m=sc.nextInt();
        int ar[]=new int[m];
        System.out.println("Enter integers in the array");
        for(int i=0;i<m;i++)
        {
            ar[i]=sc.nextInt();
        }
        int max=ar[0],min=ar[0];
        for(int i=1;i<m;i++)
        {
             if(ar[i]>max)
             max=ar[i];
             if(ar[i]<min)
             min=ar[i];
        }
            System.out.println("Largest Element :"+max);
            System.out.println("Smallest Element :"+min);
        }//close main
}//close class 