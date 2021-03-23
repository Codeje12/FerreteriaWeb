<%
    /*SERVIDOR*/
    String servidor = "http://localhost:8080/Ferreteria/";
    String pagHome = servidor + "inicio.jsp";

    /*Paginas Clientes*/
    String pagClient = servidor + "clientHome.jsp";
    String pagListClient = servidor + "listClient.jsp";
    String pagAddClient = servidor + "addClient.jsp";
    String pagDeletClient = servidor +  "deletClient.jsp";

    /*paginas de Negocio*/
    String pagSale = servidor + "saleHome.jsp";
    String pagBuy = servidor + "buyHome.jsp";

    /*Paginas Producto*/
    String pagProduct = "productHome.jsp";
    String pagAddProduct = "addProduct.jsp";
    String pagDeletProduct = "deletProduct.jsp";
    String pagListProduct = "listProduct.jsp";

    /*Pagina Ususarios*/
    String pagUser = "usuarios.jsp";
    String profileUser = "ProfileUser.jsp";
%>