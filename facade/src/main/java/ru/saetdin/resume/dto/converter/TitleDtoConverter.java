package ru.saetdin.resume.dto.converter;

import org.springframework.core.convert.converter.Converter;
import ru.saetdin.resume.Resume;
import ru.saetdin.resume.dto.TitleDto;

public class TitleDtoConverter implements Converter<Resume, TitleDto> {

    @Override
    public TitleDto convert(Resume resume) {
        TitleDto titleDto = new TitleDto();
        titleDto.setResumeId(resume.getId().toString());
        titleDto.setTitle(resume.getTitle());
        return titleDto;
    }
}
