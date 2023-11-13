/*This program demonstrates the use of a try-with-resources block.
note that the only resources that can be implemented in the try-with resources block are 
those that implemet the closeable interface e.g
files, sockets, or database connections
*/ 

//The try with resources block is ensential in a way that you dont need the finally block to close
//the resources as it is done automatically

import java.io.*;
//import java.util.Scanner;
public class Resources {

    public static void greeting(String name){
        System.out.println("Hello " + name);
    }
    public static void greeting(int age){
        System.out.println("aaw you are " + age);
        System.out.println("===============================");
    }

   public static void main(String[] args) {
   
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        System.out.println("What is your name");
        String name = br.readLine();
        greeting(name);
    }
    catch(Exception e){
        System.out.println(e);
    }

    //so incase you dont have anything to run in the finally block and you just need to
    //close the resources, you can use a try-with resources

    //when you use a buffered reader, you must handle the exception
    // try(Scanner scan = new Scanner(System.in)){
    //     System.out.println("How old are you");
    //     int age = scan.nextInt();
    //     greeting(age);
    // }
    // catch(Exception e){
    //     System.out.println(e);
    // }
   
   } 
}
