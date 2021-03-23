<%@include  file="plantillas/documento-Apertura.jsp"%>

<div id="right-panel" class="right-panel">
  
    <!-- Cargo la barra del lado Izquiedo -->
    <jsp:include page="plantillas/barra-Lado.jsp" />

    <!-- Cargo la barra de arriba -->
    <jsp:include page="plantillas/barra-Top.jsp" />

    <div class="login-form"> 
        <form action="ServletsUsuario" method="POST">
            <div class="text-center">
                <h4>Cambiar Foto de Perfil</h4>         
                <p><input id="seleccionArchivos" name="profilePhoto" type="file" accept="images/.png, .jpeg,.jpg, images/"></p>
                <img id="imagenPrevisualizacion">
                <script src="assets/js/script.js"></script>
                <p><input type="submit" class="btn-success" value="Guardar cambios"></p>
            </div>
        </form>
    </div>
    <%@include file="plantillas/documento-Cierre.jsp"%>

