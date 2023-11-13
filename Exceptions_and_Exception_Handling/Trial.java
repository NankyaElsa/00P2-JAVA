//This program demonstates the basic use of a try catch exception handling

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trial {

    public static void greeting(int age){
        System.out.println("aaw you are " + age);
        System.out.println("===============================");
    } 
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("How old are you");
    
    try{
        int age = scan.nextInt();
        if (age <= 0){
            System.out.println("please enter a positive age above zero");
        }
        else{
            greeting(age);
            System.out.println("Would you like to caryout some divisions with your age?");
            System.out.println("Enter (1 for yes) or (2 for no)");
            int response = scan.nextInt();
            if (response ==1){
                System.out.println("ooh wow, enter the number to divide your age with");
                int div_number = scan.nextInt();
                int ans = age/div_number;
                System.out.println("======================================");
                System.out.println("The result is "+ ans);
            }
            else if(response ==2){
                System.out.println("Its okay, maybe next time");
            }
            else{
                System.out.println("Please follow instructions properly");
            }
        }
    } 
    catch(InputMismatchException ime){
        System.out.println("Please enter your age as an integer");
    }
    catch(ArithmeticException ae){
        System.out.println("Cannot devide by zero");
    }
    catch(Exception e){
        System.out.println(e);
        System.out.println("unknown exception");
        //you can use this block to catch all kinds of exceptions that you didnt cater for,
        //the exceptions you were unaware of that they can happen
    }

    //the finally block is always executed where there was an exception or not
    //therefore it contains code that should be executed at all times
    //forexample lets say you want to say bye bye to the user
    //the finally block is also used for closing resources
    finally{
        scan.close();
        System.out.println("BYE BYE");
    }
    


}
}
