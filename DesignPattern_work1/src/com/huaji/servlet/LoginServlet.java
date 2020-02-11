package com.huaji.servlet;

import com.huaji.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=request.getParameter("uname");
        String pwd=request.getParameter("upwd");

        User user=new User(name,pwd);
        if (user.getName()=="pwf"&&user.getPwd()=="123456"){
           request.getRequestDispatcher("successful.jsp").forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}
