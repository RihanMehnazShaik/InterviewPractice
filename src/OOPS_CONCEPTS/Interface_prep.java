package OOPS_CONCEPTS;

public class Interface_prep {
    public static void main(String[] args) {
        A ob=new C();
        System.out.println(ob.add());
        ob.mul();
        System.out.println(ob.num);
        System.out.println();
    }
    static{
        System.out.println("heheh");
    }
    interface A{
        int num=10; // public static final by default
        void mul();
        int add();
    }
     static class B implements A{
        int a=9,b=4;
        public void mul(){
            System.out.println(a*b);
        }
        public int add(){
            return a+b;
        }
    }
    static class C implements A{
        int a=9,b=4;
        public void mul(){
            System.out.println(a+num);
        }
        public int add(){
            return a+b;
        }
    }

}
