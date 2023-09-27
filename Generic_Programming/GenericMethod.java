package Generic_Programming;

public class GenericMethod {
    //This method is aimed at getting the maximum value
    //Creating a Generic method that takes in a single value
    public <U> void anyThing(U something){
        System.out.println(something);
    }
    //Creating a Generic method that takes in an array
    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element); 
        }

    }
    public static void main (String args[]){

        GenericMethod gmethod = new GenericMethod();
        gmethod.anyThing(10);
        gmethod.anyThing("Hey i am something");
        gmethod.anyThing(3.65);
        gmethod.anyThing(true);

        System.out.println("=================================================");
        Integer[] intArray = {1, 10, 3, 93, 73, 100};
        String[] stringArray = {"Kemi", "Aurah", "Hemi", "Cathy"};

        System.out.println("Printing the integer array");
        printArray(intArray);

        System.out.println("Printing the String array");
        printArray(stringArray);
    }
}
