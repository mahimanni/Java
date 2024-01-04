/*Given an array A of N elements.
 Find the majority element in the array. 
 A majority element in an array A of size N is an element 
 that appears strictly more than N/2 times in the array.*/

import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int value,s=size/2;
        
        for(int i=0;i<size;i++)
        {
            if(map.containsKey(a[i]))
            {
             value=map.get(a[i]);//if key exists gives value
             map.put(a[i],value+1);
            } 
            else
            {
                map.put(a[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>s)
               return e.getKey();
        }
        return -1;
    }
    public static void main(String [] args)
    {
       int N = 5 ;
       int A[] = {3,1,3,3,2} ;
       System.out.println(majorityElement(A,N));
       /* O/P=3 
       Since, 3 is present more than N/2 times, so it is 
       the majority element.*/
    }
}
