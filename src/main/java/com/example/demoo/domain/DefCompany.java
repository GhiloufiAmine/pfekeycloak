package com.example.demoo.domain;


import javax.persistence.*;


@Entity(name = "DefCompany")
@Table(name = "DefCompany")
public class DefCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id")
    private Long company_id;

    @Column(name = "company_name", nullable = false)
    private String company_name;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "assistance_number", nullable = false)
    private String assistance_number;

    @Column(name = "social_capital", nullable = false)
    private Float social_capital;

    @Column(name = "master", nullable = false)
    private Boolean master;

    public DefCompany() {
    }

    public DefCompany(Long company_id, String company_name, String city, String assistance_number, Float social_capital, Boolean master) {
        this.company_id = company_id;
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

    public String getAssistance_number() {
        return assistance_number;
    }

    public void setAssistance_number(String assistance_number) {
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
