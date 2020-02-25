package ru.saetdin.resume.note;

import ru.saetdin.resume.Note;
import ru.saetdin.resume.common.RepositoryService;

public interface NoteRepositoryService extends RepositoryService<Note> {

    Note findByReferenceId(String refId);
}
