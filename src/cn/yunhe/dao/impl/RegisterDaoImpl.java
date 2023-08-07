package cn.yunhe.dao.impl;

import cn.yunhe.dao.RegisterDao;
import cn.yunhe.utils.DatasourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

public class RegisterDaoImpl implements RegisterDao {
   static QueryRunner qr = new QueryRunner(DatasourceUtils.getDataSource());
    @Override
    public int InsertNewUser(String username, String password, String hobbies) {
        String sql = "insert into register values (?,?,?)";
        try {
           return qr.update(sql,username,password,hobbies);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
    }
}
