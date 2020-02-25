package ru.saetdin.resume.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Image;
import ru.saetdin.resume.ImageService;
import ru.saetdin.resume.image.ImageRepositoryService;

import java.util.UUID;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepositoryService imageRepositoryService;


    @Override
    public Image getImageById(UUID id) {
        return imageRepositoryService.read(id);
    }

    @Override
    public Image create(Image image) {
        return imageRepositoryService.create(image);
    }

    @Override
    public void delete(UUID uuid) {
        imageRepositoryService.delete(uuid);
    }

    @Override
    public void update(Image image) {
        imageRepositoryService.update(image);
    }

    @Override
    public Image findByReference(String referenceId) {
        return imageRepositoryService.findByReferenceId(referenceId);
    }
}
