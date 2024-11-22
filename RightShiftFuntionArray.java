import java.util.*;
class RightShiftFuntionArray
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        fnInput(arr);
        System.out.println("The original array: ");
        fnDisplay(arr);
        rshift(arr);
        System.out.println("The array after right shift:");
        fnDisplay(arr);
    }
    public void fnInput(int arr[])//Call by refernce
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+arr.length+" elements:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public void fnDisplay(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public void rshift(int arr[])
    {
        int temp=arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}