import java.util.*;
class LinearSearch
{//open class
    public void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        fnInput(arr);
        System.out.println("Enter search element:");
        int x=sc.nextInt();
        int indx=fnSearch(arr,x);
        if(indx==-1)
        {
            System.out.println(x+" is not present in the array!");
        }
        else
        {
            System.out.println(x+" is present at index "+indx+" in the array!!!");
        }
    }//close main
    public void fnInput(int arr[])//Call by refernce
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+arr.length+" elements:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    public int fnSearch(int arr[], int x)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(x==arr[i])
                return i;
        }
        return -1;
    }
}//close class 