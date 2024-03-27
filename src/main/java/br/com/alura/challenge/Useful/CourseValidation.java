package br.com.alura.challenge.Useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CourseValidation {

    public boolean codeNameValidation(String str)
    {
        String regex = "^(?=.*[A-Z\\d\\s+_!@#$%^&*., ?]).+$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        return !m.matches();
    }
}
