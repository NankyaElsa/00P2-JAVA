//This program demonstrates the creation and use of a generic class
package Generic_Programming;

public class Student<T> {
    public T position;
    //constructor
    Student(T position){
        this.position = position;
    }
    //method
    public T getPosition(){
        return position;
    }

    public static void main(String args[]){
        //Creating generic objects of different data types
        Student<Integer> st1 = new Student<Integer>(20);
        Student<String> st2 = new Student<String>("twentieth");
        Student<Double> st3 = new Student<Double>(3.4);

        st1.position = 1;

        System.out.println("My position is "+ st1.getPosition());
        System.out.println("I am the "+ st2.getPosition());
        System.out.println("My CGPA is "+ st3.getPosition());

        /*The class Student has a T defined in angle<> brackets, <T>, this indicates that the class 
         * is generic in other words, this is how we write or define a generic class.
         * 
         * A generic class simply means that the class can support use of different data types
         * without going through the long type casting hence enabling code reuse and type safety.
         * 
         * We can define different data types the class can use by separating the parameters with
         * commas i.e Student <T, U, F> an example is provided in one of the files in this folder.
         * 
         * Also the letters used can be any letter 
         */

    }
}
