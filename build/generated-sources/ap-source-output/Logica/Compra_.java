package Logica;

import Logica.Producto;
import Logica.Proveedor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2021-01-26T14:13:11")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fechaCompra;
    public static volatile SingularAttribute<Compra, Proveedor> proveedor;
    public static volatile SingularAttribute<Compra, Integer> id;
    public static volatile SingularAttribute<Compra, Double> totalPagar;
    public static volatile ListAttribute<Compra, Producto> productos;

}