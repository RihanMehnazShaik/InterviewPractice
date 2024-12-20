package DSA;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {
    public static void main(String[] args) {
        int[] arr={3,1,2,1};
        int k=2,sum=0;
        ArrayList<Integer> list=new ArrayList<>();
        fun(0,arr,list,0,k);
    }
    public static boolean fun(int ind,int[] arr,ArrayList<Integer> list,int sum,int k){
        if(ind>=arr.length){
            if(sum==k) {
                System.out.println(list.toString());
                return true;
            }
            return false;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
        if(fun(ind+1,arr,list,sum,k)==true){
            return true;
        }
        sum-=arr[ind];
        list.remove(list.size()-1);
        if(fun(ind+1,arr,list,sum,k)==true){
            return true;
        }
        return false;
    }
}
