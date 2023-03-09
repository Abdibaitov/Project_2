import productStore.MyException;
import productStore.RealizeService;
import productStore.product.Product;
import productStore.product.meatProduct.Fish;
import productStore.product.meatProduct.LambMeat;
import productStore.product.meatProduct.Sausage;
import productStore.product.milkProduct.Kefir;
import productStore.product.milkProduct.Milk;
import productStore.product.milkProduct.Yogurt;
import productStore.product.wheatProduct.Bread;
import productStore.product.wheatProduct.Flour;
import productStore.product.wheatProduct.Pasta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RealizeService realizeService = new RealizeService();
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        products.add(new Fish(1, "fi", "TOIBOSS", LocalDate.of(2023, 3, 10)));
        products.add(new Fish(3, "fish", "TOIBOSS", LocalDate.of(2023, 4, 13)));


        products.add(new LambMeat(1, "mest", "TOIBOSS", LocalDate.of(2023, 4, 12)));
        products.add(new LambMeat(2, "mest", "TOIBOS", LocalDate.of(2023, 1, 1)));


        products.add(new Sausage(1, "sausae", "TOIBOS", LocalDate.of(2023, 3, 13)));
        products.add(new Sausage(2, "sauage", "TOIOSS", LocalDate.of(2023, 4, 13)));

        products.add(new Kefir(4, "Kefir", "MILKA", LocalDate.of(2023, 3, 23)));
        products.add(new Kefir(4, "Kefir", "MILKa", LocalDate.of(2023, 4, 17)));

        products.add(new Milk(5, "Milk", "MILA", LocalDate.of(2023, 3, 26)));
        products.add(new Milk(5, "Milk", "MILKA", LocalDate.of(2022, 4, 9)));

        products.add(new Yogurt(6, "Yogurt", "MILKA", LocalDate.of(2023, 2, 4)));
        products.add(new Yogurt(6, "Yogurt", "MILKA", LocalDate.of(2023, 3, 11)));

        products.add(new Bread(7, "Bread", "NUR", LocalDate.of(2023, 3, 27)));
        products.add(new Bread(7, "Bread", "NUR", LocalDate.of(2023, 4, 20)));

        products.add(new Flour(8, "Flour", "NUR", LocalDate.of(2023, 4, 18)));
        products.add(new Flour(8, "Flour", "NUR", LocalDate.of(2022, 4, 3)));

        products.add(new Pasta(9, "Pasta", "NUR", LocalDate.of(2023, 4, 16)));
        products.add(new Pasta(9, "Pasta", "NUR", LocalDate.of(2023, 3, 5)));

        realizeService.addProduct(products);
        realizeService.uppDateProducts(products);

        try {
            realizeService.checkToManager(products);
        } catch (MyException e){
            System.out.println(e.getMessage());
        }


    }
}