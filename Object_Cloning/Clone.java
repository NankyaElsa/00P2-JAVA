
//This program demonstrates the use of the clone method,(combines both shallow and deep cloning).
//Cloning is internally like deep copying
public class Clone implements Cloneable {
    public String name;
    public String sound;

    Clone (String name, String sound){
        this.name = name;
        this.sound = sound;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return "Animal[Name:" + name + ", Sound:" + sound + "]";
    }
    public static void main(String args[]){
        Clone original = new Clone("cat", "mweoeww");
        try{
           Clone copy = (Clone)original.clone();
           copy.name = "dog";
           System.out.println(original);
           System.out.println(copy);
           //testing for cloning
           System.out.println(original==copy);

           //will print out false 
           //cloning is internally like deep copying
        }
        catch (CloneNotSupportedException e){
           
        }
    }
}
