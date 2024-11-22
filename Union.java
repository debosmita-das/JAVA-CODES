import java.io.*;
class Union
{
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of 1st array followed by size of 2nd array:");
        int arr1[]=new int[Integer.parseInt(br.readLine())];
        int arr2[]=new int[Integer.parseInt(br.readLine())];
        System.out.println("Enter "+arr1.length+" elements of 1st array:");
        fnFill(arr1);
        System.out.println("Enter "+arr2.length+" elements of 2nd array:");
        fnFill(arr2);
        fnUnion(arr1, arr2);
    }
    public void fnFill(int arr[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    public void fnUnion(int arr1[], int arr2[])
    {
        int arr[]=new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++)
        {
            arr[i]=arr1[i];
        }
        int x=arr1.length;
        for(int i=0; i<arr2.length; i++)
        {
            int c=0;
            for(int z=0; z<x; z++)
            {
                if(arr[z]==arr2[i])
                    c++;
            }
            if(c==0)
                arr[x++]=arr2[i];
        }
        System.out.println("Union:");
        for(int i=0; i<x; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}