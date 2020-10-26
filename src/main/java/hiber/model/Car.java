package hiber.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String model;


    private int series;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

public Car(){}

public Car(String model, int series) {
    this.model = model;
    this.series = series;
}

    public String getModel() {
        return model;
   }

    public void setModel(String model) {
        this.model = model;
    }
    @Transactional
    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return model;
    }
}
