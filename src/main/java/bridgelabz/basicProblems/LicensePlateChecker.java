package bridgelabz.basicProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateChecker {
    public static void main(String[] args) {
        String license = "AB1234";

        String regex = "^[A-Z]{2}[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(license);

        if(matcher.matches()){
            System.out.println(license +" License is valid");
        }
        else{
            System.out.println(license +" License is not valid");
        }
    }
}
//AB1234 License is valid