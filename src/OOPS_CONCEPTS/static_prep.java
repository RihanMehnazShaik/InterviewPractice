package OOPS_CONCEPTS;

public class static_prep {
    public static void main(String[] args) {
        A ob=new A();
        System.out.println(A.a);
        ob.mul();
        ob.add();
        A.mul();
        A.a=444;
        System.out.println(ob.a);
        A.B ob1=new A.B();
        ob1.paint();
    }

}
class A{
    static int a=20,c=10;
    private static int b=90;
    public void add(){
        System.out.println(a+b);
    }
    public static void mul(){
        System.out.println(a*c);
    }

    static class B{
        void paint(){
            System.out.println(b);
        }
    }
}
