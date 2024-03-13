import java.util.Stack;
public class PushBottomStack
{
 public static void pushBottom(Stack<Integer> st,int data)
 {
  Stack<Integer> newStack=new Stack<>();
  while(!st.isEmpty())
  {
   newStack.push(st.peek());
   st.pop();
  }
  newStack.push(data);
  
  while(!newStack.isEmpty())
  {
   st.push(newStack.peek());
   newStack.pop();
  }

  /*if(st.isEmpty())
  {
   st.push(data);
   return;
  }
  int top=st.pop();
  pushBottom(st,data);
  st.push(top);*/
 }
 public static void main(String[] args)
 {
  Stack<Integer> st=new Stack<>();
  st.push(1);
  st.push(2);
  st.push(3);
  pushBottom(st,4);

  while(!st.isEmpty())
  {
   System.out.println(st.peek());
   st.pop(); 
  }
 }
}