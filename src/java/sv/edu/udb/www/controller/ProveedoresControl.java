/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.ProveedoresDAO;
import sv.edu.udb.www.model.entity.Proveedores;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped

public class ProveedoresControl {

    /**
     * Creates a new instance of ProveedoresControl
     */
    private List<Proveedores> listaProveedoress;
    private Proveedores proveedores;

    public ProveedoresControl() {
        proveedores = new Proveedores();
    }

    public List<Proveedores> getListaProveedoress() {
        ProveedoresDAO ad = new ProveedoresDAO();
        listaProveedoress = ad.listarProveedoress();
        return listaProveedoress;
    }

    public void setListaProveedoress(List<Proveedores> listaProveedoress) {
        this.listaProveedoress = listaProveedoress;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public void limpiarProveedores() {
        proveedores = new Proveedores();
    }

    public void agregarProveedores() {
        ProveedoresDAO ad = new ProveedoresDAO();
        ad.agregar(proveedores);
    }

    public void modificarProveedores() {
        ProveedoresDAO ad = new ProveedoresDAO();
        ad.modificar(proveedores);
        limpiarProveedores();
    }

    public void eliminarProveedores() {
        ProveedoresDAO ad = new ProveedoresDAO();
        ad.eliminar(proveedores);
        limpiarProveedores();
    }
}
