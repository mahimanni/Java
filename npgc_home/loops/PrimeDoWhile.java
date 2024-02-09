import java.io.*;
public class PrimeDoWhile
{
  public static void main(String []args) throws IOException
  {
    int n;
    int i=2,f=0;

    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a no:");
    n=Integer.parseInt(br.readLine());

    do{
       if(n%i==0 && n!=2)
       {
       System.out.println(n+" is not a Prime");
       f=1;
       break;
       }
       i++;
    }while(i<=n/2);
    if(f==0)
      System.out.println(n+" is a Prime");
  }
}