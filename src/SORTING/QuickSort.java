package SORTING;

import java.sql.SQLOutput;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={1,6,2,2,5,1,6};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int arr[], int low, int high) {
        // code here
        if(low<high){
            int pIdx=partition(arr,low,high);
            quickSort(arr,low,pIdx-1);
            quickSort(arr,pIdx+1,high);
        }
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int i=low,j=high;
        int piv=arr[low];
        while(i<j){
            while(arr[i]<=piv && i<high){
                i++;
            }
            while(arr[j]>piv && j>low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
}
