import java.io.*;
import java.util.Scanner;

class ProxyFile implements FileInterface {
    private String s;
    private int role;

    public ProxyFile(String s, int role) {
        this.s = s;
        this.role = role;
    }

    public String read() throws IOException {
        String rd = null;
        if ((role == 1) || (role == 2) || (role == 3)) {
            OriginalFile fo = new OriginalFile(s);
            rd = fo.read();
        }
        return rd;
    }

    public String write(String text) throws IOException {
        String sw;
        if ((role == 1) || (role == 2)) {

            OriginalFile fo = new OriginalFile(s);
            sw = fo.write(text);
        } else
            sw = "\nYou can not allow to Write Permission\n";
        return sw;
    }

    public String delete() throws IOException {
        String sd;
        if (role == 1) {
            OriginalFile fo = new OriginalFile(s);
            sd = fo.delete();
        } else
            sd = "\nYou can Not delete file\n";
        return sd;
    }

}