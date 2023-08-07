package cn.yunhe.dao.impl;

import cn.yunhe.dao.UserDao;
import cn.yunhe.entity.User;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    static DataSource dataSource = null;
    static {
        Properties pro = new Properties();
        InputStream fis = UserDaoImpl.class.getClassLoader().getResourceAsStream("durid.properties");
        try {
            pro.load(fis);
            dataSource = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*创建可执行对象并关联连接池*/
   QueryRunner qr= new QueryRunner(dataSource);
    @Override
    public User findUserByUserNameAndPwd(String username, String password) {
       String sql = "select * from user where username=? and password=?";
        try {
            return qr.query(sql,new BeanHandler<User>(User.class),username,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
