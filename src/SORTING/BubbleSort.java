package SORTING;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,6,1,7};
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
