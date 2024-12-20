package OOPS_CONCEPTS;

public class method_overloading {
    public static void main(String[] args) {

        B ob1=new B();
        B ob2=new C();
        System.out.println(ob1.fun(6,7));
        System.out.println(ob2.fun(6,7));
    }
    public static class B{
        int c;
        double d;
        public double fun(int c,double d){
            this.c=c;
            this.d=d;
            return c+d;
        }
        public int fun(int a,int b){
            this.c=a;
            this.d=b;
            return a*b*b;
        }
    }
    public static class C extends B{
        String str="abc";
        public int fun(int a,int b){
            this.c=a;
            this.d=b;
            return a*b+b;
        }
    }
}
