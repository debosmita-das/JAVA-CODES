import java.util.*;
class Display2DSingleLoop extends InputDisplay2D
{
    public void main()
    {
        System.out.println("Enter number of rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        input(arr);
        dis(arr);
    }
    public void dis(int arr[][])
    {
        int i=0, z=0;
        while(true)
        {
            String x=arr[i][z]+"";
            System.out.print(x+"    ".substring(x.length()-1));
            if(i==arr.length-1 && z==arr[0].length-1)
                break;
            z=(z+1) % arr[0].length;
            if(z==0)
            {
                i=(i+1) % arr.length;
                System.out.println();
            }
        }
    }
}