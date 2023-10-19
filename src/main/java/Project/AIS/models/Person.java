package Project.AIS.models;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "person")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PersonCar> personCars;

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

    public Set<PersonCar> getPersonCars() {
        return personCars;
    }

    public void setPersonCars(Set<PersonCar> personCars) {
        this.personCars = personCars;
    }

    public Person(Integer id, String name, Set<PersonCar> personCars) {
        this.id = id;
        this.name = name;
        this.personCars = personCars;
    }

    public Person() {
    }



}