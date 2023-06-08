package com.example.demoo.domain;

import javax.persistence.*;

@Entity(name = "DefAgency")
@Table(name = "DefAgency")
public class DefAgency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agency_id")
    private Long agency_id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private DefCompany company_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private DefUser defUser_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "pick_up_address", nullable = false)
    private String pick_up_address;

    @Column(name = "opening_hours", nullable = false)
    private String opening_hours;

    @Column(name = "phone", nullable = false)
    private Integer phone;

    @Column(name = "longitude", nullable = false)
    private Float longitude;

    @Column(name = "latitude", nullable = false)
    private Float latitude;

    @Column(name = "master")
    private Boolean master;

    @Column(name = "active")
    private Boolean active;

    public DefAgency(Long agency_id, DefCompany company_id, DefUser defUser_id, String name, String code, String email, String address, String pick_up_address, String opening_hours, Integer phone, Float longitude, Float latitude, Boolean master, Boolean active) {
        this.agency_id = agency_id;
        this.company_id = company_id;
        this.defUser_id = defUser_id;
        this.name = name;
        this.code = code;
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

    public Long getAgency_id() {
        return agency_id;
    }

    public void setAgency_id(Long agency_id) {
        this.agency_id = agency_id;
    }

    public DefCompany getCompany_id() {
        return company_id;
    }

    public void setCompany_id(DefCompany company_id) {
        this.company_id = company_id;
    }

    public DefUser getUser_id() {
        return defUser_id;
    }

    public void setUser_id(DefUser defUser_id) {
        this.defUser_id = defUser_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
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

    public DefAgency() {
    }
}