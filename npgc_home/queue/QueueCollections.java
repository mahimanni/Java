//Implementation of Queue using Collections framework
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class QueueCollections
{
 public static void main(String [] args)
 {
  //Queue<Integer> q=new Queue();//wrong as queue is a interface
  //Queue is an interface not a class in java
  //And objects can only be made of a class not of an interface

  //ArrayDeque and LinkedList are the two classes that implements queue interface
 //differences based on cache of memory


  //Queue<Integer> q=new LinkedList<>();//imp
  Queue<Integer> q=new ArrayDeque<>();//imp

  q.add(1);
  q.add(2);
  q.add(3);
  q.add(4);
  q.add(5);

  while(!q.isEmpty())
  {
   System.out.println(q.peek());
   q.remove();
  }

 }
}