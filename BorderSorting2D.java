import java.util.*;
class BorderSorting2D
{
    Scanner sc=new Scanner(System.in);
    public void main()
    {        
        System.out.println("Enter the number of rows and columns: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        input(arr);
        display(arr);
        int x[]=new int[2*(m+n-2)];
        pick(arr,x);
        bubbleSort(x);
        place(arr,x);
        display(arr);
    }
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
    public void pick(int arr[][],int x[])
    {
        int r1=0, r2=arr.length-1, c1=0, c2=arr[0].length-1, k=0;
        for(int z=c1; z<=c2; z++)
        {
             x[k++]=arr[r1][z];
        }
        for(int i=r1+1; i<=r2; i++)
        {
             x[k++]=arr[i][c2];
        }
        for(int z=c2-1; z>=c1; z--)
        {
             x[k++]=arr[r2][z];
        }
        for(int i=r2-1; i>=r1+1; i--)
        {
             x[k++]=arr[i][c1];
        }
    }
    public void place(int arr[][],int x[])
    {
        int r1=0, r2=arr.length-1, c1=0, c2=arr[0].length-1, k=0;
        for(int z=c1; z<=c2; z++)
        {
             arr[r1][z]=x[k++];
        }
        for(int i=r1+1; i<=r2; i++)
        {
             arr[i][c2]=x[k++];
        }
        for(int z=c2-1; z>=c1; z--)
        {
             arr[r2][z]=x[k++];
        }
        for(int i=r2-1; i>=r1+1; i--)
        {
             arr[i][c1]=x[k++];
        }
    }
    public void bubbleSort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]=arr[j]+arr[j+1];
                    arr[j+1]=arr[j]-arr[j+1];
                    arr[j]=arr[j]-arr[j+1];
                }
            }
        }
    }
}