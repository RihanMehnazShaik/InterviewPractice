package SORTING;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,1,5,7,2};
        int n=arr.length;
        Mergesort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void Mergesort(int[] arr,int beg,int end){

            if(beg<end){
            int mid = beg + (end - beg) / 2;
            Mergesort(arr, beg, mid);
            Mergesort(arr, mid + 1, end);
            Merge(arr,beg,mid,end);
        }
    }
    public static void Merge(int[] arr,int beg,int mid,int end){
        int[] left=new int[mid-beg+1];
        int[] right=new int[end-mid];
        int n1=mid-beg+1;
        int n2=end-mid;
        for(int i=0;i<(mid-beg+1);i++){
            left[i]=arr[i+beg];
        }
        for(int j=0;j<(end-mid);j++){
            right[j]=arr[j+mid+1];
        }
        int i=0,j=0,k=beg;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i=i+1;
            }else{
                arr[k]=right[j];
                j=j+1;
            }
            k=k+1;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
}
