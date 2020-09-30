/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.www.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import sv.edu.udb.www.model.dao.RecordatorioDAO;
import sv.edu.udb.www.model.entity.Recordatorio;

/**
 *
 * @author anton
 */
@ManagedBean
@ViewScoped
public class RecordatorioControl {

    /**
     * Creates a new instance of RecordatorioControl
     */
    private List<Recordatorio> listaRecordatorios;
    private Recordatorio recordatorio;

    public RecordatorioControl() {
        recordatorio = new Recordatorio();
    }

    public List<Recordatorio> getListaRecordatorios() {
        RecordatorioDAO ad = new RecordatorioDAO();
        listaRecordatorios = ad.listarRecordatorios();
        return listaRecordatorios;
    }

    public void setListaRecordatorios(List<Recordatorio> listaRecordatorios) {
        this.listaRecordatorios = listaRecordatorios;
    }

    public Recordatorio getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(Recordatorio recordatorio) {
        this.recordatorio = recordatorio;
    }

    public void limpiarRecordatorio() {
        recordatorio = new Recordatorio();
    }

    public void agregarRecordatorio() {
        RecordatorioDAO ad = new RecordatorioDAO();
        ad.agregar(recordatorio);
    }

    public void modificarRecordatorio() {
        RecordatorioDAO ad = new RecordatorioDAO();
        ad.modificar(recordatorio);
        limpiarRecordatorio();
    }

    public void eliminarRecordatorio() {
        RecordatorioDAO ad = new RecordatorioDAO();
        ad.eliminar(recordatorio);
        limpiarRecordatorio();
    }
}
