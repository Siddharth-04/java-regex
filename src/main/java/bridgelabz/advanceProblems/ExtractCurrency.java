package bridgelabz.advanceProblems;

import java.util.regex.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String input = "The price is $45.99, and the discount is 10.50.";

        Pattern pattern = Pattern.compile("\\$?\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
//$45.99
//10.50