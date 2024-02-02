/*A square matrix is the matrix in which the number of rows is equal to the number of columns.Thus, a matrix of order n*n is called a Square Matrix
WAP in java to fill the numbers in a circular fashion(clockwise) with natural numbers from 1 to n^2,taking n as input.

For example- if n=4,then n^2=16, then the array is filled as:

1       2       3       4
12      13      14      5
11      16      15      6
10      9       8       7

*/

import java.util.*;
public class GenerateMatrixClockwise
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of the matrix:");
   int n=sc.nextInt();

   int a[][]=new int[n][n];
   int c1=0,c2=n-1,r1=0,r2=n-1,k=1,i,j;

   //generating the matrix
   do
   {
    for(i=c1;i<=c2;i++)// loop for printing 0th row(r1) from column1(c1) to column2(c2) : 1 2 3 4 row wise
    {
     a[r1][i]=k;
     k++;
    }
   
    for(j=r1+1;j<=r2;j++)//for printing n-1 th column(c2) from 1st row(r1+1) to n-1th(last) row(r2): 5 6 7 column wise
    {
     a[j][c2]=k;
     k++;
    }
   
    for(i=c2-1;i>=c1;i--)//for printing n-1th row(r2) from n-2 th column(c2-1) to 0th col(c1) excluding a[n-1][n-1]=7 as it is considered above :(8 9 10) 
    {
     a[r2][i]=k;
     k++;
    }
 
    for(j=r2-1;j>=r1+1;j--)//for printing (11 12) from n-2 th row(r2-1) to 1st row(r1+1) and column is 0
    {
     a[j][c1]=k;
     k++;
    }
   
    //to repeat the process we need to update the varibles so that 13 14 15 16 should be printed like above
    c1++;
    r1++;
    c2--;
    r2--;
   }
   while(k<=n*n);

   //printing the matrix
   System.out.println("Circular matrix in clockwise order is listed below:");
   for(i=0;i<n;i++)
   {
    for(j=0;j<n;j++)
    {
     System.out.print(a[i][j]+"\t");
    }
    System.out.println();
   }
   
 }//main method ends here
}//class ends here