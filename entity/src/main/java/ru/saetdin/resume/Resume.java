package ru.saetdin.resume;

import ru.saetdin.resume.common.EntityWithId;

import javax.persistence.*;

@Entity
public class Resume extends EntityWithId {

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Person author;
    @Column
    private String title;
    @Lob
    private String content;

    public Resume() {
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
