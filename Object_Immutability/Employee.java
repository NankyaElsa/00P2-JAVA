package Object_Immutability;

public final class Employee {
    private String name;
    private int age;

    public final void getDetails(){
        System.out.println("My name is " + this.name + " and i am "+ this.age + " years old");
    }

    public static void main(String args[]){
        Employee emp1 = new Employee();
        emp1.name = "Matovu";
        emp1.age = 23;
        emp1.getDetails();
    }
}

// class Person extends Employee{
//       public static void main(String args[]){
//         Person p = new Person();
//       }  
// }