package Servlets;

import Logica.Ferreteria;
import Logica.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletsUsuario", urlPatterns = {"/ServletsUsuario"})
public class ServletsUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String fotoPerfil = request.getParameter("profilePhoto");
        String user = (String) request.getSession().getAttribute("usuario");
        Ferreteria ctr = new Ferreteria();

        if (fotoPerfil == "" || fotoPerfil == null || fotoPerfil == "") {
            response.sendRedirect("inicio.jsp");
        } else {
            ctr.getsavePhoto(user, fotoPerfil);
            response.sendRedirect("inicio.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
