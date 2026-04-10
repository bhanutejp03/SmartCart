import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ProductServlet extends HttpServlet {

    // Dummy product list (instead of JS array)
    static List<Map<String, Object>> products = new ArrayList<>();

    public void init() {
        // Sample data
        Map<String, Object> p1 = new HashMap<>();
        p1.put("id", 1);
        p1.put("name", "Laptop");
        p1.put("price", 50000);
        p1.put("category", "Electronics");
        products.add(p1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("products", products);
        RequestDispatcher rd = request.getRequestDispatcher("products.jsp");
        rd.forward(request, response);
    }
}