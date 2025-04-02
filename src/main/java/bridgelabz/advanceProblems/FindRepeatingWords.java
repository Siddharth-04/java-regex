package bridgelabz.advanceProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group(1)); //returns the first capturing group -> matcher.group(0) : returns is is , but .group(1) returns is i.e, first capturing group;
        }
    }
}
//is
//repeated