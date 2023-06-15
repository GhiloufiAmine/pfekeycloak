package com.example.demoo.domain;

import javax.persistence.*;
import java.util.List;


@Entity(name = "DefClientCategory")
@Table(name = "DefClientCategory")
public class DefClientCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_category_id")
    private Long client_category_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<DefClient> clients;

    @Column
    private String client_category_name;

    public DefClientCategory(Long client_category_id, List<DefClient> clients, String client_category_name) {
        this.client_category_id = client_category_id;
        this.clients = clients;
        this.client_category_name = client_category_name;
    }

    public DefClientCategory() {

    }

    public Long getClient_category_id() {
        return client_category_id;
    }

    public void setClient_category_id(Long client_category_id) {
        this.client_category_id = client_category_id;
    }

    public List<DefClient> getClients() {
        return clients;
    }

    public void setClients(List<DefClient> clients) {
        this.clients = clients;
    }

    public String getClient_category_name() {
        return client_category_name;
    }

    public void setClient_category_name(String client_category_name) {
        this.client_category_name = client_category_name;
    }
}