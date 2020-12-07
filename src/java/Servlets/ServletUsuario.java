package Servlets;

import Logica.Ferreteria;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        /*  Codigo  */
        
        boolean permiso = false;
        Ferreteria ferre = new Ferreteria();
        
        permiso = ferre.verficacionAcceso(request.getParameter("usuario"),request.getParameter("password"));

        if (permiso) {
            HttpSession sesionActual = request.getSession(true);
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            sesionActual.setAttribute("usuario", usuario);
            sesionActual.setAttribute("ferre", ferre);
            response.sendRedirect("Bienvenidos.jsp");
        }else{
            response.sendRedirect("error-Login.jsp");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
