package servlet;

import clase.Salario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Walter Anibal
 */
public class Resultado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejemplo Salario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Resultado at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Salario Empleado = new Salario(0,0);

        if (request.getParameter("SalarioBase") != null) {
            Empleado.setSalarioBase(Float.parseFloat(request.getParameter("SalarioBase")));
        }

        if (request.getParameter("Bonificacion") != null) {
            Empleado.setBonificacion(Float.parseFloat(request.getParameter("Bonificacion")));
        }

      

        // Set response content type
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Ejemplo Servlets";
        String docType
                = "<!doctype html public \"-//w3c//dtd html 4.0 "
                + "transitional//en\">\n";
        out.println(docType
                + "<html>\n"
                + "<head><title>" + title + "</title></head>\n"
                + "<body bgcolor=\"#f0f0f0\">\n"
                + "<h1 align=\"center\">" + title + "</h1>\n"
                + "<ul>\n"
                + "<li><b>Salario base</b>: " + Empleado.getSalarioBase()+ "\n"
                + "<li><b>Bonificacion</b>: " + Empleado.getBonificacion()+ "\n"
                + "<li><b>ISR:</b>: " + Empleado.CalcularISR()+ "\n"
                + "<li><b>IGGS</b>: " + Empleado.CalcularIGSS()+ "\n"
                + "<li><b>Monto a pagarr</b>: " + Empleado.CalcularMonto_Pagar()+ "\n"
                + "</ul>\n"
                + "<table>"
                + "</body></html>");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
