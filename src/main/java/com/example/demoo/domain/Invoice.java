package com.example.demoo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Invoice")
@Table(name = "Invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice")
    private Long invoice;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract_id;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "invoice_ref", nullable = false)
    private String invoice_ref;

    @Column(name = "client_name", nullable = false)
    private String client_name;

    @Column(name = "creation_date", nullable = false)
    private LocalDate creation_date;

    @Column(name = "total_payment", nullable = false)
    private Float total_payment;

    public Invoice() {
    }

    public Invoice(Long invoice, Contract contract_id, String code, String invoice_ref, String client_name, LocalDate creation_date, Float total_payment) {
        this.invoice = invoice;
        this.contract_id = contract_id;
        this.code = code;
        this.invoice_ref = invoice_ref;
        this.client_name = client_name;
        this.creation_date = creation_date;
        this.total_payment = total_payment;
    }

    public Long getInvoice() {
        return invoice;
    }

    public void setInvoice(Long invoice) {
        this.invoice = invoice;
    }

    public Contract getContract_id() {
        return contract_id;
    }

    public void setContract_id(Contract contract_id) {
        this.contract_id = contract_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInvoice_ref() {
        return invoice_ref;
    }

    public void setInvoice_ref(String invoice_ref) {
        this.invoice_ref = invoice_ref;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = creation_date;
    }

    public Float getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(Float total_payment) {
        this.total_payment = total_payment;
    }
}