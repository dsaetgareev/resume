package ru.saetdin.resume.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Person;
import ru.saetdin.resume.PersonService;
import ru.saetdin.resume.person.PersonRepository;
import ru.saetdin.resume.person.PersonRepositoryService;


@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepositoryService personRepository;

    @Override
    public Person getPerson() {
        return null;
    }

    @Override
    public String login(String telephoneNumber, String password) {
        return null;
    }

    @Override
    public Person create(Person person) {
        return personRepository.create(person);
    }

    @Override
    public void delete() {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void setToken(String token) {

    }
}
