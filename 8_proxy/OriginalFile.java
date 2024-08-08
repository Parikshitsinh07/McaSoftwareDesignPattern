import java.io.*;

public class OriginalFile implements FileInterface {
    private File f;

    public OriginalFile(String s) {
        f = new File(s);
    }

    public String read() throws IOException {
        String rd = "";
        if (f.isFile()) {
            FileInputStream fl = new FileInputStream(f);
            int i = 0;
            while ((i = fl.read()) != -1) {
                rd += (char) i;
            }
        } else {
            rd = "File is not be Exists";
        }
        return rd;
    }

    public String write(String text) throws IOException {
        String sw = null;
        FileWriter fw = new FileWriter(f, true);
        fw.write(text);
        if (f.isFile())
            sw = "\nSuccesfully write\n";
        else {
            if (f.createNewFile())
                ;
            sw = "File is new created";
        }
        fw.close();
        return sw;
    }

    public String delete() throws IOException {
        String sd;
        if (f.isFile()) {
            f.delete();
            sd = "Succesfully delete file";
        } else
            sd = "please check file exist or not";

        return sd;
    }
}