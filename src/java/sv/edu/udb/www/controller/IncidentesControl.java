/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.IncidentesDAO;
import sv.edu.udb.www.model.entity.Incidentes;
/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped
public class IncidentesControl {

    /**
     * Creates a new instance of IncidentesControl
     */
    private List<Incidentes> listaIncidentess;
    private Incidentes incidentes;

    public IncidentesControl() {
        incidentes = new Incidentes();
    }

    public List<Incidentes> getListaIncidentess() {
        IncidentesDAO ad = new IncidentesDAO();
        listaIncidentess = ad.listarIncidentess();
        return listaIncidentess;
    }

    public void setListaIncidentess(List<Incidentes> listaIncidentess) {
        this.listaIncidentess = listaIncidentess;
    }

    public Incidentes getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(Incidentes incidentes) {
        this.incidentes = incidentes;
    }

    public void limpiarIncidentes() {
        incidentes = new Incidentes();
    }

    public void agregarIncidentes() {
        IncidentesDAO ad = new IncidentesDAO();
        ad.agregar(incidentes);
    }

    public void modificarIncidentes() {
        IncidentesDAO ad = new IncidentesDAO();
        ad.modificar(incidentes);
        limpiarIncidentes();
    }

    public void eliminarIncidentes() {
        IncidentesDAO ad = new IncidentesDAO();
        ad.eliminar(incidentes);
        limpiarIncidentes();
    }
}
