package ru.saetdin.resume.utils;

import ru.saetdin.resume.Resume;
import ru.saetdin.resume.dto.ResumeDto;

public class ResumeUtil {

    public static void convertResumeDtoToResume(ResumeDto resumeDto, Resume resume) {
        if (resumeDto.getTitle() != null) {
            resume.setTitle(resumeDto.getTitle());
        }
        if (resumeDto.getContent() != null) {
            resume.setContent(resumeDto.getContent());
        }
    }
}
