import Repository.ProductRepository;
import main.Database;
import models.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestDBconnection {

    public static void main(String[] args) throws SQLException {
        Product product = new Product(123456, "testAutomation", 4568, "77747");
        Database dataBaseConnection = new Database();

        ProductRepository productRepository = new ProductRepository(dataBaseConnection);
//        insert in DB
//        productRepository.insert(product);

//        delete product
//        productRepository.deleteByProductLine("1");

//        return all data from Products
        List<Product> productList = productRepository.readAll();
        System.out.println(productList);
//        System.out.println(productRepository.readAll());





//        Random random = new Random();
//        int n = random.nextInt(90);
//        String value = String.valueOf(n);

//        Database dataBaseConnection = new Database();
//        dataBaseConnection.insertInDb();
//        dataBaseConnection.getInsertedQuery("8");



        //Tema :
//        - sa fac 2/3 tabele si sa fac query-uri pe ele
    }




}
