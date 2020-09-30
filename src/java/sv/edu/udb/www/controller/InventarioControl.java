/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.InventarioDAO;
import sv.edu.udb.www.model.entity.Inventario;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped
public class InventarioControl {

    /**
     * Creates a new instance of InventarioControl
     */
    private List<Inventario> listaInventarios;
    private Inventario inventario;

    public InventarioControl() {
        inventario = new Inventario();
    }

    public List<Inventario> getListaInventarios() {
        InventarioDAO ad = new InventarioDAO();
        listaInventarios = ad.listarInventarios();
        return listaInventarios;
    }

    public void setListaInventarios(List<Inventario> listaInventarios) {
        this.listaInventarios = listaInventarios;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void limpiarInventario() {
        inventario = new Inventario();
    }

    public void agregarInventario() {
        InventarioDAO ad = new InventarioDAO();
        ad.agregar(inventario);
    }

    public void modificarInventario() {
        InventarioDAO ad = new InventarioDAO();
        ad.modificar(inventario);
        limpiarInventario();
    }

    public void eliminarInventario() {
        InventarioDAO ad = new InventarioDAO();
        ad.eliminar(inventario);
        limpiarInventario();
    }
}
