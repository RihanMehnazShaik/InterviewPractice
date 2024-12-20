package SEARCHING;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={4,2,1,6};
        int key=6;
        for(int i=0;i< arr.length;i++){
            if(key==arr[i]){
                System.out.println(key+ " is at index "+i);
                return;
            }
        }
        System.out.println("key not found");
    }
}
