import java.util.*;
class BubbleSort_DescendingOrder
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int arr[]=new int[sc.nextInt()];
        input(arr);
        System.out.println("Original Array: ");
        display(arr);
        bubbleSort(arr);
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
    public void bubbleSort(int arr[])
    {
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}