/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.ServiciosDAO;
import sv.edu.udb.www.model.entity.Servicios;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped


public class ServiciosControl {

    /**
     * Creates a new instance of ServiciosControl
     */
    private List<Servicios> listaServicioss;
    private Servicios servicios;

    public ServiciosControl() {
        servicios = new Servicios();
    }

    public List<Servicios> getListaServicioss() {
        ServiciosDAO ad = new ServiciosDAO();
        listaServicioss = ad.listarServicioss();
        return listaServicioss;
    }

    public void setListaServicioss(List<Servicios> listaServicioss) {
        this.listaServicioss = listaServicioss;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    public void limpiarServicios() {
        servicios = new Servicios();
    }

    public void agregarServicios() {
        ServiciosDAO ad = new ServiciosDAO();
        ad.agregar(servicios);
    }

    public void modificarServicios() {
        ServiciosDAO ad = new ServiciosDAO();
        ad.modificar(servicios);
        limpiarServicios();
    }

    public void eliminarServicios() {
        ServiciosDAO ad = new ServiciosDAO();
        ad.eliminar(servicios);
        limpiarServicios();
    }
}
