// Example usage
public class Main {
    public static void main(String[] args) {
        // Using Caesar Cipher with a shift of 3
        EncryptionContext context = new EncryptionContext(new CaesarCipher(3));
        String encryptedText = context.encrypt("Hello World");
        System.out.println("Caesar Cipher: " + encryptedText);

        // Using XOR Cipher with key "secret"
        context.setStrategy(new XORCipher("secret"));
        encryptedText = context.encrypt("Hello World");
        System.out.println("XOR Cipher: " + encryptedText);
    }
}
