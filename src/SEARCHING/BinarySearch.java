package SEARCHING;

public class BinarySearch {
//    public static void main(String[] args) {    //recursive approach
//        int[] arr={4,2,7,1,9};
//        int key=17;
//        int idx=BS(arr,key,0,arr.length-1);
//        System.out.println(idx);
//    }
//    public static int BS(int[] arr,int key,int beg,int end) {
//        if (beg <= end) {
//            int mid = beg + (end - beg) / 2;
//            if (key == arr[mid]) {
//                return mid;
//            }
//            if (key < arr[mid]) {
//                return BS(arr, key, beg, mid);
//            }
//            if (key > arr[mid]) {
//                return BS(arr, key, mid + 1, end);
//            }
//
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int[] arr={1,6,8,9};
        int key=1;
        int n=arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(key==arr[mid]){
                System.out.println(key+" is at index "+i);
                return;
            }
            if(key<arr[mid]){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        System.out.println("-1");
    }
}
