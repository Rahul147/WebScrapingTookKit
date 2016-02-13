import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.util.Scanner;
import java.io.*;

public class GetUniqueClassNames {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new FileReader(args[0]));
        PrintWriter writer = new PrintWriter(args[1], "UTF-8");
        String match = null;
        Pattern pattern = Pattern.compile("\\n\\s*(\\.[^\\. ]+)\\s*\\{");
        while ((match = scanner.findWithinHorizon(pattern, 0)) != null) {
            Matcher matcher = pattern.matcher(match);
            matcher.find();            
            writer.println(matcher.group(1));
            // System.out.println(matcher.group(1));
        }
        writer.close();       
    }
}