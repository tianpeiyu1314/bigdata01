package cn.yunhe.dao;

import cn.yunhe.entity.User;

public interface UserDao {
    User findUserByUserNameAndPwd(String username,String password);
}
