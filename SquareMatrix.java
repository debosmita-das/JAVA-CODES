import java.util.*;
class SquareMatrix
{
    Scanner sc=new Scanner(System.in);
    public void main()
    {        
        System.out.println("Enter the size n where 3<n<10: ");
        int n=sc.nextInt();
        char arr[][]=new char[n][n];
        input(arr);
    }
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
            for(int j=0;j<arr.length;j++)
            {
                if((i==0||i==arr.length-1)&&(j==0||j==arr.length-1))
                    arr[i][j]=c1;
                else if(i==0||i==arr.length-1||j==0||j==arr.length-1)
                    arr[i][j]=c2;
                else
                    arr[i][j]=c3;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}