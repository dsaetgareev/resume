package ru.saetdin.resume.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.saetdin.resume.Description;
import ru.saetdin.resume.DescriptionService;
import ru.saetdin.resume.dto.DescriptionDto;

import java.util.UUID;

@RestController
@RequestMapping("desc")
public class DescriptionController {

    @Autowired
    private DescriptionService descriptionService;

    @Autowired
    @Qualifier("DTOConversionService")
    private ConversionService conversionService;


    @CrossOrigin
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<DescriptionDto> getByRef(@PathVariable(name = "id") String id) {
        Description description = descriptionService.findByReference(id);
        return new ResponseEntity<>(conversionService.convert(description, DescriptionDto.class), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public void updateDesc(@RequestBody DescriptionDto descriptionDto) {
        Description desc = descriptionService.getDescById(UUID.fromString(descriptionDto.getId()));
        desc.setText(descriptionDto.getText());
        descriptionService.update(desc);
    }

}
