package br.com.alura.challenge.Useful;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {

    public UserValidation() {
    }
    public boolean userNameValidation(String str)
    {
        String regex = "^(?=.*[A-Z\\d\\s]).+$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        return !m.matches();
    }

    public boolean userEmailValidation(String str)
    {
       boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(str);
            emailAddr.validate();

        } catch (AddressException e) {
            result = false;
        }
        return result;
    }

}
