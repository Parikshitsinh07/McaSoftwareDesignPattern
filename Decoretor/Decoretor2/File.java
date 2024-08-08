import java.io.*;

public class File implements FileHendeler {
    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean writeData(String data) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
			return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
		return false;
    }

    @Override
    public String readData() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
