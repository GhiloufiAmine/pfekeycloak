package com.example.demoo.domain;


import javax.persistence.*;
import java.util.List;


@Entity(name = "DefCompany")
@Table(name = "DefCompany")
public class DefCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long company_id;

    @OneToMany
    @JoinColumn
    private List<DefAgency> agencies;

    @Column
    private String company_name;

    @Column
    private String city;

    @Column
    private Integer assistance_number;

    @Column
    private Float social_capital;

    @Column
    private Boolean master;

    public DefCompany() {

    }

    public DefCompany(Long company_id, List<DefAgency> agencies, String company_name, String city,
                      Integer assistance_number, Float social_capital, Boolean master) {
        this.company_id = company_id;
        this.agencies = agencies;
        this.company_name = company_name;
        this.city = city;
        this.assistance_number = assistance_number;
        this.social_capital = social_capital;
        this.master = master;
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public List<DefAgency> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<DefAgency> agencies) {
        this.agencies = agencies;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAssistance_number() {
        return assistance_number;
    }

    public void setAssistance_number(Integer assistance_number) {
        this.assistance_number = assistance_number;
    }

    public Float getSocial_capital() {
        return social_capital;
    }

    public void setSocial_capital(Float social_capital) {
        this.social_capital = social_capital;
    }

    public Boolean getMaster() {
        return master;
    }

    public void setMaster(Boolean master) {
        this.master = master;
    }
}
