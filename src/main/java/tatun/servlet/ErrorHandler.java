package tatun.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ErrorHandler", urlPatterns = "/errorHandler")
public class ErrorHandler extends Servlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try (PrintWriter out = response.getWriter()) {
            print(out, "Page not found!");
        }
    }
}
