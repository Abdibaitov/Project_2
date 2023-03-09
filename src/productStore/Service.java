package productStore;

import productStore.product.Product;

import java.util.ArrayList;
import java.util.List;

public interface Service {


    void addProduct(List <Product> products);
    void uppDateProducts(List <Product>list1);
    void checkToManager(List <Product> products);

}
