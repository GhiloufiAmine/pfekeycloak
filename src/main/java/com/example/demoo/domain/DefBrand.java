package com.example.demoo.domain;

import javax.persistence.*;


@Entity(name = "DefBrand")
@Table(name = "DefBrand")
public class DefBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long brand_id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "active")
    private Boolean active;

    public DefBrand(Long brand_id, String name, Boolean active, byte[] logo) {
        this.brand_id = brand_id;
        this.name = name;
        this.active = active;
        this.logo = logo;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
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

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    @Lob
    private byte[] logo;

    public DefBrand() {
    }
}