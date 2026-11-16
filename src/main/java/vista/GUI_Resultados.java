/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gerald
 */
public class GUI_Resultados extends javax.swing.JPanel {

   
    public GUI_Resultados() {
        initComponents();
    }

    // recibe el puntaje y la matriz del controlador para mostrarlos en la etiqueta y en la tabla
    public void cargarResultados(int puntaje, int totalActividades, String[][] matrizDatos) {
        lblPuntaje.setText("Puntaje obtenido: " + puntaje + " de " + totalActividades + " aciertos");
        String[] columnas = {"Actividad", "Tu Respuesta", "Respuesta Correcta", "Estado"};
        DefaultTableModel modeloTabla = new DefaultTableModel(matrizDatos, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaResultados.setModel(modeloTabla);
    }

    // asigna los comandos a los botones finales y les conecta el listener del controlador
    public void addButtonListener(ActionListener listener) {
        btnReiniciar.setActionCommand("REINICIAR");
        btnVolverMenu.setActionCommand("VOLVER");
        btnSalir.setActionCommand("SALIR");

        btnReiniciar.addActionListener(listener);
        btnVolverMenu.addActionListener(listener);
        btnSalir.addActionListener(listener);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        btnReiniciar = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(236, 246, 238));
        setPreferredSize(new java.awt.Dimension(700, 440));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 19)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 92, 55));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INFORME FINAL DE ETOLOGÍA DE LAS RANAS");

        lblPuntaje.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        lblPuntaje.setForeground(new java.awt.Color(46, 125, 150));
        lblPuntaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntaje.setText("Puntaje obtenido: 0 de 3 aciertos");

        tablaResultados.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Actividad", "Tu Respuesta", "Respuesta Correcta", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaResultados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaResultados.setRowHeight(26);
        tablaResultados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaResultados);

        btnReiniciar.setBackground(new java.awt.Color(46, 125, 150));
        btnReiniciar.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("Reiniciar Libro");
        btnReiniciar.setFocusPainted(false);

        btnVolverMenu.setBackground(new java.awt.Color(34, 139, 84));
        btnVolverMenu.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnVolverMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverMenu.setText("Volver al Menú");
        btnVolverMenu.setFocusPainted(false);

        btnSalir.setBackground(new java.awt.Color(178, 58, 58));
        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPuntaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaResultados;
    // End of variables declaration//GEN-END:variables
}
