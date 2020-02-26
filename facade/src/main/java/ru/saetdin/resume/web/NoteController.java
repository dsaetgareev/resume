package ru.saetdin.resume.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.saetdin.resume.Description;
import ru.saetdin.resume.Note;
import ru.saetdin.resume.NoteService;
import ru.saetdin.resume.dto.DescriptionDto;
import ru.saetdin.resume.dto.NoteDto;

import java.util.UUID;

@RestController
@RequestMapping("note")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @Autowired
    @Qualifier("DTOConversionService")
    private ConversionService conversionService;

    @CrossOrigin
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<NoteDto> getByRef(@PathVariable(name = "id") String id) {
        Note note = noteService.findByReference(id);
        return new ResponseEntity<>(conversionService.convert(note, NoteDto.class), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public void updateNote(@RequestBody NoteDto noteDto) {
        Note note = noteService.getNoteById(UUID.fromString(noteDto.getId()));
        note.setText(noteDto.getText());
        noteService.update(note);
    }
}
