package bridgelabz.advanceProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String creditCardNumber = "4345678912345665";
        String regex = "^[45][0-9]{15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(creditCardNumber);

        if (matcher.matches()) {
            System.out.println(creditCardNumber + " is valid");
        }
        else {
            System.out.println(creditCardNumber + " is not valid");
        }
    }
}
//4345678912345665 is valid