package bridgelabz.advanceProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageName {
    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String regex = "\\b(Java|Python|JavaScript)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
//Java
//Python
//JavaScript