package Project.AIS.models;

import jakarta.persistence.*;

@Entity
@Table(name = "parts_param")
public class PartsParam {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CarParts getCarParts() {
        return carParts;
    }

    public void setCarParts(CarParts carParts) {
        this.carParts = carParts;
    }

    public CarPartsParam getCarPartsParam() {
        return carPartsParam;
    }

    public void setCarPartsParam(CarPartsParam carPartsParam) {
        this.carPartsParam = carPartsParam;
    }

    public PartsParam() {
    }

    public PartsParam(Integer id, CarParts carParts, CarPartsParam carPartsParam) {
        this.id = id;
        this.carParts = carParts;
        this.carPartsParam = carPartsParam;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_parts_id")
    private CarParts carParts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_parts_param_id")
    private CarPartsParam carPartsParam;


}
