package bridgelabz.extractionProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024,15/13/2002, 32/02/2020 and 200/10/2024.";
        String regex = "(0[1-9]|[1,2][0-9]|3[0,1])[/](1[012]|0[1-9])[/]((19|20)[0-9]{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
// 12/05/2023
// 15/08/2024
// 29/02/2020