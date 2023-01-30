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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
    
    //Display the message for user to input valid age
    private void displayInvalidEntry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
                // set an attribute for a message
            request.setAttribute("message", "You must give your current age.");
            
            // forward the request and response objects to the JSP
            // display the form again
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        String age = request.getParameter("age");
        
        //check if null or empty string
        if (age == null || age.equals("")) {
            displayInvalidEntry(request, response);
            return;
        }
        try {
            int ageInt = Integer.parseInt(age);
            //can't have negative age
            if (ageInt >= 0){
                request.setAttribute("message", "Your age next birthday will be " + ++ageInt);
            }else{
                displayInvalidEntry(request, response);
                return;
            }
        //catch if user input is not an int
        } catch(NumberFormatException e) {
            displayInvalidEntry(request, response);
            return;
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
