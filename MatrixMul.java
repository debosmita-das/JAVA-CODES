import java.io.*;
class MatrixMul
{
   public void main()throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the number of rows and columns of the 1st matrix : ");
       int r1=Integer.parseInt(br.readLine());
       int c1=Integer.parseInt(br.readLine());
       int arr1[][]=new int[r1][c1];
       System.out.print("Enter the number of rows and columns of the 2nd matrix : ");
       int r2=Integer.parseInt(br.readLine());
       int c2=Integer.parseInt(br.readLine());
       int arr2[][]=new int[r2][c2];
       if(c1!=r2)
       {
           System.out.println("The two matrices cannot be multiplied!");
           return;
       }
       System.out.println("Fill 1st Matrix:");
       fnFill(arr1);
       System.out.println("Fill 2nd Matrix:");
       fnFill(arr2);
       int arr[][]=new int[r1][c2];
       System.out.println("The 1st matrix:");
       fnDisplay(arr1);
       System.out.println("The 2nd matrix:");
       fnDisplay(arr2);
       fnMatMul(arr1,arr2,arr);
       System.out.println("The resultant matrix: ");
       fnDisplay(arr);
   } 
   public void fnFill(int arr[][])throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       for(int i=0;i<arr.length;i++) 
       {
           for(int j=0; j<arr[0].length; j++)
           {
               System.out.print("Enter element at ["+i+"]["+j+"] :");
               arr[i][j]=Integer.parseInt(br.readLine());
           }
       }
   }
   public void fnDisplay(int arr[][])
   {
       for(int i=0; i<arr.length; i++)
       {
           for(int z=0; z<arr[0].length; z++)
               System.out.print(arr[i][z]+" ");
           System.out.println();
       }
   }  
   public void fnMatMul(int arr1[][], int arr2[][], int arr[][])
   {
       for(int i=0; i<arr.length; i++)// red
       {
           for(int j=0; j<arr[0].length; j++)//blue
           {
               int s=0;
               for(int z=0; z<arr1[0].length; z++)//green
               {
                   s+=arr1[i][z]*arr2[z][j];
               }
               arr[i][j]=s;
           }
       }
   }
}