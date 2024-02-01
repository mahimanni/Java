import java.util.*;
public class ShiftRight
{
  public static void shiftRow(int a[][],int m,int n)
  {
    for(int i=0;i<m;i++)
    {
      int last=a[i][n-1];
      for(int j=n-1;j>0;j--)
      {
        a[i][j]=a[i][j-1];
       }
       a[i][0]=last;
     }
     System.out.println("After shifting row-wise");
     display(a,m,n);
   } 

  public static void shiftColumn(int a[][],int m,int n)
  {
    for(int i=0;i<m;i++)
    {
      int first=a[m-1][i];
      for(int j=n-1;j>0;j--)
      {
        a[j][i]=a[j-1][i];
       }
       a[0][i]=first;
     }
     System.out.println("After shifting column-wise");
     display(a,m,n);
   } 

  public static void display(int a[][],int m,int n)
  {
   System.out.println("After shifting:");
     for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String [] args)
  {
    int m,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of rows:");
    m=sc.nextInt();
    System.out.println("Enter no of columns:");
    n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    System.out.println("Enter array elements:");
    
    for(int i=0;i<m;i++)
    {
      System.out.println("Enter"+n+"Ele for row"+(i+1));
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
        b[i][j]=a[i][j];
      }
    }
    shiftRow(a,m,n);
    shiftColumn(b,m,n);
   }
}