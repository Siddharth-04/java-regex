package bridgelabz.basicProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColor {
    public static void main(String[] args) {
        String hexColor = "#FFA500";
        String regex =  "^[#]{1}[A-Za-z0-9]{6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hexColor);

        if(matcher.matches()){
            System.out.println(hexColor + " is valid");
        }
        else{
            System.out.println(hexColor + " is not valid");
        }
    }
}
//#FFA500 is valid