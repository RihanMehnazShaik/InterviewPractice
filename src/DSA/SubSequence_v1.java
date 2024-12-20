package DSA;

import java.util.ArrayList;
import java.util.List;
//count the number of subsequences
public class SubSequence_v1 {
    public static void main(String[] args) {
        int[] arr={3,1,2,1,0};
        int k=3,sum=0,count=0;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(fun(0,arr,list,0,k,count));
    }
    public static int fun(int ind,int[] arr,ArrayList<Integer> list,int sum,int k,int count){
        if(ind>=arr.length){
            if(sum==k) {
                count++;
                System.out.println(list.toString());
            }
            return count;
        }
        list.add(arr[ind]);
        sum+=arr[ind];
        count=fun(ind+1,arr,list,sum,k,count);
        sum-=arr[ind];
        list.remove(list.size()-1);
        count=fun(ind+1,arr,list,sum,k,count);
        return count;
    }
}

