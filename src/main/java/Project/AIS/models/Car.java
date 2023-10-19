package Project.AIS.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String brand;

    @Column(nullable = false, length = 50)
    private String model;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PersonCar> personCars;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CarParts> carParts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set<PersonCar> getPersonCars() {
        return personCars;
    }

    public void setPersonCars(Set<PersonCar> personCars) {
        this.personCars = personCars;
    }

    public Set<CarParts> getCarParts() {
        return carParts;
    }

    public void setCarParts(Set<CarParts> carParts) {
        this.carParts = carParts;
    }

    public Car() {
    }

    public Car(Integer id, String brand, String model, Set<PersonCar> personCars, Set<CarParts> carParts) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.personCars = personCars;
        this.carParts = carParts;
    }


}
