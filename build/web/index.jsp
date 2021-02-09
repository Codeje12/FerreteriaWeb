<%@page import="java.util.List"%>
<%@page import="Logica.Usuario"%>
<%@page import="Logica.Ferreteria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Iniciar sesion</title>
        
        <link href="login/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
        <link href="login/font-awesome/css/font-awesome.css" rel="stylesheet" />
        <link href="login/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
        <link href="login/css/style.css" rel="stylesheet" />
        <link href="login/css/main-style.css" rel="stylesheet" />
    </head>
    
    <body class="fondo width:100%">
        <div class="container">

            <div class="row">
                <div class="col-md-4 col-md-offset-4 text-center logo-margin ">
                </div>
                <div class="col-md-4 col-md-offset-4">
                    <div class="login-panel panel panel-default">                  
                        <div class="panel-heading">
                            <h3 class="panel-title text-center">cuenta</h3>
                        </div>
                        <div class="panel-body">


                            <form action="ServletLogin" role="form" class="login-form" method="POST">
                                <p class="title-login text-center">Iniciar Sesión</p>
                                <p>
                                    <select class="select-login text-center" name="usuario" >
                                        <% Ferreteria ferre = new Ferreteria();
                                        List<Usuario> listaUsuario = ferre.traerUsuario();
                                        for(Usuario usu :listaUsuario) { %> 
                                        
                                        <option value="<%=usu.getTipoUsuario()%>"><%=usu.getTipoUsuario()%></option>
                                        <% } %>
                                    </select>
                                </p>    
                                <p><input name="password" class="input-password text-center" type="password" placeholder="Password"/></p>
                                <p><input type="submit" class="btn-ingreso" value="Ingresar"></p>
                            </form>


                            <div class="text-center">
                                <h5><a href="recuperar-Password.jsp">¿Olvidaste tu contraseña?</a></h5>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="assets/plugins/jquery-1.10.2.js"></script>
        <script src="assets/plugins/bootstrap/bootstrap.min.js"></script>
        <script src="assets/plugins/metisMenu/jquery.metisMenu.js"></script>

    </body>
    
</html>
