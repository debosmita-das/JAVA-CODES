import java.util.*;
class Spiral2D extends InputDisplay2D
{
    public void main()
    {
        System.out.println("Enter number of rows and columns:");
        int arr[][]=new int[sc.nextInt()][sc.nextInt()];
        spiralFill(arr);
        display(arr);
    }
    public void spiralFill(int arr[][])
    {
        int r1=0, r2=arr.length-1, c1=0, c2=arr[0].length-1, k=1;
        while(k<=arr.length * arr[0].length)
        {
            for(int z=c1; z<=c2; z++)
            {
                arr[r1][z]=k++;
            }
            if(k==arr.length * arr[0].length+1)
            {
                return;
            }
            for(int i=r1+1; i<=r2; i++)
            {
                arr[i][c2]=k++;
            }
            for(int z=c2-1; z>=c1; z--)
            {
                arr[r2][z]=k++;
            }
            for(int i=r2-1; i>=r1+1; i--)
            {
                arr[i][c1]=k++;
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
    }
}
