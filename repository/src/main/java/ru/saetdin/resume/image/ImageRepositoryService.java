package ru.saetdin.resume.image;

import ru.saetdin.resume.Image;
import ru.saetdin.resume.common.RepositoryService;

public interface ImageRepositoryService extends RepositoryService<Image> {

    Image findByReferenceId(String id);
}
