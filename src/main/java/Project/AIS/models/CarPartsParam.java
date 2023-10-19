package Project.AIS.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "car_parts_param")
public class CarPartsParam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private Float value;

    @Column(nullable = false)
    private Float percent;

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

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public Set<PartsParam> getPartsParams() {
        return partsParams;
    }

    public void setPartsParams(Set<PartsParam> partsParams) {
        this.partsParams = partsParams;
    }

    public CarPartsParam() {
    }

    public CarPartsParam(Integer id, String name, Float value, Float percent, Set<PartsParam> partsParams) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.percent = percent;
        this.partsParams = partsParams;
    }

    @OneToMany(mappedBy = "carPartsParam", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PartsParam> partsParams;

}