package MULTI_THREADING;

class ImplementingThreadDemo extends Thread{
    public void run(){
        try {
            System.out.println("Thread no: " + Thread.currentThread().getName() + " is running.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class ByExtendingThreadClass {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            ImplementingThreadDemo threadDemo=new ImplementingThreadDemo();
            threadDemo.start();
        }
    }
}
