package ru.saetdin.resume.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Note;
import ru.saetdin.resume.common.AbstractRepositoryService;

@Service
public class NoteRepositoryServiceImpl extends AbstractRepositoryService<Note> implements NoteRepositoryService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note findByReferenceId(String refId) {
        return noteRepository.findNoteByReferenceId(refId);
    }
}
