package Generic_Programming;

public class GenericMethod2 {
    //This method has two generic type parameters hence accepts the use of two datatypes
    public <T,U> void anyThing(T something, U mything){
        System.out.println("This is " + something + " and she is "+ mything);
    }

    public <V> V age(V myAge){
        return myAge;
    }

    public static void main(String args[]){
        GenericMethod2 gmethod2 = new GenericMethod2();
        gmethod2.anyThing("Maka","Aisha");
        gmethod2.anyThing("Maka", 12);
        gmethod2.anyThing(12, "a number");

        int intAge = gmethod2.age(17);
        String stringAge = gmethod2.age("Seventeen");

        System.out.println("Age in integers: "+ intAge);
        System.out.println("Age in words: "+ stringAge);
    }
}
