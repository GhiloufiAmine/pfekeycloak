package com.example.demoo.domain;

import javax.persistence.*;


@Entity(name = "DefVehicleCategoryType")
@Table(name = "DefVehicleCategoryType")
public class DefVehicleCategoryType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_category_type_id;

    @Column
    private String vehicle_category_type_name;

    public DefVehicleCategoryType() {
    }

    public DefVehicleCategoryType(Long vehicle_category_type_id, String vehicle_category_type_name) {
        this.vehicle_category_type_id = vehicle_category_type_id;
        this.vehicle_category_type_name = vehicle_category_type_name;
    }

    public Long getVehicle_category_type_id() {
        return vehicle_category_type_id;
    }

    public void setVehicle_category_type_id(Long vehicle_category_type_id) {
        this.vehicle_category_type_id = vehicle_category_type_id;
    }

    public String getVehicle_category_type_name() {
        return vehicle_category_type_name;
    }

    public void setVehicle_category_type_name(String vehicle_category_type_name) {
        this.vehicle_category_type_name = vehicle_category_type_name;
    }
}