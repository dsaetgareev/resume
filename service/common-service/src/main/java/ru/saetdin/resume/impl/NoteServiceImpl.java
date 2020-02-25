package ru.saetdin.resume.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Note;
import ru.saetdin.resume.NoteService;
import ru.saetdin.resume.note.NoteRepositoryServiceImpl;

import java.util.UUID;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepositoryServiceImpl repositoryService;

    @Override
    public Note getNoteById(UUID uuid) {
        return repositoryService.read(uuid);
    }

    @Override
    public Note create(Note note) {
        return repositoryService.create(note);
    }

    @Override
    public void delete(UUID uuid) {
        repositoryService.delete(uuid);
    }

    @Override
    public void update(Note note) {
        repositoryService.update(note);
    }

    @Override
    public Note findByReference(String reference) {
        return repositoryService.findByReferenceId(reference);
    }
}
