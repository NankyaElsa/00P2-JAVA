import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Baby baby;

      System.out.println("What gender do you want your baby to be and i tell you how you can get it");
      System.out.println("========================================");
      System.out.println("Pick: (1==Boy) or (2==Girl)");  
      int gender = scan.nextInt();
      
      if (gender == 1){
        baby = new Boy();
        baby.how();
      }
      else if (gender==2) {
        baby = new Girl();
        baby.how();
      } 
      else {
        System.out.println("Choice unavailable");
        baby = new Baby();
        baby.how();
      }
    }
}
