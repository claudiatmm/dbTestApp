package models;

public class Product {

    private Integer productline;
    private String textdescription;
    private Integer productcode;
    private String productname;


    public Product() {
    }

    public Product(Integer productline, String textdescription, Integer productcode, String productname) {
        this.productline = productline;
        this.textdescription = textdescription;
        this.productcode = productcode;
        this.productname = productname;
    }

    public Integer getProductline() {
        return productline;
    }

    public void setProductline(Integer productline) {
        this.productline = productline;
    }

    public String getTextdescription() {
        return textdescription;
    }

    public void setTextdescription(String textdescription) {
        this.textdescription = textdescription;
    }

    public Integer getProductcode() {
        return productcode;
    }

    public void setProductcode(Integer productcode) {
        this.productcode = productcode;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productline=" + productline +
                ", textdescription='" + textdescription + '\'' +
                ", productcode=" + productcode +
                ", productname='" + productname + '\'' +
                '}';
    }
}
