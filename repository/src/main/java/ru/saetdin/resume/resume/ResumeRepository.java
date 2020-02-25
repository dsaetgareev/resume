package ru.saetdin.resume.resume;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.saetdin.resume.Resume;

import java.util.List;
import java.util.UUID;

public interface ResumeRepository extends JpaRepository<Resume, UUID> {

    List<Resume> findAllByAuthor(String author);
    List<Resume> findAll();
}
