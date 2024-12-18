import java.util.Scanner;
public class Bubblesort
{
   public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number of elements");
   int n =sc.nextInt();
   int[] A=new int[n];
   System.out.println("enter the elements");
   for(int i=0;i<n;i++)
      A[i]=sc.nextInt();
   bubblesort(A);
   System.out.println("sorted list");
   for(int i=0;i<A.length;i++)
     System.out.println(A[i]+" ");
 }
  static void bubblesort(int[] A)
      {
       int n=A.length;
        for(int i=0;i<n-1;i++)
          for(int j=0;j<n-i-1;j++)
            if(A[j]>A[j+1])
            {
              int temp=A[j];
              A[j]=A[j+1];
              A[j+1]=temp;
            }
      }
 } 
//output
//enter number of elements
//5
//enter the elements
//12
//25
//19
//23
//8
//sorted list
//8
//12
//19
//23
//25

          
