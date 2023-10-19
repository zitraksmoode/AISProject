package Project.AIS.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "car_parts")
public class CarParts {
    public CarParts() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PartsParam> getPartsParams() {
        return partsParams;
    }

    public void setPartsParams(Set<PartsParam> partsParams) {
        this.partsParams = partsParams;
    }

    public CarParts(Integer id, Car car, String name, Set<PartsParam> partsParams) {
        this.id = id;
        this.car = car;
        this.name = name;
        this.partsParams = partsParams;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "carParts", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PartsParam> partsParams;



}