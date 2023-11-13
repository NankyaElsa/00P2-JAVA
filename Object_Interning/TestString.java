
public class TestString {
    public static String str1 = "Hello";
    public String str2;

    public TestString(String str2){
        this.str2 = str2;
    }

    public void showIntern(){
        str2 = str1.intern();
        System.out.println(str2);
    }
    public static void main(String args[]){
        String str2 = new String("Hello").intern();
        //test.showIntern();

        System.out.println(str1 == str2);

    }
}
