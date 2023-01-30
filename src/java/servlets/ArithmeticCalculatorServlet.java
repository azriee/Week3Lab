package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author azriee
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String operation[] = request.getParameterValues("operation");
        String first = request.getParameter("first");
        String second = request.getParameter("second");

        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        try {
            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);
            
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            
            switch (operation[0]) {
                case "+":
                    request.setAttribute("message", firstInt + secondInt);
                    break;
                case "-":
                    request.setAttribute("message", firstInt - secondInt);
                    break;
                case "*":
                    request.setAttribute("message", firstInt * secondInt);
                    break;
                case "%":
                    request.setAttribute("message", firstInt % secondInt);
                    break;
            }
        } catch (NumberFormatException e) {
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
