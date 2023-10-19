package Project.AIS.repositories;


import Project.AIS.models.CarParts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarPartsRepository extends JpaRepository<CarParts, Integer> {
}
