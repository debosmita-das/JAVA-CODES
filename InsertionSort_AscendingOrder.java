import java.util.*;
class InsertionSort_AscendingOrder
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int arr[]=new int[sc.nextInt()];
        input(arr);
        System.out.println("Original Array: ");
        display(arr);
        insertionSort(arr);
        System.out.println("The sorted array: ");
        display(arr);
    }
    public void display(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void input(int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+arr.length+" elements:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public void insertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int t=arr[i];
            int j=i-1;
            while(j>0 && arr[j]>t)//j=0, arr[j]<=t
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=t;
        }
    }
}