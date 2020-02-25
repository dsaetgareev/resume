package ru.saetdin.resume.token;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import ru.saetdin.resume.Person;
import ru.saetdin.resume.person.PersonRepositoryService;

@Component
public class SecurityTokenServiceImpl implements SecurityService{

    @Autowired
    private PersonRepositoryService personRepositoryService;

    @Override
    public Person getCurrentPerson() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication instanceof UsernamePasswordAuthenticationToken) {
            String currentPerson = authentication.getName();
            return personRepositoryService.findByTelephoneNumber(currentPerson);
        }
        return null;
    }
}
