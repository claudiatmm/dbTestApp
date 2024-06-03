package Repository;
import main.Database;
import models.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    Database database;

    public ProductRepository(Database database) {
        this.database = database;
    }

    public void insert(Product product){
        String query = "insert into products (productline, textdescription, productcode, productname) values ('"+product.getProductline()+"', '"+product.getTextdescription()+"', '"+product.getProductcode()+"', '"+product.getProductname()+"')";
        database.executeQuery(query);
    }

    public void deleteByProductLine(String productline){
        String query = "delete from products where productline = '"+productline+"'";
        database.executeQuery(query);
    }

    public List<Product> readAll() throws SQLException {
        String query = "select * from products";
        List<Product> productList = new ArrayList<>();
        ResultSet resultSet = database.selectQuery(query);
        while (resultSet.next()){ //este la fel ca si != null
            Product product = new Product();
            product.setProductline(Integer.valueOf(resultSet.getString("productline")));
            product.setTextdescription(resultSet.getString("textdescription"));
            product.setProductcode(Integer.valueOf(resultSet.getString("productcode")));
            product.setProductname(resultSet.getString("productname"));
            productList.add(product);
        }
       return productList;
    }



}
