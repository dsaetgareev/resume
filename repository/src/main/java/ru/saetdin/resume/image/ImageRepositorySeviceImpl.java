package ru.saetdin.resume.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.saetdin.resume.Image;
import ru.saetdin.resume.common.AbstractRepositoryService;

@Service
public class ImageRepositorySeviceImpl extends AbstractRepositoryService<Image> implements ImageRepositoryService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image findByReferenceId(String id) {
        return imageRepository.findImageByReferenceId(id);
    }
}
