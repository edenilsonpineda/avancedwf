package sv.edu.udb.www.model.entity;
// Generated 09-27-2020 09:55:08 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * RegistroVehiculo generated by hbm2java
 */
public class RegistroVehiculo  implements java.io.Serializable {


     private Integer idRegistroVehiculo;
     private RegistroVehiculo registroVehiculo;
     private Servicios servicios;
     private String nombreVehiculo;
     private String marcaVehiculo;
     private String modeloVehiculo;
     private Date anoVehiulo;
     private String statusInicialVehiculo;
     private Date fechaRegistroVehiculo;
     private String medidaUso;
     private String nombreTaller;
     private String companiaSeguro;
     private int numeroSerie;
     private int polizaRegistro;
     private int placa;
     private String color;
     private Date vigenciaPoliza;
     private int idInventario;
     private int idTallerMecanico;
     private GastosAdicionales gastosAdicionales;
     private Set<RegistroVehiculo> registroVehiculos = new HashSet<RegistroVehiculo>(0);
     private Recordatorio recordatorio;

    public RegistroVehiculo() {
    }

	
    public RegistroVehiculo(RegistroVehiculo registroVehiculo, Servicios servicios, String nombreVehiculo, String marcaVehiculo, String modeloVehiculo, Date anoVehiulo, String statusInicialVehiculo, Date fechaRegistroVehiculo, String medidaUso, String nombreTaller, String companiaSeguro, int numeroSerie, int polizaRegistro, int placa, String color, Date vigenciaPoliza, int idInventario, int idTallerMecanico) {
        this.registroVehiculo = registroVehiculo;
        this.servicios = servicios;
        this.nombreVehiculo = nombreVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.anoVehiulo = anoVehiulo;
        this.statusInicialVehiculo = statusInicialVehiculo;
        this.fechaRegistroVehiculo = fechaRegistroVehiculo;
        this.medidaUso = medidaUso;
        this.nombreTaller = nombreTaller;
        this.companiaSeguro = companiaSeguro;
        this.numeroSerie = numeroSerie;
        this.polizaRegistro = polizaRegistro;
        this.placa = placa;
        this.color = color;
        this.vigenciaPoliza = vigenciaPoliza;
        this.idInventario = idInventario;
        this.idTallerMecanico = idTallerMecanico;
    }
    public RegistroVehiculo(RegistroVehiculo registroVehiculo, Servicios servicios, String nombreVehiculo, String marcaVehiculo, String modeloVehiculo, Date anoVehiulo, String statusInicialVehiculo, Date fechaRegistroVehiculo, String medidaUso, String nombreTaller, String companiaSeguro, int numeroSerie, int polizaRegistro, int placa, String color, Date vigenciaPoliza, int idInventario, int idTallerMecanico, GastosAdicionales gastosAdicionales, Set<RegistroVehiculo> registroVehiculos, Recordatorio recordatorio) {
       this.registroVehiculo = registroVehiculo;
       this.servicios = servicios;
       this.nombreVehiculo = nombreVehiculo;
       this.marcaVehiculo = marcaVehiculo;
       this.modeloVehiculo = modeloVehiculo;
       this.anoVehiulo = anoVehiulo;
       this.statusInicialVehiculo = statusInicialVehiculo;
       this.fechaRegistroVehiculo = fechaRegistroVehiculo;
       this.medidaUso = medidaUso;
       this.nombreTaller = nombreTaller;
       this.companiaSeguro = companiaSeguro;
       this.numeroSerie = numeroSerie;
       this.polizaRegistro = polizaRegistro;
       this.placa = placa;
       this.color = color;
       this.vigenciaPoliza = vigenciaPoliza;
       this.idInventario = idInventario;
       this.idTallerMecanico = idTallerMecanico;
       this.gastosAdicionales = gastosAdicionales;
       this.registroVehiculos = registroVehiculos;
       this.recordatorio = recordatorio;
    }
   
    public Integer getIdRegistroVehiculo() {
        return this.idRegistroVehiculo;
    }
    
    public void setIdRegistroVehiculo(Integer idRegistroVehiculo) {
        this.idRegistroVehiculo = idRegistroVehiculo;
    }
    public RegistroVehiculo getRegistroVehiculo() {
        return this.registroVehiculo;
    }
    
    public void setRegistroVehiculo(RegistroVehiculo registroVehiculo) {
        this.registroVehiculo = registroVehiculo;
    }
    public Servicios getServicios() {
        return this.servicios;
    }
    
    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
    public String getNombreVehiculo() {
        return this.nombreVehiculo;
    }
    
    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }
    public String getMarcaVehiculo() {
        return this.marcaVehiculo;
    }
    
    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }
    public String getModeloVehiculo() {
        return this.modeloVehiculo;
    }
    
    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }
    public Date getAnoVehiulo() {
        return this.anoVehiulo;
    }
    
    public void setAnoVehiulo(Date anoVehiulo) {
        this.anoVehiulo = anoVehiulo;
    }
    public String getStatusInicialVehiculo() {
        return this.statusInicialVehiculo;
    }
    
    public void setStatusInicialVehiculo(String statusInicialVehiculo) {
        this.statusInicialVehiculo = statusInicialVehiculo;
    }
    public Date getFechaRegistroVehiculo() {
        return this.fechaRegistroVehiculo;
    }
    
    public void setFechaRegistroVehiculo(Date fechaRegistroVehiculo) {
        this.fechaRegistroVehiculo = fechaRegistroVehiculo;
    }
    public String getMedidaUso() {
        return this.medidaUso;
    }
    
    public void setMedidaUso(String medidaUso) {
        this.medidaUso = medidaUso;
    }
    public String getNombreTaller() {
        return this.nombreTaller;
    }
    
    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }
    public String getCompaniaSeguro() {
        return this.companiaSeguro;
    }
    
    public void setCompaniaSeguro(String companiaSeguro) {
        this.companiaSeguro = companiaSeguro;
    }
    public int getNumeroSerie() {
        return this.numeroSerie;
    }
    
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public int getPolizaRegistro() {
        return this.polizaRegistro;
    }
    
    public void setPolizaRegistro(int polizaRegistro) {
        this.polizaRegistro = polizaRegistro;
    }
    public int getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public Date getVigenciaPoliza() {
        return this.vigenciaPoliza;
    }
    
    public void setVigenciaPoliza(Date vigenciaPoliza) {
        this.vigenciaPoliza = vigenciaPoliza;
    }
    public int getIdInventario() {
        return this.idInventario;
    }
    
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }
    public int getIdTallerMecanico() {
        return this.idTallerMecanico;
    }
    
    public void setIdTallerMecanico(int idTallerMecanico) {
        this.idTallerMecanico = idTallerMecanico;
    }
    public GastosAdicionales getGastosAdicionales() {
        return this.gastosAdicionales;
    }
    
    public void setGastosAdicionales(GastosAdicionales gastosAdicionales) {
        this.gastosAdicionales = gastosAdicionales;
    }
    public Set<RegistroVehiculo> getRegistroVehiculos() {
        return this.registroVehiculos;
    }
    
    public void setRegistroVehiculos(Set<RegistroVehiculo> registroVehiculos) {
        this.registroVehiculos = registroVehiculos;
    }
    public Recordatorio getRecordatorio() {
        return this.recordatorio;
    }
    
    public void setRecordatorio(Recordatorio recordatorio) {
        this.recordatorio = recordatorio;
    }




}


