import java.util.*;
class RightShiftArray
{  
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,n,temp;
        System.out.println("Enter the number of elements:") ;
        n = sc.nextInt();
        int a[]= new int[n]; 
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        { 
            a[i] = sc.nextInt();
        }
        temp=a[n-1];
        for(i=n-1;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp;
        System.out.println("New array after right shifting the elememts by one postion: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    } 
}