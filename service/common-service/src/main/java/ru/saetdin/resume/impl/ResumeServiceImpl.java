package ru.saetdin.resume.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Resume;
import ru.saetdin.resume.ResumeService;
import ru.saetdin.resume.resume.ResumeRepositoryServiceImpl;

import java.util.List;
import java.util.UUID;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeRepositoryServiceImpl resumeRepositoryService;


    @Override
    public List<Resume> getResumesByAuthor(UUID authorId) {
        return resumeRepositoryService.findAllByAuthor(authorId.toString());
    }

    @Override
    public List<Resume> getAllResumes() {
        return resumeRepositoryService.getAllResumes();
    }

    @Override
    public Resume getResumeById(UUID id) {
        return resumeRepositoryService.read(id);
    }

    @Override
    public Resume create(Resume resume) {
        return resumeRepositoryService.create(resume);
    }

    @Override
    public void delete(UUID id) {
        resumeRepositoryService.delete(id);
    }

    @Override
    public void update(Resume resume) {
        resumeRepositoryService.update(resume);
    }
}
