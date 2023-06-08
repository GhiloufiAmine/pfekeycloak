package com.example.demoo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Contravention")
@Table(name = "Contravention")
public class Contravention {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contravention_id")
    private Long contravention_id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private DefClient client_id;

    public Contravention() {

    }

    public Contravention(Long contravention_id, DefClient client_id, String contravention_type, LocalDate contravention_date, String contravention_description, String contravention_status) {
        this.contravention_id = contravention_id;
        this.client_id = client_id;
        this.contravention_type = contravention_type;
        this.contravention_date = contravention_date;
        this.contravention_description = contravention_description;
        this.contravention_status = contravention_status;
    }

    @Column(name = "contravention_type", nullable = false)
    private String contravention_type;

    @Column(name = "contravention_date", nullable = false)
    private LocalDate contravention_date;

    @Column(name = "contravention_description", nullable = false)
    private String contravention_description;

    public Long getContravention_id() {
        return contravention_id;
    }

    public void setContravention_id(Long contravention_id) {
        this.contravention_id = contravention_id;
    }

    public DefClient getClient_id() {
        return client_id;
    }

    public void setClient_id(DefClient client_id) {
        this.client_id = client_id;
    }

    public String getContravention_type() {
        return contravention_type;
    }

    public void setContravention_type(String contravention_type) {
        this.contravention_type = contravention_type;
    }

    public LocalDate getContravention_date() {
        return contravention_date;
    }

    public void setContravention_date(LocalDate contravention_date) {
        this.contravention_date = contravention_date;
    }

    public String getContravention_description() {
        return contravention_description;
    }

    public void setContravention_description(String contravention_description) {
        this.contravention_description = contravention_description;
    }

    public String getContravention_status() {
        return contravention_status;
    }

    public void setContravention_status(String contravention_status) {
        this.contravention_status = contravention_status;
    }

    @Column(name = "contravention_status", nullable = false)
    private String contravention_status;
}