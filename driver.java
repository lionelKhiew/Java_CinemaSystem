/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
/**
 *
 * @author User
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //member sign up 
        signUp();
    }
    
    public static void signUp(){
        Scanner s=new Scanner(System.in);
        boolean validInput = false;
        String name;
        String email;
        String phoneNo;
        String password;
        String passwordConfirm;
        char input;
        boolean premium=true;
            do{
                System.out.print("Enter your name: ");
                name = s.nextLine();

                try {
                    if (name.isEmpty()) {
                        throw new IllegalArgumentException("Name cannot be empty.");
                    }

                    validInput = true; // Input is valid, exit the loop
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e.getMessage());
                    // Continue the loop to prompt for input again
                }
            }while (!validInput);

            validInput = false;
            do{
                System.out.print("Enter your email: ");
                email = s.nextLine();

                try {
                    if (email.isEmpty()) {
                        throw new IllegalArgumentException("Email cannot be empty.");
                    }

                    // Validate email format using regular expression
                    if (!isValidEmail(email)) {
                        throw new IllegalArgumentException("Invalid email format.");
                    }

                    validInput = true; // Input is valid, exit the loop
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e.getMessage());
                    // Continue the loop to prompt for input again
                }
            }while(!validInput) ;

            validInput = false;
            do{
                System.out.print("Enter your Phone Number : ");
                phoneNo = s.nextLine();

                try {
                    if (phoneNo.isEmpty()) {
                        throw new IllegalArgumentException("Phone No cannot be empty.");
                    }

                    // Validate email format using regular expression
                    if (!isValidPhoneNumber(phoneNo)) {
                        throw new IllegalArgumentException("Invalid Phone No format.");
                    }

                    validInput = true; // Input is valid, exit the loop
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e.getMessage());
                    // Continue the loop to prompt for input again
                }
            }while(!validInput) ;

            validInput = false;
            do {
                System.out.print("Enter your Password : ");
                password = s.nextLine();


                try {
                    if (password.isEmpty()) {
                        throw new IllegalArgumentException("Password cannot be empty.");
                    }

                    // Validate password format using custom method
                    if (!isValidPassword(password)) {
                        throw new IllegalArgumentException("Invalid password format.");
                    }

                    System.out.print("Confirm your Password : ");
                    passwordConfirm = s.nextLine();

                    if (!password.equals(passwordConfirm)) {
                        throw new IllegalArgumentException("Passwords do not match.");
                    }

                    validInput = true; // Input is valid, exit the loop
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e.getMessage());
                    // Continue the loop to prompt for input again
                }
                
            } while (!validInput);
            do {
                System.out.print("Do u want premium for $4.90 monthly");
                input = s.next().charAt(0);


                try {
                    if (input != 'Y' && input != 'y' && input != 'N' && input != 'n') {
                        throw new IllegalArgumentException("Invalid choice. Please enter Y or N.");
                    }

                    validInput = true; // Input is valid, exit the loop
                    if(input=='Y'||input=='y'){
                        premium=true;
                    }
                    else{
                        premium=false;
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: " + e.getMessage());
                    // Continue the loop to prompt for input again
                }
                
            } while (!validInput);
            Member member=new Member(name,email,phoneNo,password,premium);
            try {
                FileOutputStream fos = new FileOutputStream("member.txt", true);
                ObjectOutputStream oos = new ObjectOutputStream(fos);


            // Append the object
            oos.writeObject(member);

                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
    }

        // Regular expression to validate email format
    private static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    
    private static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(\\d{3}-\\d{7})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    
    // Custom method to validate password format
    private static boolean isValidPassword(String password) {
        // Check for at least one capital letter, one small letter, one number, and one symbol
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=/*-<>!~`,.]).+$");
    }
}
