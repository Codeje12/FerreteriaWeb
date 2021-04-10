<%@page import="Logica.Producto"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Cliente"%>
<%@page import="Logica.Ferreteria"%>
<% String pag = request.getRequestURI();%>
<div class="breadcrumbs">
    <div class="breadcrumbs-inner">
        <div class="row m-0">
            <div class="col-sm-4">
                <div class="page-header float-left">
                    <div class="page-title">
                        <h1>Cliente</h1>
                    </div>
                </div>
            </div>
            <div class="col-sm-8">
                <div class="page-header float-right">
                    <div class="page-title">
                        <ol class="breadcrumb text-right">
                            <li>Client</li>
                            <li>Table</li>
                            <li class="active">Data table</li>
                        </ol>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="content">
    <div class="animated fadeIn">
        <div class="row">

            <div class="col-md-12">
                <div class="card">
                    <div class="card-header">
                        <strong class="card-title">Data Table</strong>
                    </div>
                    <div class="card-body">
                        <table id="bootstrap-data-table" class="table table-striped table-bordered">

                            <thead>
                                
                                    <%
                                        Ferreteria ctr = new Ferreteria();
                                        List<Cliente> listaCliente = ctr.traerClientes();
                                        List<Producto> listaProducto = ctr.traerProductos();
                                        String pag = "cliente";
                                        
                                        if(pag.equals("cliente")){%>
                                        <tr>
                                            <th>Nombre</th>
                                            <th>Apellido</th>
                                            <th>Dni</th>
                                            <th>Fecha Nac.</th>
                                        </tr>
                                      <%}else if(pag.equals("producto")){%> 
                                        <tr>
                                            <th>Nombre Producto</th>
                                            <th>Descripcion</th>
                                            <th>Costo</th>
                                            <th>Venta</th>
                                            <th>Fec. Ingreso</th>
                                            <th>Stock</th>
                                            <th>Rubro</th>
                                            <th>Marca</th>
                                         </tr>
                                        <%}%>
                                
                            </thead>

                            <tbody>
                                    <%   
                                    if(listaCliente != null) {
                                        if(pag.equals("cliente")){
                                            for (Cliente cliente : listaCliente) {%>
                                            <tr>
                                                <td><%=cliente.getNombre()%></td>
                                                <td><%=cliente.getApellido()%></td>
                                                <td><%=cliente.getDni()%></td>
                                                <td><%=cliente.getFecha()%></td>
                                            </tr>
                                          <%}
                                        }else if(pag.equals("producto")){
                                            for (Producto producto : listaProducto) {%>
                                            <tr>
                                                <td><%=producto.getNombreProducto() %></td>
                                                <td><%=producto.getDescripcion() %></td>
                                                <td><%=producto.getPrecioCosto() %></td>
                                                <td><%=producto.getPrecioVenta()%></td>
                                                <td><%=producto.getFechaIngreso()%></td>
                                                <td><%=producto.getStock()%></td>
                                                <td><%=producto.getRubro()%></td>
                                                <td><%=producto.getMarca()%></td>
                                            </tr>
                                          <%}     
                                        }
                                    }else {
                                        for (int i =0; i<4;i++){ %>
                                            <td>No hay datos</td>
                                        <%}
                                    }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div><!-- .animated -->
</div><!-- .content -->


<div class="clearfix"></div>
