package sv.edu.udb.www.model.entity;
// Generated 09-27-2020 09:55:08 PM by Hibernate Tools 4.3.1



/**
 * GastosAdicionales generated by hbm2java
 */
public class GastosAdicionales  implements java.io.Serializable {


     private Integer idGastosAdicionales;
     private RegistroVehiculo registroVehiculo;
     private String nombreVehiculo;
     private int idInventario;
     private String concepto;
     private long monto;
     private String proveedor;
     private String nombreUsuario;
     private int idRegistroVehiculo;
     private int idUsuario;
     private String comentario;
     private Inventario inventario;
     private Usuario usuario;

    public GastosAdicionales() {
    }

	
    public GastosAdicionales(RegistroVehiculo registroVehiculo, String nombreVehiculo, int idInventario, String concepto, long monto, String proveedor, String nombreUsuario, int idRegistroVehiculo, int idUsuario, String comentario) {
        this.registroVehiculo = registroVehiculo;
        this.nombreVehiculo = nombreVehiculo;
        this.idInventario = idInventario;
        this.concepto = concepto;
        this.monto = monto;
        this.proveedor = proveedor;
        this.nombreUsuario = nombreUsuario;
        this.idRegistroVehiculo = idRegistroVehiculo;
        this.idUsuario = idUsuario;
        this.comentario = comentario;
    }
    public GastosAdicionales(RegistroVehiculo registroVehiculo, String nombreVehiculo, int idInventario, String concepto, long monto, String proveedor, String nombreUsuario, int idRegistroVehiculo, int idUsuario, String comentario, Inventario inventario, Usuario usuario) {
       this.registroVehiculo = registroVehiculo;
       this.nombreVehiculo = nombreVehiculo;
       this.idInventario = idInventario;
       this.concepto = concepto;
       this.monto = monto;
       this.proveedor = proveedor;
       this.nombreUsuario = nombreUsuario;
       this.idRegistroVehiculo = idRegistroVehiculo;
       this.idUsuario = idUsuario;
       this.comentario = comentario;
       this.inventario = inventario;
       this.usuario = usuario;
    }
   
    public Integer getIdGastosAdicionales() {
        return this.idGastosAdicionales;
    }
    
    public void setIdGastosAdicionales(Integer idGastosAdicionales) {
        this.idGastosAdicionales = idGastosAdicionales;
    }
    public RegistroVehiculo getRegistroVehiculo() {
        return this.registroVehiculo;
    }
    
    public void setRegistroVehiculo(RegistroVehiculo registroVehiculo) {
        this.registroVehiculo = registroVehiculo;
    }
    public String getNombreVehiculo() {
        return this.nombreVehiculo;
    }
    
    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }
    public int getIdInventario() {
        return this.idInventario;
    }
    
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }
    public String getConcepto() {
        return this.concepto;
    }
    
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public long getMonto() {
        return this.monto;
    }
    
    public void setMonto(long monto) {
        this.monto = monto;
    }
    public String getProveedor() {
        return this.proveedor;
    }
    
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public int getIdRegistroVehiculo() {
        return this.idRegistroVehiculo;
    }
    
    public void setIdRegistroVehiculo(int idRegistroVehiculo) {
        this.idRegistroVehiculo = idRegistroVehiculo;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Inventario getInventario() {
        return this.inventario;
    }
    
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}


