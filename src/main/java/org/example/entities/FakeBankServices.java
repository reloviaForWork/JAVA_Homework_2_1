package org.example.entities;

public class FakeBankServices implements IBankService {
    public double convertRate(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 30.60;
    }
}
