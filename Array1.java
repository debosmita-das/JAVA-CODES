import java.util.*;
class Array1
{//open class
    public void main()
    {//open main
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        int arr3[]=new int[10];
        System.out.println("Enter the 1st array elements");
        for(int i=0;i<10;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the 2nd array elements");
        for(int d=0;d<10;d++)
        {
            arr2[d]=sc.nextInt();
        }
        System.out.println("The summed up array is: ");
        for(int p=0;p<10;p++)
        {
            arr3[p]=arr1[p]+arr2[p];
            System.out.println(arr3[p]);
        }
    }//close main
}//close class 