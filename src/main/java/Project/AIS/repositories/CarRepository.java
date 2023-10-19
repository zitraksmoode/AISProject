package Project.AIS.repositories;

import Project.AIS.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Integer> {
    Optional<Car> findByBrand(String  brand);
    Optional<Car> findByModel(String  models);
}
