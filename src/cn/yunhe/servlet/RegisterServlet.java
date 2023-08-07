package cn.yunhe.servlet;

import cn.yunhe.dao.RegisterDao;
import cn.yunhe.dao.impl.RegisterDaoImpl;
import cn.yunhe.service.RegisterService;
import cn.yunhe.service.impl.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/r1")
public class RegisterServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobbies");
        RegisterService service= new RegisterServiceImpl();
        int i = service.insert(username, password, Arrays.toString(hobbies));
        if (i>0){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
    }
}
