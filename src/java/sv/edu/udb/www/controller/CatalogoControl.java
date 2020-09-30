/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.CatalogoDAO;
import sv.edu.udb.www.model.entity.Catalogo;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped
public class CatalogoControl {

    /**
     * Creates a new instance of CatalogoControl
     */
    private List<Catalogo> listaCatalogos;
    private Catalogo catalogo;

    public CatalogoControl() {
        catalogo = new Catalogo();
    }

    public List<Catalogo> getListaCatalogos() {
        CatalogoDAO ad = new CatalogoDAO();
        listaCatalogos = ad.listarCatalogos();
        return listaCatalogos;
    }

    public void setListaCatalogos(List<Catalogo> listaCatalogos) {
        this.listaCatalogos = listaCatalogos;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void limpiarCatalogo() {
        catalogo = new Catalogo();
    }

    public void agregarCatalogo() {
        CatalogoDAO ad = new CatalogoDAO();
        ad.agregar(catalogo);
    }

    public void modificarCatalogo() {
        CatalogoDAO ad = new CatalogoDAO();
        ad.modificar(catalogo);
        limpiarCatalogo();
    }

    public void eliminarCatalogo() {
        CatalogoDAO ad = new CatalogoDAO();
        ad.eliminar(catalogo);
        limpiarCatalogo();
    }
}

