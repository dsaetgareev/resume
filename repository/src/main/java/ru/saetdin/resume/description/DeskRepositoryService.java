package ru.saetdin.resume.description;

import ru.saetdin.resume.Description;
import ru.saetdin.resume.common.RepositoryService;

public interface DeskRepositoryService extends RepositoryService<Description> {
    Description findByReferenceId(String refId);
}
