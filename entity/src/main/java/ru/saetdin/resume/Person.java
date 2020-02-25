package ru.saetdin.resume;

import ru.saetdin.resume.common.EntityWithId;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Person extends EntityWithId {

    @Column
    private String telephoneNumber;
    @Column
    private String password;
    @Column
    private String nickName;

    public Person() {
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
