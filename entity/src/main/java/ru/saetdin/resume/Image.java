package ru.saetdin.resume;

import ru.saetdin.resume.common.EntityWithId;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Image extends EntityWithId {

    @Column
    private byte[] image;
    @Column
    private String referenceId;

    public Image() {
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }
}
