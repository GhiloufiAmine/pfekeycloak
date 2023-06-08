package com.example.demoo.domain;

import javax.persistence.*;

@Entity(name = "RedFlag")
@Table(name = "RedFlag")
public class RedFlag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "red_flag_id")
    private Long red_flag_id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private DefClient client_id;

    @Column(name = "red_flag_description", nullable = false)
    private String red_flag_description;

    @Column(name = "active")
    private Boolean active;

    public RedFlag() {
    }

    public RedFlag(Long red_flag_id, DefClient client_id, String red_flag_description, Boolean active) {
        this.red_flag_id = red_flag_id;
        this.client_id = client_id;
        this.red_flag_description = red_flag_description;
        this.active = active;
    }

    public Long getRed_flag_id() {
        return red_flag_id;
    }

    public void setRed_flag_id(Long red_flag_id) {
        this.red_flag_id = red_flag_id;
    }

    public DefClient getClient_id() {
        return client_id;
    }

    public void setClient_id(DefClient client_id) {
        this.client_id = client_id;
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