package ru.saetdin.resume.token;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.saetdin.resume.Person;
import ru.saetdin.resume.person.PersonRepositoryService;

import java.util.ArrayList;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{

    @Autowired
    private PersonRepositoryService personRepositoryService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String telephoneNumber = authentication.getName();
        String password = authentication.getCredentials().toString();
        Person person = personRepositoryService.findByTelephoneNumber(telephoneNumber);
        if (person == null || person.getPassword() == null) return null;
        if (telephoneNumber.equals(person.getTelephoneNumber()) && passwordEncoder.matches(password, person.getPassword())) {
            return new UsernamePasswordAuthenticationToken(
                    telephoneNumber, password, new ArrayList<>());
        } else {
            return null;
        }
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
