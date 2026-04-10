import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class CartServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        HttpSession session = request.getSession();
        List<Integer> cart = (List<Integer>) session.getAttribute("cart");

        if (cart == null) {
            cart = new ArrayList<>();
        }

        cart.add(id);
        session.setAttribute("cart", cart);

        response.sendRedirect("cart.jsp");
    }
}