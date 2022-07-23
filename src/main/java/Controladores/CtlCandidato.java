package Controladores;

import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Interfaces.InterfaceCrud;
import Modelos.MdlCandidato;
import java.util.LinkedList;

/**
 *
 * @author davidperezarias
 */
public class CtlCandidato implements InterfaceCrud {

    MdlCandidato modelo;

    public CtlCandidato() {
        this.modelo = new MdlCandidato();
    }

    public ClsMensaje actualizarCandidato(ClsCandidato candidato) {

        return this.modelo.actualizarCandidato(candidato);
    }

    public ClsMensaje eliminarCandidato(String idCandidato) {

        return this.modelo.eliminarCandidato(idCandidato);
    }

    public ClsMensaje agregarCandidato(ClsCandidato candidato) {

        return this.modelo.agregarCandidato(candidato);
    }

    public LinkedList<ClsCandidato> Obtenercandidatos() {

        return this.modelo.Obtenercandidatos();
    }

    @Override
    public ClsMensaje agregar(Object objeto) {
        ClsCandidato candidato = (ClsCandidato) objeto;
        return this.modelo.agregarCandidato(candidato);
    }

    @Override
    public ClsMensaje actualizar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClsMensaje eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinkedList<Object> obtener() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
