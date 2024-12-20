package SORTING;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,1,4,7,2};
        int n=arr.length,maxNumIdx;
        for(int i=0;i<n;i++){
            int last=n-i-1;
            maxNumIdx=findIdx(arr,0,last);
            int temp=arr[maxNumIdx];
            arr[maxNumIdx]=arr[last];
            arr[last]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int findIdx(int[] arr,int beg,int last){
        int max=arr[0],maxIdx=0;
        for(int i=0;i<=last;i++){
            if(arr[i]>max){
                max=arr[i];
                maxIdx=i;
            }
        }
        return maxIdx;
    }
}
