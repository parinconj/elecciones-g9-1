/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsEleccion;
import Clases.ClsMensaje;
import Modelos.MdlEleccion;
import java.util.LinkedList;

/**
 *
 * @author davidperezarias
 */
public class CtlEleccion {
    
    MdlEleccion modelo;

    public CtlEleccion() {
        this.modelo = new MdlEleccion();
    }
    
    
    
    public ClsMensaje agregarEleccion(ClsEleccion eleccion){
    
        ClsMensaje mensaje = this.modelo.agregarEleccion(eleccion);
        
        return mensaje;
        
    
    }
    
    
    public LinkedList<ClsEleccion> obtenerElecciones(){
    
        LinkedList<ClsEleccion> elecciones = this.modelo.obtenerElecciones();
        
        return elecciones;
    
    }
    
}
