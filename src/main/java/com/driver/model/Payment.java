package com.driver.model;

import com.driver.Enums.PaymentMode;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    private int id;

    private boolean paymentCompleted;

    @Enumerated(value = EnumType.STRING)
    PaymentMode paymentMode;



    public Payment() {
    }

    public Payment(int id, boolean paymentCompleted, PaymentMode paymentMode) {
        this.id = id;
        this.paymentCompleted = paymentCompleted;
        this.paymentMode = paymentMode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPaymentCompleted() {
        return paymentCompleted;
    }

    public void setPaymentCompleted(boolean paymentCompleted) {
        this.paymentCompleted = paymentCompleted;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}