package org.example.entities;

public class ProductManager implements IProductService {
    private IBankService _bankService;

    public ProductManager(FakeBankServices fakeBankServices) {
        this._bankService = fakeBankServices;
    }
    public ProductManager(HalkBankServiceAdapter halkBankServiceAdapter) {
        this._bankService = halkBankServiceAdapter;
    }

    @Override
    public void sell(Product product, Customer customer) {
        double price = calculateDiscountedPrice(product.getPrice(),customer );
        price = _bankService.convertRate(new CurrencyRate(1,price));
        System.out.println("İndiirim yapılan miktar: " + price);
    }
    private double calculateDiscountedPrice(double originalPrice, Customer customer) {
        if (customer.isStudent()) {
            return originalPrice * 0.90;
        }
        if (customer.isOfficer()) {
            return originalPrice * 0.80;
        }
        return originalPrice;
    }

    public IBankService get_bankService() {
        return _bankService;
    }

    public void set_bankService(IBankService _bankService) {
        this._bankService = _bankService;
    }
}
