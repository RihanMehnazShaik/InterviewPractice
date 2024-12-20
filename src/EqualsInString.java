public class EqualsInString {
    public static void main(String[] args) {
//        String s1="abc";
//        String s2="abc";
//        String s3=new String("abc");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));
        Example e1=new Example(10);
        Example e2=e1;
        Example e3=new Example(10);
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1==e3);
        System.out.println(e1.equals(e3));
    }

}
class Example{
    int data;

    public Example(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object ob){
        if(ob==this){
            return true;
        }
        if(ob==null || this.getClass()!=ob.getClass()){
            return false;
        }
        Example ex=(Example) ob;
        return this.data== ex.data;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(data);
    }
}