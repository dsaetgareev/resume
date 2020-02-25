package ru.saetdin.resume;

import ru.saetdin.resume.common.EntityWithId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "description")
public class Description extends EntityWithId {

    @Column
    private String text;
    @Column
    private String referenceId;

    public Description() {
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
