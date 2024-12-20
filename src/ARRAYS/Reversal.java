package ARRAYS;

public class Reversal {
    public static void main(String[] args) {
        int[] arr={5,6,7,8};
        int i=0,j=arr.length-1;
        do{
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }while(i<j);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
