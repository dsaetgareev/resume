package ru.saetdin.resume.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Description;
import ru.saetdin.resume.DescriptionService;
import ru.saetdin.resume.description.DescRepositoryServiceImpl;

import java.util.UUID;

@Service
public class DescriptionServiceImpl implements DescriptionService {

    @Autowired
    private DescRepositoryServiceImpl descRepositoryService;

    @Override
    public Description getDescById(UUID uuid) {
        return descRepositoryService.read(uuid);
    }

    @Override
    public Description create(Description description) {
        return descRepositoryService.create(description);
    }

    @Override
    public void delete(UUID uuid) {
        descRepositoryService.delete(uuid);
    }

    @Override
    public void update(Description description) {
        descRepositoryService.update(description);
    }

    @Override
    public Description findByReference(String reference) {
        return descRepositoryService.findByReferenceId(reference);
    }
}
