import java.io.*;
class Ad
{
  public static void main(String [] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,b,c;
    System.out.println("ENTER THE NUMBER");
    a=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    c=a+b;
    System.out.println("Sum ="+c);
}
}
  