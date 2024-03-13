import java.util.Stack;
public class ReverseStack
{
 public static void pushBottom(Stack<Integer> st,int data)
 {
  if(st.isEmpty())
  {
   st.push(data);
   return;
  }
  int top=st.pop();
  pushBottom(st,data);
  st.push(top);
 }

 public static void reverse(Stack<Integer> st)
 {
  if(!st.isEmpty())
  {
   return;
  }
  int top=st.pop();
  pushBottom(st,top);
  reverse(st);
 }

 public static void main(String [] args)
 {
  Stack <Integer> st=new Stack<>();
  st.push(1);
  st.push(2);
  st.push(3);
  st.push(4);

  reverse(st);

  while(!st.isEmpty())
  {
   System.out.println(st.pop());
  }
 }
}