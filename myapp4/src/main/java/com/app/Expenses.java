package com.app;

import jakarta.json.bind.annotation.JsonbCreator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Expenses {

    enum PaymentMethod{
        CASH,CREDIT_CARD,DEBIT_CARD;
    }
    private String name;
    private BigDecimal amount;
    private LocalDateTime creationDate;
    private PaymentMethod paymentmethod;
    private UUID uuid;

    public Expenses(String name, BigDecimal amount, LocalDateTime creationDate, PaymentMethod paymentmethod, UUID uuid) {
        this.name = name;
        this.amount = amount;
        this.creationDate = creationDate;
        this.paymentmethod = paymentmethod;
        this.uuid = uuid;
    }

    public Expenses(String name, BigDecimal amount, PaymentMethod paymentmethod) {
        this.name = name;
        this.amount = amount;
        this.creationDate = LocalDateTime.now();
        this.paymentmethod = paymentmethod;
        this.uuid = UUID.randomUUID();
    }

    @JsonbCreator
    public static Expenses of(String name, BigDecimal amount, PaymentMethod paymentmethod) {
        return new Expenses(name, amount, paymentmethod);
    }

    public String getName()
    {
        return name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public PaymentMethod getPaymentmethod() {
        return paymentmethod;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setPaymentmethod(PaymentMethod paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
