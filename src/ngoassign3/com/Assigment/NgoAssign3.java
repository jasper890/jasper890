/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ngoassign3.com.Assigment;

import java.util.Scanner;

/**
 *
 * @author ngoro
 */
public class NgoAssign3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        repeatCharacters();
    }

    public static void repeatCharacters() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CHARACTER REPEATER");
        System.out.println("This program will repeat the character in a String (n) number of times.");
        System.out.println("\nEnter String:");
        String StrUserIn = scanner.nextLine();

        System.out.print("Number of times: ");
        int intuserin = scanner.nextInt();

        if (intuserin <= 0) {
            System.out.println("Invalid number of repetition");
            
        }
        if (StrUserIn.isEmpty()) {
            System.out.println("The input is empty or contains only white space");
        }
        
        String result = "";
        int j = StrUserIn.length();

        if (intuserin > 0 && !(StrUserIn.isEmpty())) {
            for (int i = 0; i < j; i++) {
                char oldchar = StrUserIn.charAt(i);
                for (int k = 1; k <= intuserin; k++) {
                    result += oldchar;

                }
            }
            System.out.println("\nOriginal String: " + StrUserIn);
            System.out.print("Repeated String: " + result);

        }

    }
}
