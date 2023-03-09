package productStore.product.wheatProduct;

import productStore.product.Product;

import java.time.LocalDate;

public class WeatProduct extends Product {
    public WeatProduct(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
