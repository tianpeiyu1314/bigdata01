package cn.yunhe.servlet;

import cn.yunhe.entity.User;
import cn.yunhe.service.UserService;
import cn.yunhe.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/m1")
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接受请求数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //2.调用业务
        User user = userService.login(username,password);
        //3.根据结果做出判断
        if(user==null){
            System.out.println("用户名或密码错误");
        }else {
            System.out.println("登录成功");
        }
    }
}
