import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.util.Scanner;
import java.io.*;

public class TestRegexp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new FileReader("test1.css"));
        String match = null;
        Pattern pattern = Pattern.compile("\\n\\s*(\\.[^\\. ]+)\\s*\\{");
        while ((match = scanner.findWithinHorizon(pattern, 0)) != null) {
            Matcher matcher = pattern.matcher(match);
            matcher.find();
            System.out.println(matcher.group(1));
        }       
    }
}