package sv.edu.udb.www.model.entity;
// Generated 09-27-2020 09:55:08 PM by Hibernate Tools 4.3.1



/**
 * Catalogo generated by hbm2java
 */
public class Catalogo  implements java.io.Serializable {


     private Integer idCatalogo;
     private String tipoMantenimiento;
     private String descripcion;
     private Servicios servicios;

    public Catalogo() {
    }

	
    public Catalogo(String tipoMantenimiento, String descripcion) {
        this.tipoMantenimiento = tipoMantenimiento;
        this.descripcion = descripcion;
    }
    public Catalogo(String tipoMantenimiento, String descripcion, Servicios servicios) {
       this.tipoMantenimiento = tipoMantenimiento;
       this.descripcion = descripcion;
       this.servicios = servicios;
    }
   
    public Integer getIdCatalogo() {
        return this.idCatalogo;
    }
    
    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    public String getTipoMantenimiento() {
        return this.tipoMantenimiento;
    }
    
    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Servicios getServicios() {
        return this.servicios;
    }
    
    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }




}


