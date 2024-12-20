package OOPS_CONCEPTS;

public class method_overiding {
    public static void main(String[] args) {

        Animal a=new Animal();
        a.sound();
        Animal b=new Tiger();
        b.sound();
    }
    public static class Animal{
        void sound(){
            System.out.println("animal sound");
        }
        void walk(){
            System.out.println("animal walk");
        }
    }
    public static class Tiger extends Animal{
        void eats(){
            System.out.println("eats flesh");
        }
        void sound(){
            System.out.println("rawr");
        }
        void walk(){
            System.out.println("royal walk");
        }
    }
}
