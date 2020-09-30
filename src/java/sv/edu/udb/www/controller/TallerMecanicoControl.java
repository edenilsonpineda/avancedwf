/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.TallerMecanicoDAO;
import sv.edu.udb.www.model.entity.TallerMecanico;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped


public class TallerMecanicoControl {

    /**
     * Creates a new instance of TallerMecanicoControl
     */
    private List<TallerMecanico> listaTallerMecanicos;
    private TallerMecanico taller_mecanico;

    public TallerMecanicoControl() {
        taller_mecanico = new TallerMecanico();
    }

    public List<TallerMecanico> getListaTallerMecanicos() {
        TallerMecanicoDAO ad = new TallerMecanicoDAO();
        listaTallerMecanicos = ad.listarTallerMecanicos();
        return listaTallerMecanicos;
    }

    public void setListaTallerMecanicos(List<TallerMecanico> listaTallerMecanicos) {
        this.listaTallerMecanicos = listaTallerMecanicos;
    }

    public TallerMecanico getTallerMecanico() {
        return taller_mecanico;
    }

    public void setTallerMecanico(TallerMecanico taller_mecanico) {
        this.taller_mecanico = taller_mecanico;
    }

    public void limpiarTallerMecanico() {
        taller_mecanico = new TallerMecanico();
    }

    public void agregarTallerMecanico() {
        TallerMecanicoDAO ad = new TallerMecanicoDAO();
        ad.agregar(taller_mecanico);
    }

    public void modificarTallerMecanico() {
        TallerMecanicoDAO ad = new TallerMecanicoDAO();
        ad.modificar(taller_mecanico);
        limpiarTallerMecanico();
    }

    public void eliminarTallerMecanico() {
        TallerMecanicoDAO ad = new TallerMecanicoDAO();
        ad.eliminar(taller_mecanico);
        limpiarTallerMecanico();
    }
}

