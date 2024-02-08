package org.example.entities;

public class CurrencyRate {
    private int Currency;
    private double Price;

    public CurrencyRate() {

    }
    public CurrencyRate(int currency, double price) {
        Currency = currency;
        Price = price;
    }

    public int getCurrency() {
        return Currency;
    }

    public void setCurrency(int currency) {
        Currency = currency;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
