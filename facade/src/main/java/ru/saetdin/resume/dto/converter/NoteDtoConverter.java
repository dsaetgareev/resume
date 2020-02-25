package ru.saetdin.resume.dto.converter;

import org.springframework.core.convert.converter.Converter;
import ru.saetdin.resume.Note;
import ru.saetdin.resume.dto.NoteDto;

public class NoteDtoConverter implements Converter<Note, NoteDto> {

    @Override
    public NoteDto convert(Note note) {
        NoteDto noteDto = new NoteDto();
        noteDto.setId(note.getId().toString());
        noteDto.setText(note.getText());
        return noteDto;
    }
}
