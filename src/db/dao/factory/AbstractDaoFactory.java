package db.dao.factory;

import db.dao.DAOException;
import db.dao.product.ProductDao;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.ResourceBundle;

public abstract class AbstractDaoFactory {
    public static AbstractDaoFactory getFactory() throws DAOException {
        AbstractDaoFactory factory = null;

        try {
            ResourceBundle bundle = ResourceBundle.getBundle("resources.dao");
            String dao = bundle.getString("dao");
            Class<?> cls = Class.forName(dao);
            Method method = cls.getMethod("getInstance");

            factory = (AbstractDaoFactory)method.invoke(null, null);
        } catch (Exception e) {
            throw new DAOException(e.getMessage(), e);
        }

        return factory;
    }

    public abstract ProductDao getProductsDao();
}
