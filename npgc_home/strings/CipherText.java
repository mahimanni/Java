import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CipherText
{
 public static String encrypt(String s,int n)
 {
  String str="";
  for(int i=0;i<s.length();i++)
  {
   char ch=s.charAt(i);

   //for uppercase
   if(ch>=65 && ch<=90)
   {
    if(ch+n>90)
     str+=(char)(64+(n+ch-90));
    else
     str+=(char)(ch+n);
   }
   
   //for lowercase
   else if(ch>=97 && ch<=122)
   {
     if(ch+n>122)
      str+=(char)(96+(n+ch-122));
     else
      str+=(char)(ch+n);
   }
   
   //for numbers
   else if(ch>=48 && ch<=57)
   {
     if(ch+n>57)
      str+=(char)(47+(n+ch-57));
     else
      str+=(char)(ch+n);
   }
  
   //for any other character
   else
   {
     str+=s.charAt(i);
   }
  }//for loop ends here
  return str;
 }
 
 public static String decrypt(String s,int n)
 {
  String str="";
  for(int i=0;i<s.length();i++)
  {
   char ch=s.charAt(i);
   if(ch>=65 && ch<=90)
   {
     if(ch-n<65)
      str+=(char)(91-(n-(ch-65)));
     else
      str+=(char)(ch-n);
   }
   else if(ch>=97 && ch<=122)
   {
     if(ch-n<97)
      str+=(char)(123-(n-(ch-97)));
     else
      str+=(char)(ch-n);
   }
   else if(ch>=48 && ch<=57)
   { 
     if(ch-n<48)
       str+=(char)(58-(n-(ch-48)));
     else
       str+=(char)(ch-n);
   }
   else
   {
     str+=s.charAt(i);
   }
  }
  return str;
 }

 public static void main(String [] args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the plain text to encrpt:");
  String e=br.readLine();
  System.out.println("Enter the value of n for the encryption algorithm:");
  int n=Integer.parseInt(br.readLine());
  System.out.println("Encrypted text(cipher text) is:"+encrypt(e,n));

  System.out.println("Enter the cipher text to decrypt:");
  String d=br.readLine();
  System.out.println("Enter the value of n for the decryption algorithm:");
  n=Integer.parseInt(br.readLine());
  System.out.println("Decrypted cipher is:"+decrypt(d,n));
 }
}