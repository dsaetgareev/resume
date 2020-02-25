package ru.saetdin.resume.dto.converter;

import org.springframework.core.convert.converter.Converter;
import ru.saetdin.resume.Image;
import ru.saetdin.resume.dto.ImageDto;

public class ImageDtoConverter implements Converter<Image, ImageDto> {

    @Override
    public ImageDto convert(Image image) {
        ImageDto imageDto = new ImageDto();
        imageDto.setId(image.getId().toString());
        if (image.getImage() == null) {
            imageDto.setImage("");
        } else {
            imageDto.setImage(new String(image.getImage()));
        }
        return imageDto;
    }
}
