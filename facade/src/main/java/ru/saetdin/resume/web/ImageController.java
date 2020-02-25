package ru.saetdin.resume.web;


import org.postgresql.core.Encoding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.saetdin.resume.Image;
import ru.saetdin.resume.ImageService;
import ru.saetdin.resume.Note;
import ru.saetdin.resume.dto.ImageDto;
import ru.saetdin.resume.dto.NoteDto;

import java.util.UUID;

@RestController
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @Autowired
    @Qualifier("DTOConversionService")
    private ConversionService conversionService;

    @CrossOrigin
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<ImageDto> getByRef(@PathVariable(name = "id") String id) {
        Image image = imageService.findByReference(id);
        return new ResponseEntity<>(conversionService.convert(image, ImageDto.class), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public void updateNote(@RequestBody ImageDto imageDto) {
        Image image = imageService.getImageById(UUID.fromString(imageDto.getId()));
        image.setImage(imageDto.getImage().getBytes());
        imageService.update(image);
    }
}
