/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import Clases.ClsVotante;
import Interfaces.InterfaceCrud;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author davidperezarias
 */
public class MdlVotante implements InterfaceCrud {

    ClsJdbc jdbc = new ClsJdbc();

    public MdlVotante() {
        jdbc.CrearConexion();
    }

    @Override
    public ClsMensaje agregar(Object objeto) {

        ClsVotante votante = (ClsVotante) objeto;

        ClsMensaje mensaje;

        try {

            String sql = "INSERT INTO tbl_votantes VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, votante.getNumeroDocumento());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getCorreo());
            sentencia.setString(5, votante.getCiudad());
            sentencia.setString(6, votante.getDireccion());

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                mensaje = new ClsMensaje(ClsMensaje.OK, "El votante ha sido creado");
            } else {
                mensaje = new ClsMensaje(ClsMensaje.ERROR, "El votante NO ha sido creado");
            }

            return mensaje;

        } catch (Exception e) {
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy un error: " + e.getMessage());
            return mensaje;
        }

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
         try {

            LinkedList<Object> votantes = new LinkedList<>();

            String consulta = "SELECT * FROM tbl_votantes";

            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                String direccion = resultados.getString("direccion");
                String numeroDocumento = resultados.getString("id_votante");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String ciudad = resultados.getString("ciudad_residencia");

                ClsVotante votante = new ClsVotante(ciudad, direccion, numeroDocumento,
                        nombre, telefono, correo
                );

                votantes.add(votante);

            }

            return votantes;

        } catch (Exception e) {
            return null;
        }
    }

}
