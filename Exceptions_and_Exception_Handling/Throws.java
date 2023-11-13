//This program demonstrates the use of throws keywords

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throws {
    public static void main(String[] args) throws IOException {
   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name");
        String name = br.readLine();
        System.out.println(name);
    }
}

//You can use the throws keyword when too lazy to write the try catch blocks
//not advisable to use 
//because incase the program crushes, you dont get to know the problem
