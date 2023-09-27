public class Book implements Cloneable {
    String title;
    public Book clone() throws CloneNotSupportedException{
        return (Book) super.clone();
    }
    public static void main (String[]args){

        Book b1 = new Book();
        try{
            b1.title = "Pat";

        Book b2 = b1.clone();

        b1.title = "Tricia";

        System.out.println(b2.title);

        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();

        }
        
        
    }
}
