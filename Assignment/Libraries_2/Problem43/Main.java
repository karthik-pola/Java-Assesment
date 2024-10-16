package Libraries_2.Problem43;

import java.util.regex.*;

public class Main {

    public static boolean isValidPAN(String pan) {
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pan);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String pan1 = "ABCDE1234F";
        String pan2 = "12345ABCDE";

        System.out.println(pan1 + " is valid: " + isValidPAN(pan1));
        System.out.println(pan2 + " is valid: " + isValidPAN(pan2));
    }

}
