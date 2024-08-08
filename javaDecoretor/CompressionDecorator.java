import java.io.*;
import java.util.zip.*;

public class CompressionDecorator implements DataSource {

    private DataSource file;
    private String inputFile;
    private String compressedFile;

    public CompressionDecorator(DataSource file, String inputFile, String compressedFile) {
        this.file = file;
        this.inputFile = inputFile;
        this.compressedFile = compressedFile;
    }

    @Override
    public void writeData(String data) {
        file.writeData(data);
        compress();
    }

    @Override
    public String readData() {
        return file.readData();
    }

    private void compress() {
        try {
            FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream = new FileOutputStream(compressedFile);
            ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
            zipOutputStream.putNextEntry(new ZipEntry(new File(inputFile).getName()));

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                zipOutputStream.write(buffer, 0, length);
            }

            zipOutputStream.closeEntry();
            zipOutputStream.close();
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}