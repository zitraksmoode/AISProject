package Project.AIS.service;


import Project.AIS.models.Car;
import Project.AIS.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCar {

    private  final CarRepository carRepository ;

    @Autowired
    public ServiceCar(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
     public List<Car> findAll() {
        return carRepository.findAll();
     }
     public Car findOne(int id) {
        Optional<Car> foundCar = carRepository.findById(id);
        return foundCar.orElse(null);
     }

}
