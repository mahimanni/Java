import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//<-------------------------------------------------------------------------------------------------------------------------------->
class Transpose
{
 int m,n;//instance variable
 //int a[][]=new int[100][100];
 int a[][];
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

 /* public Transpose()
 {
  for(int i=0;i<100;i++)
  {
   for(int j=0;i<100;j++)
   {
    a[i][j]=0;
   }
  }
 }*/

 public Transpose(int x,int y)
 {
  m=x;
  n=y;
  a=new int[m][n];
 }
 
 public void input()throws IOException//for array element input
 {
  System.out.println("Input array elements:");
  for(int i=0;i<m;i++)
  {
   System.out.println("Enter "+n+" elements for row "+(i+1)); 
   for(int j=0;j<n;j++)
   {
    a[i][j]=Integer.parseInt(br.readLine());
   }
  }
 }//input method ends here

 public void show(Transpose A)
 {
  int t;
  
  for(int i=0;i<m;i++)
  {
   for(int j=i;j<n;j++)
   {
    t=a[i][j];
    a[i][j]=A.a[j][i];
    A.a[j][i]=t;
   }
  }
  
 for(int i=0;i<m;i++)
 {
  for(int j=0;j<n;j++)
  {
   System.out.print(a[i][j]+" ");
  }
  System.out.println();
 }

 }//show method ends here
}//Transpose class ends here

//<-------------------------------------------------------------------------------------------------------------------------------->

class ExecuteTranspose
{
 public static void main(String[] args)throws IOException
 {
  Transpose Q=new Transpose(3,3);
  Q.input();
  Q.show(Q);
 }
}

