import java.util.*;
class ArrayCommon  
{//open class
    public void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("1st array input:");
        fnInput(A);
        int B[]=new int[n];
        System.out.println("2nd array input:");
        fnInput(B);
        System.out.println("The common elements are:");
        System.out.println(common(A,B)+" common elements!");
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
    public int common(int A[], int B[])
    {
        int c=0;
        for(int i=0; i<A.length; i++)
        {
            for(int z=0; z<B.length; z++)
            {
                if(A[i]==B[z])
                {
                    c++;
                    System.out.println(A[i]);
                }
            }
        }
        return c;
    }
}//close class 