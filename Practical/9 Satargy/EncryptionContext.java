// Context class that allows switching between different encryption strategies
public class EncryptionContext {
    private EncryptionStrategy strategy;

    public EncryptionContext(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String plaintext) {
        return strategy.encrypt(plaintext);
    }
}
