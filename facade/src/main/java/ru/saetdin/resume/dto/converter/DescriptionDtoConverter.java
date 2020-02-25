package ru.saetdin.resume.dto.converter;

import org.springframework.core.convert.converter.Converter;
import ru.saetdin.resume.Description;
import ru.saetdin.resume.dto.DescriptionDto;

public class DescriptionDtoConverter implements Converter<Description, DescriptionDto> {

    @Override
    public DescriptionDto convert(Description description) {
        DescriptionDto descriptionDto = new DescriptionDto();
        descriptionDto.setId(description.getId().toString());
        descriptionDto.setText(description.getText());
        return descriptionDto;
    }
}
