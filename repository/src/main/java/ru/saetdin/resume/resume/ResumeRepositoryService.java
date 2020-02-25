package ru.saetdin.resume.resume;

import ru.saetdin.resume.Resume;
import ru.saetdin.resume.common.RepositoryService;

import java.util.List;

public interface ResumeRepositoryService extends RepositoryService<Resume> {

    List<Resume> findAllByAuthor(String author);
    List<Resume> getAllResumes();
}
