import java.util.*;
class LeftShiftArray
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
        for(i=0;i<(n-1);i++)
        {
            a[i]=a[i+1];
        }
        a[n-1]=temp;
        System.out.println("New array after left shifting the elememts by one postion: ");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    } 
}