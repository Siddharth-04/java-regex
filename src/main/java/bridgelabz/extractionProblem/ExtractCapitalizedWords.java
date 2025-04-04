package bridgelabz.extractionProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is A in New York.";
        String regex = "[A-Z][a-z]{0,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
//The
//Eiffel
//Tower
//Paris
//Statue
//Liberty
//New
//York