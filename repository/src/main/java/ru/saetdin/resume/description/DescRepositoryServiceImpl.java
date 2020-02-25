package ru.saetdin.resume.description;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Description;
import ru.saetdin.resume.common.AbstractRepositoryService;

@Service
public class DescRepositoryServiceImpl extends AbstractRepositoryService<Description> implements DeskRepositoryService {

    @Autowired
    private DeskRepository deskRepository;

    @Override
    public Description findByReferenceId(String refId) {
        return deskRepository.findDescriptionByReferenceId(refId);
    }
}
