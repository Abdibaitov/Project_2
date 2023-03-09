package productStore;

import productStore.manager.Manager;
import productStore.product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class RealizeService implements Service {

    private final List<Product> list = new ArrayList<>();
    private final List<Product> list1 = new ArrayList<>();
    Manager manager = new Manager();


    @Override
    public void addProduct(List<Product> products) {
        System.out.println("ACCEPTED GOODS : ");
        products.stream().filter(r -> r.getCompanyName().equals("TOIBOSS")
                        || r.getCompanyName().equals("MILKA")
                        || r.getCompanyName().equals("NUR"))
                .filter(s -> s.getDate().minusMonths(1)

                        .isAfter(LocalDate.now())).forEach(System.out::println);

        list.addAll(products);

    }

    @Override
    public void uppDateProducts(List<Product> list1) {
        List<Product> productsl = list1.stream().filter(y -> y.getDate().isBefore(LocalDate.now())).toList();
        System.out.println("EXPIRED PRODUCTS ");
        productsl.forEach(System.out::println);
        list1.removeIf(p -> p.getDate().isBefore(LocalDate.now()));
        List<Product> productsList = list1.stream().filter(x -> x.getCompanyName().equals("TOIBOSS")
                        || x.getCompanyName().equals("NUR") || x.getCompanyName().equals("MILKA"))
                .filter(c -> !c.getDate().isAfter(LocalDate.now().plusDays(7))).toList();
        System.out.println("DISCOUNT");
        productsList.forEach(System.out::println);
    }

    @Override
    public void checkToManager(List<Product> products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выведите логин пороль :");
        String login = scanner.nextLine();
        System.out.println("Напишите пароль: ");
        String password = scanner.nextLine();
        if (login.equals(manager.getLogin()) && password.equals(manager.getPassword())) {
            System.out.println("Welcome : " + login);
            addProduct(products);
            uppDateProducts(products);

        } else {
            System.out.println("Wrong login and password");
        }
    }
}

//    List<Product> products1 = products.stream().filter(x -> x.equals("TOYBOSS" ) || x.equals("NUR")|| x.equals("MILKA"))
//            .filter(e ->e.getDate().plusMonths(1).isAfter(LocalDate.now())).forEach(System.out::println);
