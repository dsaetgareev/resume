package ru.saetdin.resume.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Person;
import ru.saetdin.resume.common.AbstractRepositoryService;

@Service
public class PersonRepositoryServiceImpl extends AbstractRepositoryService<Person> implements PersonRepositoryService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person findByTelephoneNumber(String telephoneNumber) {
        return personRepository.findByTelephoneNumber(telephoneNumber);
    }
}
