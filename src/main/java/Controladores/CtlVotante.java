/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Interfaces.InterfaceCrud;
import Modelos.MdlVotante;
import java.util.LinkedList;

/**
 *
 * @author davidperezarias
 */
public class CtlVotante implements InterfaceCrud {
    
    MdlVotante modelo;

    public CtlVotante() {
        this.modelo = new MdlVotante();
        
    }
   

    @Override
    public ClsMensaje agregar(Object objeto) {
        return this.modelo.agregar(objeto);
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
        return this.modelo.obtener();
    }
    
    
  
}
