/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.RegistroVehiculoDAO;
import sv.edu.udb.www.model.entity.RegistroVehiculo;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped


public class RegistroVehiculoControl {

    /**
     * Creates a new instance of RegistroVehiculoControl
     */
    private List<RegistroVehiculo> listaRegistroVehiculos;
    private RegistroVehiculo registro_vehiculo;

    public RegistroVehiculoControl() {
        registro_vehiculo = new RegistroVehiculo();
    }

    public List<RegistroVehiculo> getListaRegistroVehiculos() {
        RegistroVehiculoDAO ad = new RegistroVehiculoDAO();
        listaRegistroVehiculos = ad.listarRegistroVehiculos();
        return listaRegistroVehiculos;
    }

    public void setListaRegistroVehiculos(List<RegistroVehiculo> listaRegistroVehiculos) {
        this.listaRegistroVehiculos = listaRegistroVehiculos;
    }

    public RegistroVehiculo getRegistroVehiculo() {
        return registro_vehiculo;
    }

    public void setRegistroVehiculo(RegistroVehiculo registro_vehiculo) {
        this.registro_vehiculo = registro_vehiculo;
    }

    public void limpiarRegistroVehiculo() {
        registro_vehiculo = new RegistroVehiculo();
    }

    public void agregarRegistroVehiculo() {
        RegistroVehiculoDAO ad = new RegistroVehiculoDAO();
        ad.agregar(registro_vehiculo);
    }

    public void modificarRegistroVehiculo() {
        RegistroVehiculoDAO ad = new RegistroVehiculoDAO();
        ad.modificar(registro_vehiculo);
        limpiarRegistroVehiculo();
    }

    public void eliminarRegistroVehiculo() {
        RegistroVehiculoDAO ad = new RegistroVehiculoDAO();
        ad.eliminar(registro_vehiculo);
        limpiarRegistroVehiculo();
    }
}

