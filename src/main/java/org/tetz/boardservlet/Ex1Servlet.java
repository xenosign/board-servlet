package org.tetz.boardservlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ex1")
public class Ex1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Request 스코프
        request.setAttribute("msg1", "안녕하세요.");
        
        // Session 스코프
        HttpSession session = request.getSession();
        session.setAttribute("msg2", "오늘은 하늘이 맑았다");
        
        // Application 스코프
        ServletContext context = getServletContext();
        context.setAttribute("msg3", "럭키비키");

        // ex1.jsp 파일로 이동
        request.getRequestDispatcher("ex1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}