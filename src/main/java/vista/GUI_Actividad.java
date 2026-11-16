/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;

/**
 *
 * @author Gerald
 */
public class GUI_Actividad extends javax.swing.JPanel {

    
    public GUI_Actividad() {
        initComponents();
    }

    // recibe la pregunta y las opciones desde el controlador y actualiza los textos del panel
    public void actualizarVistaActividad(int numPagina, int totalPaginas, String titulo,
                                         String pregunta, String[] opciones, boolean habilitarAnterior) {
        lblIndicadorPagina.setText("Página " + numPagina + " de " + totalPaginas + " • Actividad");
        lblTitulo.setText(titulo);
        txtPregunta.setText(pregunta);

        btnOpcion1.setText("A) " + opciones[0]);
        btnOpcion2.setText("B) " + opciones[1]);
        btnOpcion3.setText("C) " + opciones[2]);
        btnOpcion4.setText("D) " + opciones[3]);
        btnAnterior.setEnabled(habilitarAnterior);
    }

    // asigna los comandos a los botones de opciones y navegacion y les conecta el listener del controlador
    public void addButtonListener(ActionListener listener) {
        btnOpcion1.setActionCommand("OP1");
        btnOpcion2.setActionCommand("OP2");
        btnOpcion3.setActionCommand("OP3");
        btnOpcion4.setActionCommand("OP4");

        btnVolverMenu.setActionCommand("VOLVER");
        btnAnterior.setActionCommand("ANTERIOR");
        btnSiguiente.setActionCommand("SIGUIENTE");

        btnOpcion1.addActionListener(listener);
        btnOpcion2.addActionListener(listener);
        btnOpcion3.addActionListener(listener);
        btnOpcion4.addActionListener(listener);
        btnVolverMenu.addActionListener(listener);
        btnAnterior.addActionListener(listener);
        btnSiguiente.addActionListener(listener);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIndicadorPagina = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPregunta = new javax.swing.JTextArea();
        btnOpcion1 = new javax.swing.JButton();
        btnOpcion2 = new javax.swing.JButton();
        btnOpcion3 = new javax.swing.JButton();
        btnOpcion4 = new javax.swing.JButton();
        btnVolverMenu = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 248, 252));
        setPreferredSize(new java.awt.Dimension(680, 480));

        lblIndicadorPagina.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblIndicadorPagina.setForeground(new java.awt.Color(46, 125, 150));
        lblIndicadorPagina.setText("Página 2 de 6 • Actividad");

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(25, 75, 110));
        lblTitulo.setText("Actividad");

        txtPregunta.setEditable(false);
        txtPregunta.setBackground(new java.awt.Color(230, 241, 248));
        txtPregunta.setColumns(20);
        txtPregunta.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtPregunta.setLineWrap(true);
        txtPregunta.setRows(2);
        txtPregunta.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtPregunta);

        btnOpcion1.setBackground(new java.awt.Color(255, 255, 255));
        btnOpcion1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnOpcion1.setForeground(new java.awt.Color(30, 50, 70));
        btnOpcion1.setText("A) Opción 1");
        btnOpcion1.setFocusPainted(false);

        btnOpcion2.setBackground(new java.awt.Color(255, 255, 255));
        btnOpcion2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnOpcion2.setForeground(new java.awt.Color(30, 50, 70));
        btnOpcion2.setText("B) Opción 2");
        btnOpcion2.setFocusPainted(false);

        btnOpcion3.setBackground(new java.awt.Color(255, 255, 255));
        btnOpcion3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnOpcion3.setForeground(new java.awt.Color(30, 50, 70));
        btnOpcion3.setText("C) Opción 3");
        btnOpcion3.setFocusPainted(false);

        btnOpcion4.setBackground(new java.awt.Color(255, 255, 255));
        btnOpcion4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        btnOpcion4.setForeground(new java.awt.Color(30, 50, 70));
        btnOpcion4.setText("D) Opción 4");
        btnOpcion4.setFocusPainted(false);

        btnVolverMenu.setBackground(new java.awt.Color(110, 125, 118));
        btnVolverMenu.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnVolverMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverMenu.setText("Volver al Menú");
        btnVolverMenu.setFocusPainted(false);

        btnAnterior.setBackground(new java.awt.Color(46, 125, 150));
        btnAnterior.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("Anterior");
        btnAnterior.setFocusPainted(false);

        btnSiguiente.setBackground(new java.awt.Color(34, 139, 84));
        btnSiguiente.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setFocusPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIndicadorPagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(btnOpcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 268, Short.MAX_VALUE)
                        .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblIndicadorPagina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnOpcion1;
    private javax.swing.JButton btnOpcion2;
    private javax.swing.JButton btnOpcion3;
    private javax.swing.JButton btnOpcion4;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIndicadorPagina;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtPregunta;
    // End of variables declaration//GEN-END:variables
}
