package Project.AIS.models;

import jakarta.persistence.*;

@Entity
@Table(name = "person_car_param")
public class PersonCarParam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_car_id")
    private PersonCar personCar;

    @Column(nullable = false, length = 50)
    private String name;

    public PersonCarParam() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonCar getPersonCar() {
        return personCar;
    }

    public void setPersonCar(PersonCar personCar) {
        this.personCar = personCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Column(nullable = false)
    private Float value;


    public PersonCarParam(Integer id, PersonCar personCar, String name, Float value) {
        this.id = id;
        this.personCar = personCar;
        this.name = name;
        this.value = value;
    }



}