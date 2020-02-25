package ru.saetdin.resume.dto.converter;

import org.springframework.core.convert.converter.Converter;
import ru.saetdin.resume.Resume;
import ru.saetdin.resume.dto.ResumeDto;

public class ResumeDtoConverter implements Converter<Resume, ResumeDto> {

    @Override
    public ResumeDto convert(Resume resume) {
        ResumeDto resumeDto = new ResumeDto();
        resumeDto.setId(resume.getId().toString());
        resumeDto.setTitle(resume.getTitle());
        resumeDto.setContent(resume.getContent());
        return resumeDto;
    }
}
