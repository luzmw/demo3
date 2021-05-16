package com.example.demo3;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        AlumnaDAO
        Alumna akumna = new Alumna("juli", "front");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Alumna:" + akumna.getNombre() + "</h1>");
        out.println("<h2> Curso:" + akumna.getCurso() + "</h2>");

        out.println("</body></html>");
    }

    public void destroy() {
    }
}