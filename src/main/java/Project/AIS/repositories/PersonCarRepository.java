package Project.AIS.repositories;

import Project.AIS.models.PartsParam;
import Project.AIS.models.PersonCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonCarRepository extends JpaRepository<PersonCar, Integer> {
}
