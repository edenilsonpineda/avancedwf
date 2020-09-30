package sv.edu.udb.www.model.entity;
// Generated 09-27-2020 09:55:08 PM by Hibernate Tools 4.3.1



/**
 * Proveedores generated by hbm2java
 */
public class Proveedores  implements java.io.Serializable {


     private Integer idProveedores;
     private Servicios servicios;
     private int telefonoProveedor;
     private String proveedorNombre;
     private String personaContacto;
     private RegistroProveedor registroProveedor;

    public Proveedores() {
    }

	
    public Proveedores(Servicios servicios, int telefonoProveedor, String proveedorNombre, String personaContacto) {
        this.servicios = servicios;
        this.telefonoProveedor = telefonoProveedor;
        this.proveedorNombre = proveedorNombre;
        this.personaContacto = personaContacto;
    }
    public Proveedores(Servicios servicios, int telefonoProveedor, String proveedorNombre, String personaContacto, RegistroProveedor registroProveedor) {
       this.servicios = servicios;
       this.telefonoProveedor = telefonoProveedor;
       this.proveedorNombre = proveedorNombre;
       this.personaContacto = personaContacto;
       this.registroProveedor = registroProveedor;
    }
   
    public Integer getIdProveedores() {
        return this.idProveedores;
    }
    
    public void setIdProveedores(Integer idProveedores) {
        this.idProveedores = idProveedores;
    }
    public Servicios getServicios() {
        return this.servicios;
    }
    
    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
    public int getTelefonoProveedor() {
        return this.telefonoProveedor;
    }
    
    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }
    public String getProveedorNombre() {
        return this.proveedorNombre;
    }
    
    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }
    public String getPersonaContacto() {
        return this.personaContacto;
    }
    
    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }
    public RegistroProveedor getRegistroProveedor() {
        return this.registroProveedor;
    }
    
    public void setRegistroProveedor(RegistroProveedor registroProveedor) {
        this.registroProveedor = registroProveedor;
    }




}


