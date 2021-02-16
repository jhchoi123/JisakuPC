package db.dao.product;

import bean.Product;
import db.dao.DAOException;

import java.util.List;

public interface ProductDao {
    void addProduct(Product product) throws DAOException;

    void deleteProduct(String pid) throws DAOException;

    void updateProduct(Product product) throws DAOException;

    Product getProduct(String pid) throws DAOException;

    List<Product> getProductsByType(String type) throws DAOException;

    List<Product> getAllProducts() throws DAOException;

    List<Product> getSearchProducts(String moji) throws DAOException;

    List<Product> getASCSearchProducts(String moji) throws DAOException;

    List<Product> getDESCSearchProducts(String moji) throws DAOException;

    List<Product> getPartsSearchProducts(String moji) throws DAOException;

    List<Product> getAddBuildProducts(String name, String spec, String brand, String type) throws DAOException;
}
