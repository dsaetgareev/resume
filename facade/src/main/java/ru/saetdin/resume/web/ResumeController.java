package ru.saetdin.resume.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.saetdin.resume.Person;
import ru.saetdin.resume.PersonService;
import ru.saetdin.resume.Resume;
import ru.saetdin.resume.ResumeService;
import ru.saetdin.resume.dto.ResumeDto;
import ru.saetdin.resume.dto.TitleDto;
import ru.saetdin.resume.utils.ResumeUtil;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;
    @Autowired
    private PersonService personService;

    @Autowired
    @Qualifier("DTOConversionService")
    private ConversionService conversionService;

    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public void createResume() {
        for (int i = 0; i < 10 ; i++) {
            Resume resume = new Resume();
            Person person = new Person();


            person.setNickName("author" + i);
            person.setPassword("1234");
            person.setTelephoneNumber("565656");
            personService.create(person);
            resume.setAuthor(person);
            resume.setContent("jfkdjfkdfkjdfj");
            resume.setTitle("title"+i);
            resumeService.create(resume);
        }

    }

    @RequestMapping(value = "/list/resume", method = RequestMethod.GET)
    public ResponseEntity<List<ResumeDto>> getAllResume() {
        return new ResponseEntity<>(resumeService.getAllResumes()
                .parallelStream()
                .map(resume -> conversionService.convert(resume, ResumeDto.class))
                .collect(Collectors.toList()), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/list/titles", method = RequestMethod.GET)
    public ResponseEntity<List<TitleDto>> getTitles() {
        return new ResponseEntity<>(resumeService.getAllResumes()
                .parallelStream()
                .map(resume -> conversionService.convert(resume, TitleDto.class))
                .collect(Collectors.toList()), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<ResumeDto> getResumeById(@PathVariable(name = "id") String id) {
        Resume resume = resumeService.getResumeById(UUID.fromString(id));
        return new ResponseEntity<ResumeDto>(conversionService.convert(resume, ResumeDto.class), HttpStatus.OK);
    }

    @CrossOrigin
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public void updateResume(@RequestBody ResumeDto resumeDto) {
        Resume resume = resumeService.getResumeById(UUID.fromString(resumeDto.getId()));
        ResumeUtil.convertResumeDtoToResume(resumeDto, resume);
        resumeService.update(resume);
    }
}
