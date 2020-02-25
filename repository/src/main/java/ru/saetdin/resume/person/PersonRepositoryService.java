package ru.saetdin.resume.person;

import ru.saetdin.resume.Person;
import ru.saetdin.resume.common.RepositoryService;

public interface PersonRepositoryService extends RepositoryService<Person> {

    Person findByTelephoneNumber(String telephoneNumber);
}
