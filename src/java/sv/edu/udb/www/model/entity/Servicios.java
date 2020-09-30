package sv.edu.udb.www.model.entity;
// Generated 09-27-2020 09:55:08 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Servicios generated by hbm2java
 */
public class Servicios  implements java.io.Serializable {


     private Integer idServicios;
     private Catalogo catalogo;
     private Date fehaInicio;
     private Date horaInicio;
     private Date fechaTerminacion;
     private Date horaTerminacion;
     private String nombreVehiculo;
     private int horometro;
     private String servicio;
     private long costoReferencias;
     private long costoManoObra;
     private long costoTotal;
     private String referencia;
     private String tipoMantenimiento;
     private String companiaSeguro;
     private String proveedorNombre;
     private String comentarios;
     private int idProveedores;
     private int idCatalogo;
     private int idRegistroVehiculo;
     private Proveedores proveedores;
     private RegistroVehiculo registroVehiculo;

    public Servicios() {
    }

	
    public Servicios(Catalogo catalogo, Date fehaInicio, Date horaInicio, Date fechaTerminacion, Date horaTerminacion, String nombreVehiculo, int horometro, String servicio, long costoReferencias, long costoManoObra, long costoTotal, String referencia, String tipoMantenimiento, String companiaSeguro, String proveedorNombre, String comentarios, int idProveedores, int idCatalogo, int idRegistroVehiculo) {
        this.catalogo = catalogo;
        this.fehaInicio = fehaInicio;
        this.horaInicio = horaInicio;
        this.fechaTerminacion = fechaTerminacion;
        this.horaTerminacion = horaTerminacion;
        this.nombreVehiculo = nombreVehiculo;
        this.horometro = horometro;
        this.servicio = servicio;
        this.costoReferencias = costoReferencias;
        this.costoManoObra = costoManoObra;
        this.costoTotal = costoTotal;
        this.referencia = referencia;
        this.tipoMantenimiento = tipoMantenimiento;
        this.companiaSeguro = companiaSeguro;
        this.proveedorNombre = proveedorNombre;
        this.comentarios = comentarios;
        this.idProveedores = idProveedores;
        this.idCatalogo = idCatalogo;
        this.idRegistroVehiculo = idRegistroVehiculo;
    }
    public Servicios(Catalogo catalogo, Date fehaInicio, Date horaInicio, Date fechaTerminacion, Date horaTerminacion, String nombreVehiculo, int horometro, String servicio, long costoReferencias, long costoManoObra, long costoTotal, String referencia, String tipoMantenimiento, String companiaSeguro, String proveedorNombre, String comentarios, int idProveedores, int idCatalogo, int idRegistroVehiculo, Proveedores proveedores, RegistroVehiculo registroVehiculo) {
       this.catalogo = catalogo;
       this.fehaInicio = fehaInicio;
       this.horaInicio = horaInicio;
       this.fechaTerminacion = fechaTerminacion;
       this.horaTerminacion = horaTerminacion;
       this.nombreVehiculo = nombreVehiculo;
       this.horometro = horometro;
       this.servicio = servicio;
       this.costoReferencias = costoReferencias;
       this.costoManoObra = costoManoObra;
       this.costoTotal = costoTotal;
       this.referencia = referencia;
       this.tipoMantenimiento = tipoMantenimiento;
       this.companiaSeguro = companiaSeguro;
       this.proveedorNombre = proveedorNombre;
       this.comentarios = comentarios;
       this.idProveedores = idProveedores;
       this.idCatalogo = idCatalogo;
       this.idRegistroVehiculo = idRegistroVehiculo;
       this.proveedores = proveedores;
       this.registroVehiculo = registroVehiculo;
    }
   
    public Integer getIdServicios() {
        return this.idServicios;
    }
    
    public void setIdServicios(Integer idServicios) {
        this.idServicios = idServicios;
    }
    public Catalogo getCatalogo() {
        return this.catalogo;
    }
    
    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }
    public Date getFehaInicio() {
        return this.fehaInicio;
    }
    
    public void setFehaInicio(Date fehaInicio) {
        this.fehaInicio = fehaInicio;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getFechaTerminacion() {
        return this.fechaTerminacion;
    }
    
    public void setFechaTerminacion(Date fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }
    public Date getHoraTerminacion() {
        return this.horaTerminacion;
    }
    
    public void setHoraTerminacion(Date horaTerminacion) {
        this.horaTerminacion = horaTerminacion;
    }
    public String getNombreVehiculo() {
        return this.nombreVehiculo;
    }
    
    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }
    public int getHorometro() {
        return this.horometro;
    }
    
    public void setHorometro(int horometro) {
        this.horometro = horometro;
    }
    public String getServicio() {
        return this.servicio;
    }
    
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public long getCostoReferencias() {
        return this.costoReferencias;
    }
    
    public void setCostoReferencias(long costoReferencias) {
        this.costoReferencias = costoReferencias;
    }
    public long getCostoManoObra() {
        return this.costoManoObra;
    }
    
    public void setCostoManoObra(long costoManoObra) {
        this.costoManoObra = costoManoObra;
    }
    public long getCostoTotal() {
        return this.costoTotal;
    }
    
    public void setCostoTotal(long costoTotal) {
        this.costoTotal = costoTotal;
    }
    public String getReferencia() {
        return this.referencia;
    }
    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getTipoMantenimiento() {
        return this.tipoMantenimiento;
    }
    
    public void setTipoMantenimiento(String tipoMantenimiento) {
        this.tipoMantenimiento = tipoMantenimiento;
    }
    public String getCompaniaSeguro() {
        return this.companiaSeguro;
    }
    
    public void setCompaniaSeguro(String companiaSeguro) {
        this.companiaSeguro = companiaSeguro;
    }
    public String getProveedorNombre() {
        return this.proveedorNombre;
    }
    
    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }
    public String getComentarios() {
        return this.comentarios;
    }
    
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    public int getIdProveedores() {
        return this.idProveedores;
    }
    
    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }
    public int getIdCatalogo() {
        return this.idCatalogo;
    }
    
    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    public int getIdRegistroVehiculo() {
        return this.idRegistroVehiculo;
    }
    
    public void setIdRegistroVehiculo(int idRegistroVehiculo) {
        this.idRegistroVehiculo = idRegistroVehiculo;
    }
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    public RegistroVehiculo getRegistroVehiculo() {
        return this.registroVehiculo;
    }
    
    public void setRegistroVehiculo(RegistroVehiculo registroVehiculo) {
        this.registroVehiculo = registroVehiculo;
    }




}

