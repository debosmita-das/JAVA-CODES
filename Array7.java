import java.util.*;
class Array7
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int m=sc.nextInt();
        int ar[]=new int[m];
        int br[]=new int[m];
        System.out.println("Enter elements of 1st Array");
        for(int i=0;i<m;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter elements of 2nd Array");
        for(int i=0;i<m;i++)
        {
            br[i]=sc.nextInt();
        }
        int s[]=new int[m];
        int j=m-1;
        for(int i=0;i<m;i++)
        {
            s[j]=ar[i]+br[i];
            j--;
        }
        System.out.println("Required Sum :");
        for(j=0;j<m;j++)
        {
            System.out.print(" "+s[j]);
        }
    }//close main
}//close class        