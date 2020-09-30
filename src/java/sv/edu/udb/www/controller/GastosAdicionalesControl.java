/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.GastosAdicionalesDAO;
import sv.edu.udb.www.model.entity.GastosAdicionales;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped
public class GastosAdicionalesControl {

    /**
     * Creates a new instance of GastosAdicionalesControl
     */
    private List<GastosAdicionales> listaGastosAdicionaless;
    private GastosAdicionales gastos_adicionales;

    public GastosAdicionalesControl() {
        gastos_adicionales = new GastosAdicionales();
    }

    public List<GastosAdicionales> getListaGastosAdicionaless() {
        GastosAdicionalesDAO ad = new GastosAdicionalesDAO();
        listaGastosAdicionaless = ad.listarGastosAdicionaless();
        return listaGastosAdicionaless;
    }

    public void setListaGastosAdicionaless(List<GastosAdicionales> listaGastosAdicionaless) {
        this.listaGastosAdicionaless = listaGastosAdicionaless;
    }

    public GastosAdicionales getGastosAdicionales() {
        return gastos_adicionales;
    }

    public void setGastosAdicionales(GastosAdicionales gastos_adicionales) {
        this.gastos_adicionales = gastos_adicionales;
    }

    public void limpiarGastosAdicionales() {
        gastos_adicionales = new GastosAdicionales();
    }

    public void agregarGastosAdicionales() {
        GastosAdicionalesDAO ad = new GastosAdicionalesDAO();
        ad.agregar(gastos_adicionales);
    }

    public void modificarGastosAdicionales() {
        GastosAdicionalesDAO ad = new GastosAdicionalesDAO();
        ad.modificar(gastos_adicionales);
        limpiarGastosAdicionales();
    }

    public void eliminarGastosAdicionales() {
        GastosAdicionalesDAO ad = new GastosAdicionalesDAO();
        ad.eliminar(gastos_adicionales);
        limpiarGastosAdicionales();
    }
}
