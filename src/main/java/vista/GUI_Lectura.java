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
public class GUI_Lectura extends javax.swing.JPanel {

  
    public GUI_Lectura() {
        initComponents();
    }

    // recibe los datos de la lectura desde el controlador y los muestra en las etiquetas y cuadros de texto
    public void actualizarVistaLectura(int numPagina, int totalPaginas, String titulo,
                                       String subtitulo, String especie, String contenido,
                                       String datoEtologico, boolean habilitarAnterior) {
        lblIndicadorPagina.setText("Página " + numPagina + " de " + totalPaginas + " • Lectura");
        lblTitulo.setText(titulo);
        lblSubtitulo.setText(subtitulo);
        lblEspecie.setText("Especie modelo: " + especie);
        txtContenido.setText(contenido);
        txtDatoEtologico.setText(datoEtologico);
        btnAnterior.setEnabled(habilitarAnterior);
    }

    // asigna los comandos a los botones de navegacion y les conecta el listener del controlador
    public void addButtonListener(ActionListener listener) {
        btnAnterior.setActionCommand("ANTERIOR");
        btnSiguiente.setActionCommand("SIGUIENTE");
        btnVolverMenu.setActionCommand("VOLVER");

        btnAnterior.addActionListener(listener);
        btnSiguiente.addActionListener(listener);
        btnVolverMenu.addActionListener(listener);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIndicadorPagina = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblEspecie = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtContenido = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDatoEtologico = new javax.swing.JTextArea();
        btnVolverMenu = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 250, 246));
        setPreferredSize(new java.awt.Dimension(680, 480));

        lblIndicadorPagina.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblIndicadorPagina.setForeground(new java.awt.Color(46, 125, 150));
        lblIndicadorPagina.setText("Página 1 de 6 • Lectura");

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 92, 55));
        lblTitulo.setText("Título de la Página");

        lblSubtitulo.setFont(new java.awt.Font("SansSerif", 2, 13)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(80, 100, 88));
        lblSubtitulo.setText("Subtítulo");

        lblEspecie.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(34, 110, 70));
        lblEspecie.setText("Especie modelo:");

        txtContenido.setEditable(false);
        txtContenido.setColumns(20);
        txtContenido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtContenido.setLineWrap(true);
        txtContenido.setRows(5);
        txtContenido.setWrapStyleWord(true);
        txtContenido.setBorder(javax.swing.BorderFactory.createTitledBorder("Desarrollo Etológico"));
        jScrollPane1.setViewportView(txtContenido);

        txtDatoEtologico.setEditable(false);
        txtDatoEtologico.setBackground(new java.awt.Color(230, 245, 234));
        txtDatoEtologico.setColumns(20);
        txtDatoEtologico.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtDatoEtologico.setLineWrap(true);
        txtDatoEtologico.setRows(3);
        txtDatoEtologico.setWrapStyleWord(true);
        txtDatoEtologico.setBorder(javax.swing.BorderFactory.createTitledBorder("Dato Clave de Observación"));
        jScrollPane2.setViewportView(txtDatoEtologico);

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
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEspecie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVolverMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblIndicadorPagina;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtContenido;
    private javax.swing.JTextArea txtDatoEtologico;
    // End of variables declaration//GEN-END:variables
}
