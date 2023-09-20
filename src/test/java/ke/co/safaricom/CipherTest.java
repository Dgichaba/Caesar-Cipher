package ke.co.safaricom;
import Cipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    public static void main(String[] args) {
        Cipher myInstance=new Cipher();
        // Test cases
        String plaintext = "HELLO";
        int key = 3;

        String encryptedText = myInstance.encrypt(plaintext, key);
        System.out.println("Encrypted: " + encryptedText);

        String decryptedText = myInstance.decrypt(encryptedText, key);
        System.out.println("Decrypted: " + decryptedText);

        // Additional test cases
        String test1 = "HI";
        int key1 = 2;
        String encryptedTest1 = myInstance.encrypt(test1, key1);
        System.out.println("Encrypted Test1: " + encryptedTest1);

        String test2 = "HI";
        int key2 = 20;
        String encryptedTest2 = myInstance.encrypt(test2, key2);
        System.out.println("Encrypted Test2: " + encryptedTest2);
    }
}



