package sv.edu.udb.www.model.entity;
// Generated 09-27-2020 09:55:08 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Recordatorio generated by hbm2java
 */
public class Recordatorio  implements java.io.Serializable {


     private Integer idRecordatorio;
     private RegistroVehiculo registroVehiculo;
     private int idInventario;
     private String nombreVehiculo;
     private String descripcionRecordatorio;
     private Date fechaVencimiento;
     private Date fechaNotificacion;
     private String notificaciones;
     private int idRegistroVehiculo;
     private String nombreUsuario;
     private int idUsuario;

    public Recordatorio() {
    }

    public Recordatorio(RegistroVehiculo registroVehiculo, int idInventario, String nombreVehiculo, String descripcionRecordatorio, Date fechaVencimiento, Date fechaNotificacion, String notificaciones, int idRegistroVehiculo, String nombreUsuario, int idUsuario) {
       this.registroVehiculo = registroVehiculo;
       this.idInventario = idInventario;
       this.nombreVehiculo = nombreVehiculo;
       this.descripcionRecordatorio = descripcionRecordatorio;
       this.fechaVencimiento = fechaVencimiento;
       this.fechaNotificacion = fechaNotificacion;
       this.notificaciones = notificaciones;
       this.idRegistroVehiculo = idRegistroVehiculo;
       this.nombreUsuario = nombreUsuario;
       this.idUsuario = idUsuario;
    }
   
    public Integer getIdRecordatorio() {
        return this.idRecordatorio;
    }
    
    public void setIdRecordatorio(Integer idRecordatorio) {
        this.idRecordatorio = idRecordatorio;
    }
    public RegistroVehiculo getRegistroVehiculo() {
        return this.registroVehiculo;
    }
    
    public void setRegistroVehiculo(RegistroVehiculo registroVehiculo) {
        this.registroVehiculo = registroVehiculo;
    }
    public int getIdInventario() {
        return this.idInventario;
    }
    
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }
    public String getNombreVehiculo() {
        return this.nombreVehiculo;
    }
    
    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }
    public String getDescripcionRecordatorio() {
        return this.descripcionRecordatorio;
    }
    
    public void setDescripcionRecordatorio(String descripcionRecordatorio) {
        this.descripcionRecordatorio = descripcionRecordatorio;
    }
    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }
    
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Date getFechaNotificacion() {
        return this.fechaNotificacion;
    }
    
    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }
    public String getNotificaciones() {
        return this.notificaciones;
    }
    
    public void setNotificaciones(String notificaciones) {
        this.notificaciones = notificaciones;
    }
    public int getIdRegistroVehiculo() {
        return this.idRegistroVehiculo;
    }
    
    public void setIdRegistroVehiculo(int idRegistroVehiculo) {
        this.idRegistroVehiculo = idRegistroVehiculo;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }




}


