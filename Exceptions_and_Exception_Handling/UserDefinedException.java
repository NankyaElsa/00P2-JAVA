//This program demonstrates how to create and use a user defined exception

import java.util.Scanner;

public class UserDefinedException extends Exception{

    public UserDefinedException(String message){
        super(message);
    }
    
}

class Demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer twenty");
        int twenty = scan.nextInt();
        try{
            if(twenty != 20){
            throw new UserDefinedException("Wrong answer");}
            else{
                System.out.println("you are a genious");
            }
        }
        catch(UserDefinedException ude){
            System.out.println(ude);

        }
        finally{
            scan.close();
        }
        
    }
}
