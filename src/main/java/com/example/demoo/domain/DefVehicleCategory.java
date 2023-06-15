package com.example.demoo.domain;

import javax.persistence.*;

@Entity(name = "DefVehicleCategory")
@Table(name = "DefVehicleCategory")
public class DefVehicleCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_category_id;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_type_id", referencedColumnName = "vehicle_category_type_id")
    private DefVehicleCategoryType vehicle_category_type_id;

    @Column
    private String vehicle_category_name;

    @Column
    private Boolean master;

    @Column
    private Boolean active;

    public DefVehicleCategory() {
    }

    public DefVehicleCategory(Long vehicle_category_id, DefVehicleCategoryType vehicle_category_type_id, String vehicle_category_name, Boolean master, Boolean active) {
        this.vehicle_category_id = vehicle_category_id;
        this.vehicle_category_type_id = vehicle_category_type_id;
        this.vehicle_category_name = vehicle_category_name;
        this.master = master;
        this.active = active;
    }

    public Long getVehicle_category_id() {
        return vehicle_category_id;
    }

    public void setVehicle_category_id(Long vehicle_category_id) {
        this.vehicle_category_id = vehicle_category_id;
    }

    public DefVehicleCategoryType getVehicle_category_type_id() {
        return vehicle_category_type_id;
    }

    public void setVehicle_category_type_id(DefVehicleCategoryType vehicle_category_type_id) {
        this.vehicle_category_type_id = vehicle_category_type_id;
    }

    public String getVehicle_category_name() {
        return vehicle_category_name;
    }

    public void setVehicle_category_name(String vehicle_category_name) {
        this.vehicle_category_name = vehicle_category_name;
    }

    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}