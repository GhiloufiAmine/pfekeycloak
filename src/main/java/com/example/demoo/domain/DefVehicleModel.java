package com.example.demoo.domain;

import javax.persistence.*;
import java.util.List;


@Entity(name = "DefVehicleModel")
@Table(name = "DefVehicleModel")
public class DefVehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_model_id;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_id", referencedColumnName = "vehicle_category_id")
    private DefVehicleCategory vehicle_category_id;

    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    private DefBrand brand;

    @OneToMany
    @JoinColumn
    private List<DefVehicle> vehicles;

    @Column
    private String name;

    @Column
    private String version;

    @Column
    private Integer year;

    @Column
    private Integer horse_power;

    @Column
    private Integer seat_number;

    @Column
    private Integer fuel_tank_capacity;

    @Column
    private Boolean active;

    @Column
    private Boolean master;

    public DefVehicleModel() {
    }

    public DefVehicleModel(Long vehicle_model_id, DefVehicleCategory vehicle_category_id, DefBrand brand,
                           List<DefVehicle> vehicles, String name, String version, Integer year, Integer horse_power,
                           Integer seat_number, Integer fuel_tank_capacity, Boolean active, Boolean master) {
        this.vehicle_model_id = vehicle_model_id;
        this.vehicle_category_id = vehicle_category_id;
        this.brand = brand;
        this.vehicles = vehicles;
        this.name = name;
        this.version = version;
        this.year = year;
        this.horse_power = horse_power;
        this.seat_number = seat_number;
        this.fuel_tank_capacity = fuel_tank_capacity;
        this.active = active;
        this.master = master;
    }

    public Long getVehicle_model_id() {
        return vehicle_model_id;
    }

    public void setVehicle_model_id(Long vehicle_model_id) {
        this.vehicle_model_id = vehicle_model_id;
    }

    public DefVehicleCategory getVehicle_category_id() {
        return vehicle_category_id;
    }

    public void setVehicle_category_id(DefVehicleCategory vehicle_category_id) {
        this.vehicle_category_id = vehicle_category_id;
    }

    public DefBrand getBrand() {
        return brand;
    }

    public void setBrand(DefBrand brand) {
        this.brand = brand;
    }

    public List<DefVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<DefVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getHorse_power() {
        return horse_power;
    }

    public void setHorse_power(Integer horse_power) {
        this.horse_power = horse_power;
    }

    public Integer getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(Integer seat_number) {
        this.seat_number = seat_number;
    }

    public Integer getFuel_tank_capacity() {
        return fuel_tank_capacity;
    }

    public void setFuel_tank_capacity(Integer fuel_tank_capacity) {
        this.fuel_tank_capacity = fuel_tank_capacity;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }
}