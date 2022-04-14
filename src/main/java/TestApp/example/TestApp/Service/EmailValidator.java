package TestApp.example.TestApp.Service;


import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Service
public class EmailValidator implements Predicate<String> {

    final String regexPattern ="^(.+)@(\\\\S+)$";

    @Override
    public boolean test(String emailAddress){
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
}
