import java.util.*;
public class No
{
  public static boolean magic(int n)
  {
    int a,s=0;
    while(n>9)
    {
      while(n>0)
      {
        a=n%10;
        s=s+a;
        n=n/10;
      }
      if(s==1)
      {
        return true;
      }
      else
      {
         n=s;
         s=0;
      }
    }
    return false;
  }

  public static void main(String args[])
  {    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no");
    int n=sc.nextInt();
    if(magic(n)==true)
        System.out.println("Yes");
    else
        System.out.println("No");
  }
}