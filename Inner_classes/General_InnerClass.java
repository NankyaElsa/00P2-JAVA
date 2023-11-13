
//This program implements static and non static inner classes
//A class can have an inner class as part of its constituents i.e attributes and methods

public class General_InnerClass{
    public int a;
    public String b;

    public void Method1(){
        System.out.println("I am from the outer class");
    }

    class InnerClass{
        public double c;

        public void Method2(){
            System.out.println("I am from the inner class");
        }
    }
    static class Inner{
        public void Method3(){
            System.out.println("Iam from the static inner class");
        }
        public static void Method4(){
            System.out.println("Iam from the static method in the static inner class");
        }
    }
    public static void main(String[] args) {
       //create an object of the outer class
        General_InnerClass outer = new General_InnerClass();
        outer.Method1();
        //create an object of the non static inner class using the outer object
        General_InnerClass.InnerClass inner = outer.new InnerClass();
        inner.Method2();
        //creating an object of the static inner class
        General_InnerClass.Inner inn = new General_InnerClass.Inner();
        inn.Method3();
        
        //call the static method in the static inner class
        General_InnerClass.Inner.Method4();
    } 
    
}

