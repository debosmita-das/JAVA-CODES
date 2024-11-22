import java.util.*;
class Matrix_Multiplication
{//open class
    public void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column length of first matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter the row and column length of second matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        if(r2!=c1)
        {
            System.out.println("Multiplication is not possible");
            return;
        }
        System.out.println("Enter the matrix elements of the first matrix");
        int a[][]=new int[r1][c1];
        for(int i=0; i<r1; i++)
        {
            for(int z=0; z<c1; z++)
            {
                System.out.print("Enter ["+i+","+z+"] element:");
                a[i][z]=sc.nextInt();
            }
        }
        System.out.println("The first array : ");
        for(int i=0; i<r1; i++)
        {
            for(int z=0; z<c1; z++)
            {
                String x=a[i][z]+"";
                System.out.print(x+"    ".substring(x.length()-1));
            }
            System.out.println();
        }
        System.out.println("Enter the matrix elements of the second matrix");
        int b[][]=new int[r2][c2];
        for(int i=0; i<r2; i++)
        {
            for(int z=0; z<c2; z++)
            {
                System.out.print("Enter ["+i+","+z+"] element:");
                b[i][z]=sc.nextInt();
            }
        }
        System.out.println("The second array : ");
        for(int i=0; i<r2; i++)
        {
            for(int z=0; z<c2; z++)
            {
                String x=b[i][z]+"";
                System.out.print(x+"    ".substring(x.length()-1));
            }
            System.out.println();
        }
        int c[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<r2;k++)
                {
                    c[i][j]+= a[i][k]*b[k][j];
                }
            }
        }
        System.out.print("The multiplied matrix is:");
        for(int i=0; i<r1; i++)
        {
            for(int z=0; z<c2; z++)
            {
                String x=c[i][z]+"";
                System.out.print(x+"    ".substring(x.length()-1));
            }
            System.out.println();
        }
    }//close main
}//close class  