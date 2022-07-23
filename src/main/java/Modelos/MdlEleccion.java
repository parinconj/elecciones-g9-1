/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsEleccion;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author davidperezarias
 */
public class MdlEleccion {
    
    ClsJdbc jdbc = new ClsJdbc();

    public MdlEleccion() {
        
        jdbc.CrearConexion();
    }
    
    public ClsMensaje agregarEleccion(ClsEleccion eleccion) {

        ClsMensaje mensaje;

        try {

            String sql = "INSERT INTO tbl_elecciones VALUES (?, ?, ?, ?, ?, ?, null)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, eleccion.getIdEleccion());
            sentencia.setString(2, eleccion.getDescripcion());
            sentencia.setString(3, eleccion.getTipo());
            sentencia.setString(4, eleccion.getFechainicio());
            sentencia.setString(5, eleccion.getFechaFin());
            sentencia.setString(6, eleccion.getEstado());

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsMensaje(ClsMensaje.OK, "La elección ha sido creado");
            } else {
                mensaje = new ClsMensaje(ClsMensaje.ERROR, "La elección NO ha sido creado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy un error: " + e.getMessage());
            return mensaje;
        }

    }
    
                     
    public LinkedList<ClsEleccion> obtenerElecciones() {

        try {

            LinkedList<ClsEleccion> elecciones = new LinkedList<>();

            String consulta = "SELECT * FROM tbl_elecciones";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                String idEleccion = resultados.getString("id_eleccion");
                String descripcion = resultados.getString("descripcion");
                String tipo = resultados.getString("tipo");
                String fechaInicio = resultados.getString("fecha_inicio");
                String fechaFin = resultados.getString("fecha_fin");
                String estado = resultados.getString("estado");
                String ganador = resultados.getString("ganador");

                ClsEleccion eleccion = new ClsEleccion(idEleccion, descripcion, tipo,
                fechaInicio, fechaFin, estado);

                elecciones.add(eleccion);

            }

            return elecciones;

        } catch (Exception e) {
            return null;
        }

    }
    
    
}
