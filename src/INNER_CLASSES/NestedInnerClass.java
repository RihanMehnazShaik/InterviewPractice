package INNER_CLASSES;// Java Program to Demonstrate Nested class 

// Class 1
// Helper classes
class Outer1 {
    int a=90;

    // Class 2
    // Simple nested inner class
    class Inner {
        //int a=10;

        // show() method of inner class
        public void show()
        {

            // Print statement
            System.out.println("In a nested class method");
            fun();
        }

        public void fun(){
            System.out.println(a);
        }
    }

}

// Class 2
// Main class
class NestedInnerClass {

    // Main driver method
    public static void main(String[] args)
    {

        // Note how inner class object is created inside
        // main()
        Outer1.Inner in = new Outer1().new Inner();
//        Outer1 out=new Outer1();
//        Outer1.Inner in=out.new Inner();
        // Calling show() method over above object created
        in.show();
    }
}