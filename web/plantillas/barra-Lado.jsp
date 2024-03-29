<%@include file="../app/config.jsp"%>
<aside id="left-panel" class="left-panel">
    <nav class="navbar navbar-expand-sm navbar-default">
        <div id="main-menu" class="main-menu collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <div>
                    <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                </div>
                <!--Pag Home-->
                <li class="active">
                        <a href="<%=pagHome%>"><i class="menu-icon fa fa-home"></i>Home</a>
                </li>
                <li class="menu-title">Main</li><!-- /.menu-title -->
                <!--Client-->
                <li class="dropdown">
                    <a class="dropdown-toggle" href="<%=pagCrud%>" aria-haspopup="true" aria-expanded="false"><i class="menu-icon fa fa-user"></i>Client</a>
                </li>
                <!--Product-->
                <li class="dropdown">
                    <a class="dropdown-toggle" href="<%=pagCrud%>" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-laptop"></i>Product</a>
                </li>
                <!--to sale-->
                <li class="menu-item-has-children dropdown">
                    <a href="<%=pagSale%>" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-th"></i>To sale</a>
                    <ul class="sub-menu children dropdown-menu">
                        <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">Basic Form</a></li>
                        <li><i class="menu-icon fa fa-th"></i><a href="forms-advanced.html">Advanced Form</a></li>
                    </ul>
                </li>

                <!--Buy-->
                <li class="menu-item-has-children dropdown">
                    <a href="<%=pagBuy%>" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-th"></i>buy</a>
                    <ul class="sub-menu children dropdown-menu">
                        <li><i class="menu-icon fa fa-th"></i><a href="forms-basic.html">Basic Form</a></li>
                        <li><i class="menu-icon fa fa-th"></i><a href="forms-advanced.html">Advanced Form</a></li>
                    </ul>
                </li>
                <!--Extras-->
                <li class="menu-title">Extras</li><!-- /.menu-title -->
                
                <!--Caja-->
                <li class="menu-item-has-children dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> <i class="menu-icon fa fa-tasks"></i>Box</a>
                    <ul class="sub-menu children dropdown-menu">
                        <li><i class="menu-icon fa fa-fort-awesome"></i><a href="font-fontawesome.html">Font Awesome</a></li>
                        <li><i class="menu-icon ti-themify-logo"></i><a href="font-themify.html">Themefy Icons</a></li>
                    </ul>
                </li>                
            </ul>
        </div><!-- /.navbar-collapse -->
    </nav>
</aside>