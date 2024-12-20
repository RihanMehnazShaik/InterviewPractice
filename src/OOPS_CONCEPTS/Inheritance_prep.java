package OOPS_CONCEPTS;

public class Inheritance_prep {
    public static void main(String[] args) {
        BASS ob=new BASS();
        GRASS g=new BASS();
        g.paint(); // 9000
        ob.paint();
        ob.draw();
    }
}
class GRASS{
    int a=90;
    void paint(){
        System.out.println(a);
    }
}
class BASS extends GRASS{
    int v=9000;
    void draw(){
        System.out.println(v);
    }
    void paint(){
        System.out.println(v);
    }
}
