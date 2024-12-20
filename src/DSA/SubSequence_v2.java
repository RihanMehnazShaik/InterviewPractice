package DSA;

import java.util.ArrayList;
import java.util.List;
//count no of sub sequences.
public class SubSequence_v2 {
    public static void main(String[] args) {
        int[] arr={3,1,2,1};
        int k=3,sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(fun(0,arr,list,0,k));
    }
    public static int fun(int ind,int[] arr,ArrayList<Integer> list,int sum,int k){
        if(ind>=arr.length){
            if(sum==k) {
                return 1;
            }
            return 0;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
        int l=fun(ind+1,arr,list,sum,k);
        sum-=arr[ind];
        list.remove(list.size()-1);
        int r=fun(ind+1,arr,list,sum,k);
        return l+r;
    }
}

