package models;

import java.util.Date;

public class Order {

    private int orderNumber;
    private Date orderDate;
    private Date requiredDate;
    //  status varchar(15)
    private String status;
    private String comments;
    private char productline;



    public Order(){
    }

    public Order(int orderNumber, Date orderDate, Date requiredDate, String  status, String comments, char productline ) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.status = status;
        this.comments = comments;
        this.productline = productline;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public char getProductline() {
        return productline;
    }

    public void setProductline(char productline) {
        this.productline = productline;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", orderDate=" + orderDate +
                ", requiredDate=" + requiredDate +
                ", status=" + status +
                ", comments='" + comments + '\'' +
                ", productline=" + productline +
                '}';
    }
}
