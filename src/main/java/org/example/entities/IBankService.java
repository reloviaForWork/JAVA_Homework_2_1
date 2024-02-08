package org.example.entities;

public interface IBankService {
    default double convertRate(CurrencyRate currencyRate) {
        return 0;
    }
}
