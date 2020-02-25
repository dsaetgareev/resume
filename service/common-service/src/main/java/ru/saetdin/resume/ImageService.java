package ru.saetdin.resume;

import java.util.UUID;

public interface ImageService {

    Image getImageById(UUID id);
    Image create(Image image);
    void delete(UUID uuid);
    void update(Image image);
    Image findByReference(String referenceId);
}
