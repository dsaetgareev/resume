package ru.saetdin.resume;

import ru.saetdin.resume.common.EntityWithId;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Note extends EntityWithId {

    @Column
    private String text;

    @Column
    private String referenceId;

    public Note() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
}
