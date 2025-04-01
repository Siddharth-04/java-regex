package bridgelabz.advanceProblems;

import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        String input = "My SSN is 123-45-6789.";

        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Compile the regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Check if the SSN is valid
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("SSN is invalid");
        }
    }
}
//123-45-6789