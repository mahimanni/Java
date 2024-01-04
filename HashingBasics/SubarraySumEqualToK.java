import java.util.*;
public class  SubarraySumEqualToK
{   
    static int findSubArraySum(int Arr[], int N, int k)
    {
        //sub(i,j)=sub(j)-sub(i-1) -> sub(j)-k(i.e. sum-k)=sub(i-1)
        //sub(j) is sum of all ele from 0toj
        
        int sum=0,ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();//key->sum , value->freq
        map.put(0,1);//empty subarray
        
        for(int j=0;j<N;j++)
        {
            sum+=Arr[j];
            if(map.containsKey(sum-k))
                ans+=map.get(sum-k);
                
            if(map.containsKey(sum))
                map.put(sum,map.get(sum)+1);
            else
                map.put(sum,1);
        }
        return ans;
    }
    public static void main(String [] args)
    {
        int N = 5;
        int [] Arr = {10 , 2, -2, -20, 10};
        int k = -10;
        System.out.println(findSubArraySum(Arr,N,k));
        /*Output: 3
        Explaination: 
        Subarrays: arr[0...3], arr[1...4], arr[3..4]
        have sum exactly equal to -10.*/
    }   
}    