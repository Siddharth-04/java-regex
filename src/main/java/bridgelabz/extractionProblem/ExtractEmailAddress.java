package bridgelabz.extractionProblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
    public static void main(String[] args) {
        String text ="\"Contact us at support@example.com and info@company.org\"\n";
        String regex = "[a-zA-Z]{1,}@[a-z]{3,}[.][a-z]{2,3}";
        Pattern pattern1 = Pattern.compile(regex);
        Matcher matcher1 = pattern1.matcher(text);

        while( matcher1.find()){
            System.out.println(matcher1.group());
        }

    }
}
//support@example.com
//info@company.org