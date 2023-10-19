package Project.AIS.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "person_car")
public class PersonCar {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Set<PersonCarParam> getPersonCarParams() {
        return personCarParams;
    }

    public void setPersonCarParams(Set<PersonCarParam> personCarParams) {
        this.personCarParams = personCarParams;
    }

    public PersonCar() {
    }

    public PersonCar(Integer id, String name, Person person, Car car, Set<PersonCarParam> personCarParams) {
        this.id = id;
        this.name = name;
        this.person = person;
        this.car = car;
        this.personCarParams = personCarParams;
    }

    @OneToMany(mappedBy = "personCar", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PersonCarParam> personCarParams;




    // getters and setters
}