package OOPS_CONCEPTS;

public class Abstraction_Tut {
    public static void main(String[] args) {
        B ob=new B();
        System.out.println(ob.add());
    }
    static abstract class A{
        int a=10;
        int b=90;
        abstract int mul();
        int add(){
            return a+b;
        }
    }
    static class B extends A{
        int mul(){
            return a*b;
        }
    }

}


