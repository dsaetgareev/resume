package ru.saetdin.resume.description;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.saetdin.resume.Description;

import java.util.UUID;

@Repository
public interface DeskRepository extends JpaRepository<Description, UUID> {

    Description findDescriptionByReferenceId(String refId);
}
