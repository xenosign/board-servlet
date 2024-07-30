package org.tetz.boardservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/setCookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 쿠키 생성
        Cookie userCookie = new Cookie("username", "tetz");
        userCookie.setMaxAge(7);
        response.addCookie(userCookie);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>쿠키가 생성 되었습니다!</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}