package com.CarServiceRecording.domain;

import com.CarServiceRecording.domain.enumeration.EngineType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "car")
public class Car extends AbstractAuditingEntity{
    private String companyName;
    private EngineType engineType;
    private String color;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @NotNull
    @Size(max = 50)
    @Column(name = "company_name",length = 50)
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public EngineType getEngineType() {
        return engineType;
    }
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Column(name = "color")
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
