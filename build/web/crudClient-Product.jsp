<%@include file="../app/sesionActual.jsp"%>

<%@include file="plantillas/documento-Apertura.jsp"%>

<div id="right-panel" class="fondoInicio right-panel">
    
    <jsp:include page="plantillas/barra-Lado.jsp" /><!-- Cargo la barra del lado Izquiedo -->

    <jsp:include page="plantillas/barra-Top.jsp" /><!-- Cargo la barra de arriba -->
    
    <jsp:include page="plantillas/TableData.jsp" />
    <div class="container-fluid">

        <div class="row-md-3" >
            <!--Las filas que sobran-->
        </div>

        <div class="row-md-3 text-center">
            <!--Contenido-->
        </div>

        <div class="row-md-3">
            <!--Las filas que sobran-->
        </div>
    </div>

<%@include file="plantillas/documento-Cierre.jsp"%>