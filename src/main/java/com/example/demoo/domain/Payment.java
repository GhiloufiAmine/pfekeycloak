package com.example.demoo.domain;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Payment")
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long payment_id;

    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_id")
    private DefClient client;

    @OneToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    private Contract contract;

    @Column
    private Float amount;

    @Column
    private Float total_VAT;

    @Column
    private Float total_Excl_TAX;

    @Column
    private Float total_amount_paid;

    @Column
    private Long credit_card_id;

    @Column
    private Integer bank_transfer_number;

    @Column
    private Integer check_number;

    @Column
    private Integer payment_type_id;

    @Column
    private Date creation_date;

    @Column
    private Date expiration_date;

    public Payment() {
    }

    public Payment(Long payment_id, DefClient client_id, Contract contract_id , Float amount, Float total_VAT,
                   Float total_Excl_TAX, Float total_amount_paid, Long credit_card_id, Integer bank_transfer_number,
                   Integer check_number, Integer payment_type_id, Date creation_date, Date expiration_date){
        this.payment_id = payment_id;
        this.client = client_id;
        this.contract = contract_id;
        this.amount = amount;
        this.total_VAT = total_VAT;
        this.total_Excl_TAX = total_Excl_TAX;
        this.total_amount_paid = total_amount_paid;
        this.credit_card_id = credit_card_id;
        this.bank_transfer_number = bank_transfer_number;
        this.check_number = check_number;
        this.payment_type_id = payment_type_id;
        this.creation_date = creation_date;
        this.expiration_date = expiration_date;
    }

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public DefClient getClient() {
        return client;
    }

    public void setClient(DefClient client) {
        this.client = client;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getTotal_VAT() {
        return total_VAT;
    }

    public void setTotal_VAT(Float total_VAT) {
        this.total_VAT = total_VAT;
    }

    public Float getTotal_Excl_TAX() {
        return total_Excl_TAX;
    }

    public void setTotal_Excl_TAX(Float total_Excl_TAX) {
        this.total_Excl_TAX = total_Excl_TAX;
    }

    public Float getTotal_amount_paid() {
        return total_amount_paid;
    }

    public void setTotal_amount_paid(Float total_amount_paid) {
        this.total_amount_paid = total_amount_paid;
    }

    public Long getCredit_card_id() {
        return credit_card_id;
    }

    public void setCredit_card_id(Long credit_card_id) {
        this.credit_card_id = credit_card_id;
    }

    public Integer getBank_transfer_number() {
        return bank_transfer_number;
    }

    public void setBank_transfer_number(Integer bank_transfer_number) {
        this.bank_transfer_number = bank_transfer_number;
    }

    public Integer getCheck_number() {
        return check_number;
    }

    public void setCheck_number(Integer check_number) {
        this.check_number = check_number;
    }

    public Integer getPayment_type_id() {
        return payment_type_id;
    }

    public void setPayment_type_id(Integer payment_type_id) {
        this.payment_type_id = payment_type_id;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }
}