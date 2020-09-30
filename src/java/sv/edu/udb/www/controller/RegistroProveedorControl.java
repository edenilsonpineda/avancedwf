/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.RegistroProveedorDAO;
import sv.edu.udb.www.model.entity.RegistroProveedor;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped
public class RegistroProveedorControl {

    /**
     * Creates a new instance of RegistroProveedorControl
     */
    private List<RegistroProveedor> listaRegistroProveedors;
    private RegistroProveedor registro_proveedor;

    public RegistroProveedorControl() {
        registro_proveedor = new RegistroProveedor();
    }

    public List<RegistroProveedor> getListaRegistroProveedors() {
        RegistroProveedorDAO ad = new RegistroProveedorDAO();
        listaRegistroProveedors = ad.listarRegistroProveedors();
        return listaRegistroProveedors;
    }

    public void setListaRegistroProveedors(List<RegistroProveedor> listaRegistroProveedors) {
        this.listaRegistroProveedors = listaRegistroProveedors;
    }

    public RegistroProveedor getRegistroProveedor() {
        return registro_proveedor;
    }

    public void setRegistroProveedor(RegistroProveedor registro_proveedor) {
        this.registro_proveedor = registro_proveedor;
    }

    public void limpiarRegistroProveedor() {
        registro_proveedor = new RegistroProveedor();
    }

    public void agregarRegistroProveedor() {
        RegistroProveedorDAO ad = new RegistroProveedorDAO();
        ad.agregar(registro_proveedor);
    }

    public void modificarRegistroProveedor() {
        RegistroProveedorDAO ad = new RegistroProveedorDAO();
        ad.modificar(registro_proveedor);
        limpiarRegistroProveedor();
    }

    public void eliminarRegistroProveedor() {
        RegistroProveedorDAO ad = new RegistroProveedorDAO();
        ad.eliminar(registro_proveedor);
        limpiarRegistroProveedor();
    }
}

