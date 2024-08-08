import java.io.*;
public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    public void writeData(String data) {

        try {

            FileWriter f = new FileWriter(name);
            f.write(data);
            f.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String readData() {
        char[] buffer = null;

        try {
            File file = new File(name);
            FileReader reader = new FileReader(file);
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}