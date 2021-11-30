package com.AndroidHttpsClientJava.request;

import androidx.annotation.NonNull;

public class DebtPaymentRequest extends Request {

    private int SiteId;
    private String NameSurname;
    private String CardNumber;
    private String year;
    private String month;
    private String cvv;
    private int price;
    private int totalPrice;


    @NonNull
    @Override
    public String toString() {
        return "DeptPaymentRequest{" +
                "SiteId=" + SiteId +
                ", NameSurname='" + NameSurname + '\'' +
                ", cardNumber='" + CardNumber + '\'' +
                ", year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", cvc='" + cvv + '\'' +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }




    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getSiteId() {
        return SiteId;
    }

    public void setSiteId(int siteId) {
        SiteId = siteId;
    }

    public String getNameSurname() {
        return NameSurname;
    }

    public void setNameSurname(String nameSurname) {
        NameSurname = nameSurname;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.CardNumber = cardNumber;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

