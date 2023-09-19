package Object_Immutability;
/*Object immutability is when the state of an object cannot be changed after it has been created.
 
How to make an immutable class
1. The class should be declared final so that it cannot be inherited or extended
2. All methods should be private and final to avoid modifications both in the class and outside
of the class.
3. No setters
4. Deep copying to avoid modification through referencing
*/
public final class Student{
    // private final int id;
    // private final String name;
    // private list<String>hobbies;

    // //create constructor
    // public Student(int id, String name, list<String> hobbies){
    //     this.id = id;
    //     this.name = name;
    // }
    public static void main(String[] args) {
       String s1 = "Elsa";
        String s2 = "Elsa";
        System.out.println(s1==s2);  
    }
   
}