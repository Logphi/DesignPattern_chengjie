package com.ttl.designpattern.ch15;

import com.ttl.designpattern.ch15.dao.DaoFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * @ClassName DaoFactoryContext
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/1 12:01
 * Version 1.0
 **/
public class DaoFactoryContext {
    private DaoFactory factory;
    private Properties properties;

    public DaoFactoryContext(String path) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
        properties = new Properties();
        properties.load(inputStream);
        factory = initDaoFactory(properties);
    }

    private static DaoFactory initDaoFactory(Properties properties) {
        DaoFactory factory = null;
        String database = properties.getProperty("database");
        switch (database) {
            case "MySQL":
                factory = new MySQLDaoFactory();
                break;
            case "SQLServer":
                factory = new SqlServerDaoFactory();
                break;
        }
        return factory;
    }

    public DaoFactory getFactory() {
        return factory;
    }
}
