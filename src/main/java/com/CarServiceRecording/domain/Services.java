package com.CarServiceRecording.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "services")
public class Services extends AbstractAuditingEntity{

    private String name;
    private float price;
    private boolean disable;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;
    public Car getCar() {return car;}
    public void setCar(Car car) {this.car = car;}

    @NotNull
    @Size(max = 50)
    @Column(name = "name",length = 50)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "price")
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name = "disable")
    public boolean isDisable() {
        return disable;
    }
    public void setDisable(boolean disable) {
        this.disable = disable;
    }
}
