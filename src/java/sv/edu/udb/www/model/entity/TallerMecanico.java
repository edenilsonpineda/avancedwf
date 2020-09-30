package sv.edu.udb.www.model.entity;
// Generated 09-27-2020 09:55:08 PM by Hibernate Tools 4.3.1



/**
 * TallerMecanico generated by hbm2java
 */
public class TallerMecanico  implements java.io.Serializable {


     private Integer idTallerMecanico;
     private Inventario inventario;
     private String nombreTaller;
     private String combustibleTallerMecanico;
     private String mantenimientoTallerMecanico;
     private int idInventario;
     private String adicionales;

    public TallerMecanico() {
    }

    public TallerMecanico(Inventario inventario, String nombreTaller, String combustibleTallerMecanico, String mantenimientoTallerMecanico, int idInventario, String adicionales) {
       this.inventario = inventario;
       this.nombreTaller = nombreTaller;
       this.combustibleTallerMecanico = combustibleTallerMecanico;
       this.mantenimientoTallerMecanico = mantenimientoTallerMecanico;
       this.idInventario = idInventario;
       this.adicionales = adicionales;
    }
   
    public Integer getIdTallerMecanico() {
        return this.idTallerMecanico;
    }
    
    public void setIdTallerMecanico(Integer idTallerMecanico) {
        this.idTallerMecanico = idTallerMecanico;
    }
    public Inventario getInventario() {
        return this.inventario;
    }
    
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    public String getNombreTaller() {
        return this.nombreTaller;
    }
    
    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }
    public String getCombustibleTallerMecanico() {
        return this.combustibleTallerMecanico;
    }
    
    public void setCombustibleTallerMecanico(String combustibleTallerMecanico) {
        this.combustibleTallerMecanico = combustibleTallerMecanico;
    }
    public String getMantenimientoTallerMecanico() {
        return this.mantenimientoTallerMecanico;
    }
    
    public void setMantenimientoTallerMecanico(String mantenimientoTallerMecanico) {
        this.mantenimientoTallerMecanico = mantenimientoTallerMecanico;
    }
    public int getIdInventario() {
        return this.idInventario;
    }
    
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }
    public String getAdicionales() {
        return this.adicionales;
    }
    
    public void setAdicionales(String adicionales) {
        this.adicionales = adicionales;
    }




}


