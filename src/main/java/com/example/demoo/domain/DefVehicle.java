package com.example.demoo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "DefVehicle")
@Table(name = "DefVehicle")
public class DefVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_id;

    @ManyToOne
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id")
    private DefAgency agency_id;

    @ManyToOne
    @JoinColumn(name = "vehicle_model_id", referencedColumnName = "vehicle_model_id")
    private DefVehicleModel model_id;

    @Column
    private String color;

    @Column
    private String registration_number;

    @Column
    private String description;

    @Column
    private LocalDate start_of_service_date;

    @Column
    private LocalDate end_of_service_date;

    @Column
    private LocalDate contract_start_date;

    @Column
    private LocalDate contract_end_date;

    @Column
    private Boolean multi_agency;

    @Column
    private Boolean active;

    public DefVehicle() {
    }

    public DefVehicle(Long vehicle_id, DefAgency agency_id, DefVehicleModel model_id, String color,
                      String registration_number, String description, LocalDate start_of_service_date,
                      LocalDate end_of_service_date, LocalDate contract_start_date, LocalDate contract_end_date,
                      Boolean multi_agency, Boolean active) {
        this.vehicle_id = vehicle_id;
        this.agency_id = agency_id;
        this.model_id = model_id;
        this.color = color;
        this.registration_number = registration_number;
        this.description = description;
        this.start_of_service_date = start_of_service_date;
        this.end_of_service_date = end_of_service_date;
        this.contract_start_date = contract_start_date;
        this.contract_end_date = contract_end_date;
        this.multi_agency = multi_agency;
        this.active = active;
    }

    public Long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public DefAgency getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(DefAgency agency_id) {
        this.agency_id = agency_id;
    }

    public DefVehicleModel getModel_id() {
        return model_id;
    }

    public void setModel_id(DefVehicleModel model_id) {
        this.model_id = model_id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStart_of_service_date() {
        return start_of_service_date;
    }

    public void setStart_of_service_date(LocalDate start_of_service_date) {
        this.start_of_service_date = start_of_service_date;
    }

    public LocalDate getEnd_of_service_date() {
        return end_of_service_date;
    }

    public void setEnd_of_service_date(LocalDate end_of_service_date) {
        this.end_of_service_date = end_of_service_date;
    }

    public LocalDate getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(LocalDate contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public LocalDate getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(LocalDate contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    public Boolean getMulti_agency() {
        return multi_agency;
    }

    public void setMulti_agency(Boolean multi_agency) {
        this.multi_agency = multi_agency;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}