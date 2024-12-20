package MULTI_THREADING;


class Example implements Runnable{
    public void run(){
        try{
            System.out.println("Thread no: " + Thread.currentThread().getId() + " is running.");
        }catch (Exception e){
            e.getStackTrace();
        }

    }
}
public class ByImplementingTheRunnableInterface {
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            Thread thread=new Thread(new Example());
            thread.start();
        }
    }
}
