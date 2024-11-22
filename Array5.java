import java.util.Scanner;
class Array5
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int i,j;
        int a[][]=new int [2][2];
        System.out.println("Enter the array elements:");
        for(i=0;i<2;i++)
        { 
            for(j=0;j<2;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("The Entered elements are:");
        {
            for(i=0;i<2;i++)
            { 
                for(j=0;j<2;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }//close main
}//close class 