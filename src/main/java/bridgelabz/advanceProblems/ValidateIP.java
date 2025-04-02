package bridgelabz.advanceProblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIP {
    public static void main(String[] args) {
        String ipAddress = "192.168.0.1";
        String regex = "^(25[0-5]|2[0-9][0-9]|1?[0-9][0-9]?\\.){3}(25[0-5]|2[0-9][0-9]|1?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);

        if(matcher.matches()){
            System.out.println(ipAddress + " this IP address is valid");
        }
        else System.out.println(ipAddress + " this IP address is not valid");
    }
}
//192.168.0.1 this IP address is valid