package Generic_Programming;

public class Person <T, U>{
    T name;
    U age;
    //constructor
    Person (T name, U age){
        this.name = name;
        this.age = age;
    }
    public T getName(){
        return name;
    }
    public U getAge(){
        return age;
    }
    public static void main(String args[]){
        Person<String, Integer> person = new Person<String,Integer>("Willy", 12);
        System.out.println("Name: "+ person.getName());
        System.out.println("Age: "+ person.getAge());

    }
}
