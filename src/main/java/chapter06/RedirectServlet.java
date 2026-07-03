package chapter06;

import java.io.IOException;
import jakarta.servlet.ServletException;    
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
        HttpServletResponse response) 
        throws ServletException,IOException{
            response.sendRedirect("UranaiServlet");
    }
    
}
