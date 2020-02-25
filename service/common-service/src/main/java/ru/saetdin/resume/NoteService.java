package ru.saetdin.resume;

import java.util.UUID;

public interface NoteService {

    Note getNoteById(UUID uuid);
    Note create(Note note);
    void delete(UUID uuid);
    void update(Note note);
    Note findByReference(String reference);
}
