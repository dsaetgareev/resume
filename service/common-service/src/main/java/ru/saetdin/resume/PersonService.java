package ru.saetdin.resume;

public interface PersonService {
    Person getPerson();
    String login(String telephoneNumber, String password);
    Person create(Person person);
    void delete();
    void delete(Person person);
    void setToken(String token);
}
