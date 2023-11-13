
//This program demonstrates the use of the throw keyword in java
//The throw keyword is used inorder to force an exception according to your own rules

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        try{
            int age = scan.nextInt();
            if(age <= 0){
                throw new ArithmeticException();
            }
            else if(age < 18){
                System.out.println("Cant vote if you are below 18 years of age");
            }
            else{
                System.out.println("You can vote");
            }
        }
        catch(ArithmeticException ae){
        System.out.println("Cant have a negative or zero age");
    }
    finally{
        scan.close();
        System.out.println("GOODLUCK");
    }
    }
}
