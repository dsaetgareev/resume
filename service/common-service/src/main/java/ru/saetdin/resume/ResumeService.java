package ru.saetdin.resume;

import java.util.List;
import java.util.UUID;

public interface ResumeService {
    List<Resume> getResumesByAuthor(UUID authorId);
    List<Resume> getAllResumes();
    Resume getResumeById(UUID id);
    Resume create(Resume resume);
    void delete(UUID id);
    void update(Resume resume);
}
