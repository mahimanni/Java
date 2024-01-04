import java.util.HashSet;

public class InteresectionOf2Arrays {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++)
            set.add(a[i]);//we got unique ele of array 1
       
        for(int i=0;i<m;i++)
        {
            if(set.contains(b[i]))
            {
                count+=1;
                set.remove(b[i]);
            }  
        }
        
        return count;
    }
    public static void main(String[] args)
    {
       int a[]={1,2,3,4,5};
       int b[]={1,2,3};
       System.out.println(NumberofElementsInIntersection(a,b,5,3));//O/P:3
    }
}
