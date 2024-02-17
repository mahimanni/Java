import java.util.*;
public class CheckHtmlTags
{
 public static void check(String s)
 {
  ArrayList<String> al=new ArrayList<>();//list will contain only the tag names
  int i=0,n=s.length();
  while(i<n)
  {
    char ch=s.charAt(i);
    String str="";
    if(ch=='<')
    {
     while(s.charAt(i+1)!='>')//to extract the tag name between <>
     {
       i+=1;
       ch=s.charAt(i);
       str+=ch;
     }
     al.add(str);//adding tag name to the list
    }
   i+=1;
  }//while loop ends here
 
  int flag;
  for(i=0;i<al.size();i++)
  {
    flag=0;
    String x=al.get(i);//getting tag names
    for(int j=i+1;j<al.size();j++)//starting from the i+1 ele in list
    {
     String y=al.get(j);
     if(x.equals(y))
     {
         flag=1;
         System.out.println(y+" is not closed slash missing");    
         break;
     }
    }

    if(x.charAt(0)!='/' && flag!=1)//opening tag whose closing tag is never found 
    {
      String m="/"+x;
      if(!al.contains(m) && x.equals("br")==false &&  x.equals("hr")==false)
          System.out.println(x+" tag is not closed anywhere.");
    }

    else if(x.charAt(0)=='/' && flag!=1)//closing tag which is never opened
    {
     if(!al.contains(x.substring(1,x.length())))
          System.out.println(x+" tag is not opened anywhere.");
    }
  }//outer for ends here
 
 }//method ends here

 public static void main(String [] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the html code:");
  String s=sc.nextLine();
  check(s);
 }
}

/*
<html>
<head>
<title>Hello<title>
</head>
<h1><hr><br><p>
Paragraph<p>
<h1><h1>
</body>
</html>
*/