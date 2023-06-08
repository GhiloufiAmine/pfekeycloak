package com.example.demoo.domain;

import javax.persistence.*;


@Entity(name = "DefVehicleModel")
@Table(name = "DefVehicleModel")
public class DefVehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_model_id;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_id")
    private DefVehicleCategory vehicle_category_id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private DefBrand brand_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "version", nullable = false)
    private String version;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "horse_power", nullable = false)
    private Integer horse_power;

    @Column(name = "seat_number", nullable = false)
    private Integer seat_number;

    @Column(name = "fuel_tank_capacity", nullable = false)
    private Integer fuel_tank_capacity;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "master")
    private Boolean master;

    public DefVehicleModel() {
    }

    public DefVehicleModel(Long vehicle_model_id, DefVehicleCategory vehicle_category_id, DefBrand brand_id, String name, String version, Integer year, Integer horse_power, Integer seat_number, Integer fuel_tank_capacity, Boolean active, Boolean master) {
        this.vehicle_model_id = vehicle_model_id;
        this.vehicle_category_id = vehicle_category_id;
        this.brand_id = brand_id;
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

    public DefBrand getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(DefBrand brand_id) {
        this.brand_id = brand_id;
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