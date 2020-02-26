package ru.saetdin.resume.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.saetdin.resume.*;

@RestController
@RequestMapping("helper")
public class HelperWindowsController {

    @Autowired
    private DescriptionService descriptionService;

    @Autowired
    private NoteService noteService;

    @Autowired
    private ImageService imageService;

    @CrossOrigin
    @RequestMapping(path = "/create/{uuid}", method = RequestMethod.POST)
    public void createReference(@PathVariable String uuid) {
        Description description = new Description();
        Note note = new Note();
        Image image = new Image();

        description.setReferenceId(uuid);
        note.setReferenceId(uuid);
        image.setReferenceId(uuid);

        descriptionService.create(description);
        noteService.create(note);
        imageService.create(image);
    }
}
