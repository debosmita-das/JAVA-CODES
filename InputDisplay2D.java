// Wap to input m x n numbers in a 2D array and display all the elements in row major format
import java.util.*;
class InputDisplay2D
{//open class
    Scanner sc=new Scanner(System.in);
    public void main()
    {//open main   
        System.out.println("Enter the number of rows and columns: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        input(arr);
        display(arr);
    }//close main
    public void input(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int z=0; z<arr[0].length; z++)
            {
                System.out.print("Enter ["+i+","+z+"] element:");
                arr[i][z]=sc.nextInt();
            }
        }
    }
    public void display(int arr[][])
    {
        System.out.println("The array : ");
        for(int i=0; i<arr.length; i++)
        {
            for(int z=0; z<arr[0].length; z++)
            {
                String x=arr[i][z]+"";
                System.out.print(x+"    ".substring(x.length()-1));
            }
            System.out.println();
        }
    }
}//close class 