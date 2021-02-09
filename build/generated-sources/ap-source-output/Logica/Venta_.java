package Logica;

import Logica.Producto;
import Logica.TipoPago;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2021-01-26T14:13:12")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fechaCompra;
    public static volatile SingularAttribute<Venta, Double> total;
    public static volatile SingularAttribute<Venta, TipoPago> tipo_pago;
    public static volatile SingularAttribute<Venta, Integer> id;
    public static volatile ListAttribute<Venta, Producto> producto;

}