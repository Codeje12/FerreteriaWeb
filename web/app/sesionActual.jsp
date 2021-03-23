<%@page import="Logica.Ferreteria"%>
<%//Creo la variable sesionActual y le asigno la sesion actual
    HttpSession sesionActual = request.getSession();
    //aca consulto si existe un usuario en la sesion actual para guardar en la variable
    String user = (String) request.getSession().getAttribute("usuario");
    //redirecciono a la pagina de error si no inicio sesion o le doy los permisos
    if (user == null) {
        response.sendRedirect("error-Login.jsp");
    } else {
        Ferreteria ctr = new Ferreteria();
        sesionActual.setAttribute("ctr", ctr);
        
    }
    %>