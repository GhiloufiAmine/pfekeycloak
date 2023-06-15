package com.example.demoo.domain;

import javax.persistence.*;
import java.util.List;


@Entity(name = "DefBrand")
@Table(name = "DefBrand")
public class DefBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brand_id;

    @OneToMany
    @JoinColumn
    private List<DefVehicleModel> models;

    @OneToMany
    @JoinColumn
    private List<DefVehicleCategory> categories;

    @Column
    private String name;

    @Column
    private Boolean active;

    public DefBrand(Long brand_id, List<DefVehicleModel> models, List<DefVehicleCategory> categories, String name,
                    Boolean active) {
        this.brand_id = brand_id;
        this.models = models;
        this.categories = categories;
        this.name = name;
        this.active = active;
    }

    public DefBrand() {

    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public List<DefVehicleModel> getModels() {
        return models;
    }

    public void setModels(List<DefVehicleModel> models) {
        this.models = models;
    }

    public List<DefVehicleCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<DefVehicleCategory> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}