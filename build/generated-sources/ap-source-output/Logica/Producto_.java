package Logica;

import Logica.Iva;
import Logica.Marca;
import Logica.Proveedor;
import Logica.Rubro;
import Logica.UMedida;
import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2021-01-26T14:13:11")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Date> fechaIngreso;
    public static volatile SingularAttribute<Producto, Marca> marca;
    public static volatile SingularAttribute<Producto, Rubro> rubro;
    public static volatile SingularAttribute<Producto, UMedida> uMedida;
    public static volatile SingularAttribute<Producto, Iva> iva;
    public static volatile SingularAttribute<Producto, Proveedor> proveedor;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, Integer> stock;
    public static volatile SingularAttribute<Producto, Double> precioVenta;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, Double> precioCosto;

}