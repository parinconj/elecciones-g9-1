/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Clases.ClsMensaje;
import java.util.LinkedList;

/**
 *
 * @author davidperezarias
 */
public interface InterfaceCrud {

    public ClsMensaje agregar(Object objeto);

    public ClsMensaje actualizar(Object objeto);

    public ClsMensaje eliminar(String id);

    public LinkedList<Object> obtener();

}
