package tatun.servlet;

import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;
import java.util.HashMap;

public class Servlet extends HttpServlet {

    public void print(PrintWriter printWriter, String name) {
        printWriter.println("<!DOCTYPE html>");
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>" + name + "</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1>" + name + "</h1>");

        printWriter.println("<ul>\n" +
                "\t<li><a href=\"/enterprice/main\">Main</a></li>\n" +
                "\t<li><a href=\"/enterprice/catalog\">Catalog</a></li>\n" +
                "\t<li><a href=\"/enterprice/product\">Product</a></li>\n" +
                "\t<li><a href=\"/enterprice/cart\">Cart</a></li>\n" +
                "\t<li><a href=\"/enterprice/order\">Order</a></li>\n" +
                "</ul>");

        printWriter.println("</body>");
        printWriter.println("</html>");
    }
}
