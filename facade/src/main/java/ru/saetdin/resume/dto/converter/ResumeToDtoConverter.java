package ru.saetdin.resume.dto.converter;

import org.springframework.core.convert.converter.Converter;
import ru.saetdin.resume.Resume;
import ru.saetdin.resume.dto.ResumeDto;

import java.util.UUID;

public class ResumeToDtoConverter implements Converter<ResumeDto, Resume> {

    @Override
    public Resume convert(ResumeDto resumeDto) {
        Resume resume = new Resume();
        resume.setId(UUID.fromString(resumeDto.getId()));
        resume.setTitle(resumeDto.getTitle());
        resume.setContent(resumeDto.getContent());
        return resume;
    }
}
