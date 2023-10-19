package Project.AIS.repositories;

import Project.AIS.models.Car;
import Project.AIS.models.PartsParam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartsParamRepository extends JpaRepository<PartsParam, Integer> {
}
