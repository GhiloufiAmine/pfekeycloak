package com.example.demoo.domain;

import javax.persistence.*;
import java.util.List;

@Entity(name = "DefAgency")
@Table(name = "DefAgency")
public class DefAgency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agency_id")
    private Long agency_id;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    private DefCompany company;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id ")
    private DefUser user;

    @OneToMany
    @JoinColumn
    private List<Contract> contracts;

    @OneToMany
    @JoinColumn
    private List<DefVehicle> vehicles;

    @Column
    private String name = "Nearer";

    @Column
    private String agency_code = "47M292YH ";

    @Column
    private String email = "agency_email@domain.com";

    @Column
    private String address = "agency address";

    @Column
    private String pick_up_address = "agency's pick up address";

    @Column
    private String opening_hours = "From xxAM To yyPM, From Monday To Friday";

    @Column
    private Integer phone = 12345678;

    @Column
    private double longitude = 123456789.123;

    @Column
    private double latitude = 123456789.123;

    @Column
    private Boolean master = true;

    @Column
    private Boolean active = true;

    public DefAgency(Long agency_id, DefCompany company, DefUser user, List<Contract> contracts,
                     List<DefVehicle> vehicles, String name, String agency_code, String email, String address,
                     String pick_up_address, String opening_hours, Integer phone, double longitude, double latitude,
                     Boolean master, Boolean active) {
        this.agency_id = agency_id;
        this.company = company;
        this.user = user;
        this.contracts = contracts;
        this.vehicles = vehicles;
        this.name = name;
        this.agency_code = agency_code;
        this.email = email;
        this.address = address;
        this.pick_up_address = pick_up_address;
        this.opening_hours = opening_hours;
        this.phone = phone;
        this.longitude = longitude;
        this.latitude = latitude;
        this.master = master;
        this.active = active;
    }

    public DefAgency() {

    }

    public Long getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(Long agency_id) {
        this.agency_id = agency_id;
    }

    public DefCompany getCompany() {
        return company;
    }

    public void setCompany(DefCompany company) {
        this.company = company;
    }

    public DefUser getUser() {
        return user;
    }

    public void setUser(DefUser user) {
        this.user = user;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
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

    public String getAgency_code() {
        return agency_code;
    }

    public void setAgency_code(String agency_code) {
        this.agency_code = agency_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPick_up_address() {
        return pick_up_address;
    }

    public void setPick_up_address(String pick_up_address) {
        this.pick_up_address = pick_up_address;
    }

    public String getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(String opening_hours) {
        this.opening_hours = opening_hours;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
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