import Repository.OrderRepository;
import Repository.ProductRepository;
import main.Database;
import models.Office;
import models.Order;
import models.Product;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestDBconnection {

    // o variabila care nu e statica nu poate fi folosita intr-o metoda statica
    // - ca sa putem folosit aceiasi conexiune in toate testele si sa nu facem mai multe conexiuni
   static Database dataBaseConnection = new Database();

    @Test
    public static void testForProductTable() throws SQLException {
        Product product = new Product(8887, "testAutomation", 4568, "77747");
        ProductRepository productRepository = new ProductRepository(dataBaseConnection);
//        insert in DB
        productRepository.insert(product);

//        delete product
        productRepository.deleteByProductLine("1");

//        return all data from Products
        List<Product> productList = productRepository.readAll();
        System.out.println(productList);
        System.out.println(productRepository.readAll());
    }


    @Test
    public static void testForOrderTable() throws ParseException {
        String date_string = "26-09-2024";
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(date_string);

        Order order = new Order(56, date, date, "aaaa","Action needed" ,'2');

        OrderRepository orderRepository = new OrderRepository(dataBaseConnection);
        orderRepository.insert(order);




    }


}
