import java.util.*;
class LeftShiftArray_byx
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
        temp=a[0];
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        for(i=0;i<(n-x);i++)
        {
            a[i]=a[i+x];
        }
        a[n-x]=temp;
        System.out.println("New array after left shifting the elememts by "+x+" postion: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    } 
}