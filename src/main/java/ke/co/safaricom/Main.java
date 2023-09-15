package ke.co.safaricom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Cipher App");
        Cipher cipher= new Cipher();

        while(true) {

            System.out.println("Enter a message: ");
            String message = scanner.next();

            System.out.println("Enter a process(e/d): ");
            String process = scanner.next();

            System.out.println("Enter a key: ");
            int key = scanner.nextInt();

            cipher.setMessage(message);
            cipher.setKey(key);

            String output = "";

            if(process.startsWith("e")){
                output = cipher.encrypt();
            }
            else{
                output = cipher.decrypt();
            }

            System.out.println("Your output message is : " + output);


            System.out.println("Do you want to continue? (c/q): ");
            String nextStep = scanner.next();

            if(!nextStep.startsWith("c")){
                System.out.println("Goodbye");
                break;
            }

        }
    }
}