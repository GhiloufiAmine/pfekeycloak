package com.example.demoo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long contract_id;

    @ManyToOne
    @JoinColumn(name = "agency_id", referencedColumnName = "agency_id")
    private DefAgency agency;

    @OneToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "payment_id")
    private Payment payment;

    @OneToOne
    @JoinColumn(name = "invoice_id", referencedColumnName = "invoice_id")
    private Invoice invoice;

    @Column
    private String code;

    @Column
    private String contract_status;

    @Column
    private LocalDate pick_date_reservation;

    @Column
    private LocalDate return_date_reservation;

    @Column
    private LocalDate creation_date;

    @Column
    private Float rent_amount;

    @Column
    private Float total_price;

    @Column
    private Integer mileage;

    @Column
    private Boolean confirmed;


    public Contract() {

    }

    public Contract(Long contract_id, DefAgency agency_id, Payment payment_id, Invoice invoice_id , String code,
                    String contract_status, LocalDate pick_date_reservation, LocalDate return_date_reservation,
                    LocalDate creation_date, Float rent_amount, Float total_price, Integer mileage,
                    Boolean confirmed) {
        this.contract_id = contract_id;
        this.agency = agency_id;
        this.payment = payment_id;
        this.invoice = invoice_id;
        this.code = code;
        this.contract_status = contract_status;
        this.pick_date_reservation = pick_date_reservation;
        this.return_date_reservation = return_date_reservation;
        this.creation_date = creation_date;
        this.rent_amount = rent_amount;
        this.total_price = total_price;
        this.mileage = mileage;
        this.confirmed = confirmed;
    }

    public Long getContract_id() {
        return contract_id;
    }

    public void setContract_id(Long contract_id) {
        this.contract_id = contract_id;
    }

    public DefAgency getAgency() {
        return agency;
    }

    public void setAgency(DefAgency agency) {
        this.agency = agency;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContract_status() {
        return contract_status;
    }

    public void setContract_status(String contract_status) {
        this.contract_status = contract_status;
    }

    public LocalDate getPick_date_reservation() {
        return pick_date_reservation;
    }

    public void setPick_date_reservation(LocalDate pick_date_reservation) {
        this.pick_date_reservation = pick_date_reservation;
    }

    public LocalDate getReturn_date_reservation() {
        return return_date_reservation;
    }

    public void setReturn_date_reservation(LocalDate return_date_reservation) {
        this.return_date_reservation = return_date_reservation;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = creation_date;
    }

    public Float getRent_amount() {
        return rent_amount;
    }

    public void setRent_amount(Float rent_amount) {
        this.rent_amount = rent_amount;
    }

    public Float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Float total_price) {
        this.total_price = total_price;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }
}