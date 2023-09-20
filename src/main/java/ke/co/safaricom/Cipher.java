package ke.co.safaricom;

public class Cipher {
    private String message;
    private int key;
    public String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Cipher(){

    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public String encrypt(String text, int key){

        StringBuilder encryptedText = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encryptedText.append((char) ((c - base + key) % 26 + base));
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }
    public String decrypt(String text, int key) {
        return encrypt(text, 26 - key); // Decryption is just encryption with the reverse key
    }
}

