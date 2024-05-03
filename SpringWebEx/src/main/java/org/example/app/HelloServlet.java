package org.example.app;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        System.out.println("Inside the Service..");
        httpServletResponse.setContentType("text/html");
        PrintWriter out = httpServletResponse.getWriter();
        out.println("Hello World..");
//        out.println("<h2><b>Hello World..</b></h2>");
    }
}