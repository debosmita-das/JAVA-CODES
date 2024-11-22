import java.util.*;
public class ArrayArmstrong
{//open class
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for(int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("The Armstrong nos. in the array are: ");
        for(int i = 0; i < n ; i++)
        {
            if(isArmstrong(a[i]) == true)
            {
                System.out.println(a[i]);
            }
        }
    }
    public boolean isArmstrong(int x)
    {
        int cpy=x,sum = 0;
        while(cpy>0)
        {
            int d= cpy%10;
            sum+= d*d*d;
            cpy= cpy/10;
        }
        if(x== sum)
            return true;
        return false;
    }
} 