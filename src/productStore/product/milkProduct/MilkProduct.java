package productStore.product.milkProduct;

import productStore.product.Product;

import java.time.LocalDate;

public class MilkProduct extends Product {

    public MilkProduct(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
