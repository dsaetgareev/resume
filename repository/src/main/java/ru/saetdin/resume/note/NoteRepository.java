package ru.saetdin.resume.note;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.saetdin.resume.Note;

import java.util.UUID;

@Repository
public interface NoteRepository extends JpaRepository<Note, UUID> {

    Note findNoteByReferenceId(String refId);
}
