package resources.csv;

import java.io.Serializable;

public class CsvProduct implements Serializable {
    private String productName;
    private String spec;
    private String brand;
    private int price;

    public CsvProduct() {
    }

    public CsvProduct(String productName, String spec, String brand) {
        this.productName = productName;
        this.spec = spec;
        this.brand = brand;
    }

    public CsvProduct(String productName, String spec, String brand, int price) {
        this.productName = productName;
        this.spec = spec;
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
