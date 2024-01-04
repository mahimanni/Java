import java.util.HashSet;

public class UnionOf2Arrays
{
        public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer> set = new HashSet<>();
        //using HashSet as it does no contain duplicate elements
       
        for(int i=0;i<n;i++)
        {
            set.add(a[i]);
        }
        for(int j=0;j<m;j++)
        {
            set.add(b[j]);
        }
        
        return set.size();
    }
    public static void main(String[] args)
    {
       int a[]={1,2,3,4,5};
       int b[]={1,2,3};
       System.out.println(doUnion(a,5,b,3));//O/P:5
    }
}