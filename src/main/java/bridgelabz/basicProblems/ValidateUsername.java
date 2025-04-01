package bridgelabz.basicProblems;
import java.util.regex.*;

public class ValidateUsername {
    public static void main(String[] args) {
        String username = "olleh";
        String regex = "^[a-zA-Z][\\w_+]{4,15}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        if (matcher.matches()) {
            System.out.println("Username is valid");
        }
        else{
            System.out.println("Username is not valid");
        }
    }
}
