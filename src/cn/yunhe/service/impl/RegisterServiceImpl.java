package cn.yunhe.service.impl;

import cn.yunhe.dao.RegisterDao;
import cn.yunhe.dao.impl.RegisterDaoImpl;
import cn.yunhe.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {
    @Override
    public int insert(String username, String password, String hobbies) {
        RegisterDao registerDao = new RegisterDaoImpl();
        return registerDao.InsertNewUser(username,password,hobbies);
    }
}
