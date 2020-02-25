package ru.saetdin.resume;

import java.util.UUID;

public interface DescriptionService {

    Description getDescById(UUID uuid);
    Description create(Description description);
    void delete(UUID uuid);
    void update(Description description);
    Description findByReference(String reference);
}
