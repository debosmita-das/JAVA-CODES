import java.util.*;
class RectangularMatrix
{//open class
    Scanner sc=new Scanner(System.in);
    public void main()
    {//open main    
        System.out.println("Enter the size m & n where 3<m,n<10: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        char arr[][]=new char[m][n];
        input(arr);
    }//close main
    public void input(char arr[][])
    {
        System.out.println("ENTER FIRST CHARACTER");
        char c1=sc.next().charAt(0);
        System.out.println("ENTER SECOND CHARACTER");
        char c2=sc.next().charAt(0);
        System.out.println("ENTER THIRD CHARACTER");
        char c3=sc.next().charAt(0);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if((i==0||i==arr.length-1)&&(j==0||j==arr[0].length-1))
                    arr[i][j]=c1;
                else if(i==0||i==arr.length-1||j==0||j==arr[0].length-1)
                    arr[i][j]=c2;
                else
                    arr[i][j]=c3;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}//close class 