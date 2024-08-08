// Concrete implementation of EncryptionStrategy using XOR cipher
public class XORCipher implements EncryptionStrategy {
    private String key;

    public XORCipher(String key) {
        this.key = key;
    }

    @Override
    public String encrypt(String plaintext) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            char k = key.charAt(i % key.length());
            encryptedText.append((char) (c ^ k));
        }

        return encryptedText.toString();
    }
}

