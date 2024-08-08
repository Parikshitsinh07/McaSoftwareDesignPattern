import java.util.Base64;
public class EncryptionFile extends FileDecorator {
    public EncryptionDecorator(FileDecorator file) {
        super(file);
    }

    @Override
    public void writeData(String data) {
         try (FileWriter writer = new FileWriter(super.file)) {
            writer.write(encode(data));
			return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
		return false;
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }
}
