package com.example.demoo.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "DefClient")
public class DefClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private DefUser user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_category_id", referencedColumnName = "client_category_id")
    private DefClientCategory clientCategory;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<Contravention> contraventions;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_licence_id" , referencedColumnName = "driver_licence_id")
    private DriverLicence driverLicence;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<Payment> payments;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private Date birthDate;

    @Column
    private Integer mobile;

    public DefClient() {
    }

    public DefClient(Long client_id, DefUser user, DefClientCategory clientCategory, List<Contravention> contraventions,
                     DriverLicence driverLicence, List<Payment> payments, String firstName, String lastName,
                     String email, Date birthDate, Integer mobile) {
        this.client_id = client_id;
        this.user = user;
        this.clientCategory = clientCategory;
        this.contraventions = contraventions;
        this.driverLicence = driverLicence;
        this.payments = payments;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.mobile = mobile;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public DefUser getUser() {
        return user;
    }

    public void setUser(DefUser user) {
        this.user = user;
    }

    public DefClientCategory getClientCategory() {
        return clientCategory;
    }

    public void setClientCategory(DefClientCategory clientCategory) {
        this.clientCategory = clientCategory;
    }

    public List<Contravention> getContraventions() {
        return contraventions;
    }

    public void setContraventions(List<Contravention> contraventions) {
        this.contraventions = contraventions;
    }

    public DriverLicence getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(DriverLicence driverLicence) {
        this.driverLicence = driverLicence;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getMobile() {
        return mobile;
    }

    public void setMobile(Integer mobile) {
        this.mobile = mobile;
    }
}