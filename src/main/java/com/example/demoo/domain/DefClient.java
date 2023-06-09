package com.example.demoo.domain;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity(name = "DefClient")
public class DefClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    DefUser user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_category_id", referencedColumnName = "client_category_id")
    private DefClientCategory clientCategory;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "flag_id" , referencedColumnName = "flag_id")
    private RedFlag flagged;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email = user.getEmail();

    @Column
    private Date birthDate;

    @Column
    private Integer mobile;

    public DefClient() {
    }

    public DefClient(Long client_id, DefUser user_id, DefClientCategory client_category_id, String firstName,
                     String lastName, String email, Date birthDate, Integer mobile, RedFlag flagged) {
        this.client_id = client_id;
        this.user = user_id;
        this.clientCategory = client_category_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthDate = birthDate;
        this.mobile = mobile;
        this.flagged = flagged;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public DefClientCategory getClient_category_id() {
        return clientCategory;
    }

    public void setClient_category_id(DefClientCategory client_category_id) {
        this.clientCategory = client_category_id;
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

    public String getEmail(DefUser user) {
        return user.getEmail();
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

    public RedFlag getFlagged() {
        return flagged;
    }

    public void setFlagged(RedFlag flagged) {
        this.flagged = flagged;
    }

    public int getAge() {
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(this.birthDate);
        Calendar now = Calendar.getInstance();
        int years = now.get(Calendar.YEAR) - birthDate.get(Calendar.DAY_OF_YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            years--;
        }
        return years;
    }

    public void setUser(DefUser user) {
        this.user = user;
    }
}