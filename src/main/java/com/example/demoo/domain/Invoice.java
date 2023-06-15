package com.example.demoo.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Invoice")
@Table(name = "Invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long invoice_id;

    @OneToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    private Contract contract;

    @Column
    private String code;

    @Column
    private String invoice_ref;

    @Column
    private String client_name;

    @Column
    private LocalDate creation_date;

    @Column
    private Float total_payment;

    public Invoice() {
    }

    public Invoice(Long invoice_id, Contract contract_id, String code, String invoice_ref, String client_name,
                   LocalDate creation_date, Float total_payment) {
        this.invoice_id = invoice_id;
        this.contract = contract_id;
        this.code = code;
        this.invoice_ref = invoice_ref;
        this.client_name = client_name;
        this.creation_date = creation_date;
        this.total_payment = total_payment;
    }

    public Long getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Long invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
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