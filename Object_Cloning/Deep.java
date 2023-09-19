
//This program demonstrates deep cloning

public class Deep {
    public String brand;
    public String color;

    //use the toString method for better visualisation when we print out the objects.
    @Override
    public String toString(){
        return "Deep Car[Brand:" + this.brand + ", Color:" + this.color + "]";
    }

    public static void main(String args[]){
        //create original object
        Deep original = new Deep();
        original.brand = "RangeRover";
        original.color = "black";

        //create copy object using deep cloning
        Deep copy = new Deep();
        copy.brand = original.brand;
        copy.color = original.color;

        copy.color = "grey";
        original.color= "yellow";

        System.out.println(original);
        System.out.println(copy);

        //test for deep cloning
        System.out.println(original==copy);

        //it returns false because deep cloning creates a different copy of the object
        //and also gives it a different reference so changing the copy does not affect the 
        //original and vice versa
    }
}
