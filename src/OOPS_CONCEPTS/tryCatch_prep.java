package OOPS_CONCEPTS;

public class tryCatch_prep {
    public static void main(String[] args) {
        int a=9,b=0;
        try{
            int c=a/b;
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("blulu");
        }
    }
}
