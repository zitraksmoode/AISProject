package Project.AIS.repositories;

import Project.AIS.models.PartsParam;
import Project.AIS.models.PersonCarParam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonCarParamRepository extends JpaRepository<PersonCarParam, Integer> {
}
