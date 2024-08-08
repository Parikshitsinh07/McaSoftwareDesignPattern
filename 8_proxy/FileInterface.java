import java.io.*;

public interface FileInterface {
   public String read() throws IOException;

   public String write(String text) throws IOException;

   public String delete() throws IOException;
}