

//This program demonstrates the concept of shallow cloning

public class Shallow {
    public String name;
    public int age;

    //constructor
    Shallow (String name, int age){
        this.name = name;
        this.age = age;
    }
    //use the toString method for better visualisation when we print out the objects.
    @Override
    public String toString(){
        return "Shallow Student[Name:" + name + ", Age:" + age + "]";
        
    }
    public static void main (String args[]){
        //create original object
        Shallow original = new Shallow("Alex", 18);

        //create a copy of the original object using shallow cloning
        Shallow copy = original;

        // System.out.println(original);
        // System.out.println(copy);

        //lets try to change the attribute values of the coppie object
        copy.name = "John";

        System.out.println(original);//[Alex, 18]
        System.out.println(copy);//[John, 18]===actual output

        //test shallow cloning
        System.out.println(original==copy);

        //it returns true because it is basically the same object with two different 
        //references pointing to it


    }
}
