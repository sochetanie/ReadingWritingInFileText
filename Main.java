import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {

    List<String> lines = Files.readAllLines(Paths.get("input.text"), Charset.defaultCharset());

    int a = Integer.parseInt(lines.get(0));
    int b = Integer.parseInt(lines.get(1));
    int c = a + b;

    String text = Integer.toString(c);

    PrintWriter out = new PrintWriter("output.text");
    out.println(text);
    out.close();

  }
  
}



