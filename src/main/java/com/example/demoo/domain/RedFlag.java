package com.example.demoo.domain;

import javax.persistence.*;

@Entity(name = "RedFlag")
public class RedFlag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "red_flag_id")
    private Long red_flag_id;

    @OneToOne
    @JoinColumn(name = "contravention_id", referencedColumnName = "contravention_id")
    private Contravention contravention;

    @Column
    private String red_flag_description;

    @Column
    private Boolean active;

    public RedFlag() {
    }

    public RedFlag(Long red_flag_id, Contravention contravention_id, String red_flag_description, Boolean active) {
        this.red_flag_id = red_flag_id;
        this.contravention = contravention_id;
        this.red_flag_description = red_flag_description;
        this.active = active;
    }

    public Long getRed_flag_id() {
        return red_flag_id;
    }

    public void setRed_flag_id(Long red_flag_id) {
        this.red_flag_id = red_flag_id;
    }

    public Contravention getContravention() {
        return contravention;
    }

    public void setContravention(Contravention contravention) {
        this.contravention = contravention;
    }

    public String getRed_flag_description() {
        return red_flag_description;
    }

    public void setRed_flag_description(String red_flag_description) {
        this.red_flag_description = red_flag_description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}