package ru.saetdin.resume.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Resume;
import ru.saetdin.resume.common.AbstractRepositoryService;

import java.util.List;

@Service
public class ResumeRepositoryServiceImpl extends AbstractRepositoryService<Resume> implements ResumeRepositoryService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Override
    public List<Resume> findAllByAuthor(String author) {
        return resumeRepository.findAllByAuthor(author);
    }

    @Override
    public List<Resume> getAllResumes() {
        return resumeRepository.findAll();
    }
}
