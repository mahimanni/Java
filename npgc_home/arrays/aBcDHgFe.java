import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class aBcDHgFe
{
 public static void main(String [] args)throws IOException
 {
   int p=97,q=65,m,n,x=0;

   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the no of rows:");
   m=Integer.parseInt(br.readLine());
   System.out.println("Enter the no of columns:");
   n=Integer.parseInt(br.readLine());

   char a[][]=new char[m][n];

   int r1=0;
   while(x<m*n)
   {
    for(int i=0;i<m;i++)
    {
     if(x%2==0)
      a[r1][i]=(char)p;
     else
      a[r1][i]=(char)q;
     p+=1;
     q+=1;
     x+=1;
    }
    
    r1+=1;
    if(r1>=m)
      break;

    for(int j=n-1;j>=0;j--)
    {
     if(x%2==0)
      a[r1][j]=(char)p;
     else
      a[r1][j]=(char)q;
     p+=1;
     q+=1;
     x+=1;
    }
    
    r1+=1;
   }//while ends here
   
   for(int i=0;i<m;i++)
   {
    for(int j=0;j<n;j++)
    {
     System.out.print(a[i][j]+" ");
    }
    System.out.println();
   }

 }
}