
public class Anonymous3 {

   public void who_Am_I(){
    System.out.println("I am from the implementing and extending class");
   } 
   //This method is implementing creation of an anonymous inner class by extending a super class Anonymous1
   public void extend_class(){
    System.out.println("I am from extending the class");

    Anonymous1 annony1 = new Anonymous1(){

        public void who_Am_I(){
            System.out.println("I am from an anonymous class created by extending a super class.");
        }
    };
    annony1.who_Am_I();
   }

   //This method is implementing creation of an anonymous inner class by implementing an interface Anonymous2
    public void implement_Interface(){

        Anonymous2 annony2 = new Anonymous2() {
            public void method(){
                System.out.println("I am from an anonymous class created by implementing an interface.");
            }
        };
        annony2.method();
    }
    public static void main(String[] args) {
        Anonymous3 annony3 = new Anonymous3();
        System.out.println("========================================");
        annony3.who_Am_I();
        System.out.println("========================================");
        annony3.extend_class();
        System.out.println("========================================");
        annony3.implement_Interface();
        System.out.println("========================================");

    }
}
