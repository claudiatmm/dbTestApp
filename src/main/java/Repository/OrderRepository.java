package Repository;
import main.Database;
import models.Order;
import models.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderRepository {

    Database database;

    public OrderRepository(Database database) {
        this.database = database;
    }

    public void insert(Order order){
        String query = "insert  into orders(orderNumber,orderDate,requiredDate,status,comments,productline) values ('"+order.getOrderNumber()+"', '"+order.getOrderDate()+"', '"+order.getRequiredDate()+"', '"+order.getStatus()+"', '"+order.getComments()+"', '"+order.getProductline()+"')";
        database.executeQuery(query);
    }

    public void deleteByOrderLine(String order){
        String query = "delete from order where productline = '"+order+"'";
        database.executeQuery(query);
    }


    public List<Order> readAllOrders() throws SQLException, ParseException {

        String query = "select * from order";
        List<Order> ordersList = new ArrayList<>();
        ResultSet resultSet = database.selectQuery(query);

        while (resultSet.next()){ //cat timp exista lini citite
            Order order = new Order();
            order.setOrderNumber(Integer.parseInt(resultSet.getString("orderNumber")));
            order.setOrderDate(resultSet.getDate("orderDate"));
            order.setRequiredDate(resultSet.getDate("requiredDate"));
            // varchar e echivalentul lui String - doar ca ii specific cate caractere sa aiba
            order.setStatus(resultSet.getString("status"));
            order.setComments(resultSet.getString("comments"));
            order.setProductline(resultSet.getString("productline").charAt(0));

            ordersList.add(order);
        }

       return ordersList;
    }



}
