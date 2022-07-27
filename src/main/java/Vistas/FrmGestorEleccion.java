/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.ClsCandidato;
import Clases.ClsEleccion;
import Clases.ClsMensaje;
import Controladores.CtlCandidato;
import Controladores.CtlEleccion;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author davidperezarias
 */
public class FrmGestorEleccion extends javax.swing.JFrame {

    CtlEleccion controladorEleccion;
    CtlCandidato controladorCandidato;
    LinkedList<ClsCandidato> candidatos;

    /**
     * Creates new form FrmGestorEleccion
     */
    public FrmGestorEleccion() {
        initComponents();
        this.controladorEleccion = new CtlEleccion();
        this.controladorCandidato = new CtlCandidato();
        this.ObtenerElecciones();
        this.ObtenerCandidatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDescri = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        campoFechaInicio = new com.toedter.calendar.JDateChooser();
        campoFechaFin = new com.toedter.calendar.JDateChooser();
        botonAgregar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        scroll2 = new javax.swing.JScrollPane();
        tablaCandidatosEleccion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        comboCandidatos = new javax.swing.JComboBox<>();
        botonAsociar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scroll1 = new javax.swing.JScrollPane();
        tablaElecciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelDescri.setText("Descripción");

        jLabel4.setText("Tipo");

        jLabel5.setText("Fecha inicio");

        jLabel6.setText("Fecha fin");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presidencial", "Municipal" }));

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonActualizar.setText("Actualizar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelDescri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botonAgregar)
                .addGap(18, 18, 18)
                .addComponent(botonActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelDescri)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonActualizar))
                .addGap(19, 19, 19))
        );

        tablaCandidatosEleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Votos"
            }
        ));
        scroll2.setViewportView(tablaCandidatosEleccion);

        jLabel1.setText("Candidatos por elección");

        jLabel2.setText("Listado elecciones");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Candidato");

        comboCandidatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        botonAsociar.setText("Asociar");
        botonAsociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsociarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCandidatos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(botonAsociar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAsociar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        botonEliminar.setText("Eliminar");

        botonEditar.setText("Editar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(botonEliminar)
                .addGap(18, 18, 18)
                .addComponent(botonEditar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tablaElecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Descripción", "Tipo", "Fecha inicio", "Fecha fin", "Estado", "Ganador"
            }
        ));
        tablaElecciones.setCellSelectionEnabled(true);
        tablaElecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEleccionesMouseClicked(evt);
            }
        });
        scroll1.setViewportView(tablaElecciones);

        jScrollPane1.setViewportView(scroll1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ObtenerCandidatos() {
        this.candidatos = this.controladorCandidato.Obtenercandidatos();
        this.ActualizarComboCandidatos(this.candidatos);

    }

    private void ActualizarComboCandidatos(LinkedList<ClsCandidato> lista) {

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) this.comboCandidatos.getModel();

        modelo.removeAllElements();

        for (ClsCandidato c : lista) {

            String candidato = c.getNombre() + '-' + c.getNumeroDocumento();

            modelo.addElement(candidato);

        }

    }


    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        //Paso 1. primer paso: crear interfaz
        //Paso 2. cambiar el nombre de variable de los campos de la interfaz
        //Paso 3. Crear evento en los botones, dando doble dobleclick sobre el botón
        //Paso 4. Capturar la información
        //Paso 5. Crear objeto de la entidad (Crear clase)
        //Paso 6. Definir el controlador, definir el método
        //Paso 7. definir el modelo, definir el método
        //Paso 9. validar lógica de negocio en el controlador
        //Paso 10. enviar el objeto al modelo
        //Paso 11. crear lógica para realizar el proceso en la base de datos
        //Paso 8. Enviar el objeto del paso 5 al controlador y al método
        String descripcion = this.campoDescripcion.getText();
        String tipo = this.comboTipo.getSelectedItem().toString();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

        String fechaInicio = formatoFecha.format(this.campoFechaInicio.getDate());
        String fechaFin = formatoFecha.format(this.campoFechaFin.getDate());
        String estado = "creado";

        String[] partesFecha = fechaInicio.split("-", 2);
        String anio = partesFecha[0];

        String idEleccion = anio + tipo.substring(0, 6);

        ClsEleccion eleccion = new ClsEleccion(idEleccion, descripcion, tipo,
                fechaInicio, fechaFin, estado);

        ClsMensaje mensaje = this.controladorEleccion.agregarEleccion(eleccion);

        if (mensaje.getTipo().equals(ClsMensaje.OK)) {
            this.ObtenerElecciones();
        }

    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonAsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsociarActionPerformed

        int columna = 0;
        int fila = this.tablaElecciones.getSelectedRow();

        String idEleccion = this.tablaElecciones.getModel().getValueAt(fila, columna).toString();

        String[] partesCandidato = this.comboCandidatos.getSelectedItem().toString().split("-");

        String idCandidato = partesCandidato[1];

        ClsMensaje mensaje = this.controladorEleccion.asociarCandidatoEleccion(idCandidato, idEleccion);

        if (mensaje.getTipo().equals(ClsMensaje.OK)) {
            //this.ObtenerElecciones();
            this.ObtenerCandidatosEleccion(idEleccion);
        }
        
        JOptionPane.showMessageDialog(rootPane, mensaje.getTexto());

    }//GEN-LAST:event_botonAsociarActionPerformed

    private void tablaEleccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEleccionesMouseClicked

        int columna = 0;
        int fila = this.tablaElecciones.getSelectedRow();

        String idEleccion = this.tablaElecciones.getModel().getValueAt(fila, columna).toString();
        
        this.ObtenerCandidatosEleccion(idEleccion);
        
    }//GEN-LAST:event_tablaEleccionesMouseClicked

    public void ObtenerCandidatosEleccion(String idEleccion) {

        LinkedList<ClsCandidato> listaCandidatos = this.controladorEleccion.obtenerCandidatosEleccion(idEleccion);
        ActualizarTablaCandidatos(listaCandidatos);
    }

    private void ActualizarTablaCandidatos(LinkedList<ClsCandidato> lista) {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaCandidatosEleccion.getModel();
        modelo.setRowCount(0);

        for (ClsCandidato c : lista) {

            Object[] fila = {
                c.getNumeroDocumento(),
                c.getNombre(),
                ""
            };

            modelo.addRow(fila);

        }

    }

    public void ObtenerElecciones() {

        LinkedList<ClsEleccion> listaElecciones = this.controladorEleccion.obtenerElecciones();
        ActualizarTabla(listaElecciones);
    }

    private void ActualizarTabla(LinkedList<ClsEleccion> lista) {

        DefaultTableModel modelo = (DefaultTableModel) this.tablaElecciones.getModel();
        modelo.setRowCount(0);

        for (ClsEleccion c : lista) {

            Object[] fila = {
                c.getIdEleccion(),
                c.getDescripcion(),
                c.getTipo(),
                c.getFechainicio(),
                c.getFechaFin(),
                c.getEstado(),
                c.getGanador()
            };

            modelo.addRow(fila);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGestorEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestorEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestorEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestorEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestorEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAsociar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JTextField campoDescripcion;
    private com.toedter.calendar.JDateChooser campoFechaFin;
    private com.toedter.calendar.JDateChooser campoFechaInicio;
    private javax.swing.JComboBox<String> comboCandidatos;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescri;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTable tablaCandidatosEleccion;
    private javax.swing.JTable tablaElecciones;
    // End of variables declaration//GEN-END:variables
}
