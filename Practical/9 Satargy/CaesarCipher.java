
// Concrete implementation of EncryptionStrategy using Caesar cipher
public class CaesarCipher implements EncryptionStrategy {
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String plaintext) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + shift);
                if ((Character.isUpperCase(c) && shifted > 'Z') || (Character.isLowerCase(c) && shifted > 'z')) {
                    shifted -= 26;
                }
                encryptedText.append(shifted);
            } else {
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }
}
