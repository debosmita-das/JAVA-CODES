/*STD CODE AND CITY SEARCH
Display City if input STD or display STD if input city*/
import java.util.Scanner;
public class Stdcty
{//open class
    public static void main()
    {//open main
        Scanner sc=new Scanner (System.in);
        int i,k=0,n,ch;
        String city;
        String st[]=new String[5];
        int std[]=new int[5];
        for(i=0;i<2;i++)
        { 
            System.out.println("Enter city and STD code:");
            st[i]=sc.next();
            std[i]=sc.nextInt();
        }
        System.out.println("Enter 1 to display City and 2 to display STD:");
        System.out.println("Enter your Choice:");
        ch=sc.nextInt();
        switch(ch)
        {//open switch case
            case 1:
            System.out.println("Enter STD:");
            n=sc.nextInt();
            for(i=0;i<2;i++)
            { 
                if(std[i]==n)
                {
                    System.out.println(st[i]);
                    k=1;
                }
            }
            if(k==0)
            System.out.println("City not found:");
            break;
            
            case 2:
            System.out.println("Enter City:");
            city=sc.next();
            for(i=0;i<2;i++)
            { 
                if(city.equals(st[i]))
                {
                    System.out.println(std[i]);
                    k=1;
                }
            }
            if(k==0)
            System.out.println("STD not found:");
            break;
            
            default:
            System.out.println("Wrong Choice!!");
        }//close switch class
    }//close main
}//close class 