/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Libro;
import vista.GUI_Actividad;
import vista.GUI_Lectura;
import vista.GUI_Portada;
import vista.GUI_Resultados;

/**
 *
 * @author Gerald
 */
public class ControladorMenu implements ActionListener {

    private JFrame ventana = new JFrame("Tarea 4 - Minilibro de Etología de las Ranas");
    private GUI_Portada vista = new GUI_Portada();

    // conecta este controlador al panel de portada y muestra la ventana principal
    public ControladorMenu() {
        vista.addMenuListener(this);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        mostrarPanel(vista);
    }

    // recibe un panel lo monta en la ventana ajusta el tamano y lo centra en pantalla
    private void mostrarPanel(JPanel panel) {
        ventana.setContentPane(panel);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.revalidate();
        ventana.repaint();
        ventana.setVisible(true);
    }

    // recibe los clics del menu y ejecuta iniciar instrucciones o salir segun el comando
    @Override
    public void actionPerformed(ActionEvent e) {
        String op = e.getActionCommand();

        switch (op) {
            case "INICIAR":
                abrirLibro();
                break;
            case "INSTRUCCIONES":
                mostrarInstrucciones();
                break;
            case "SALIR":
                ventana.dispose();
                break;
        }
    }

    // crea el modelo los paneles y el controlador del libro y manda mostrar la primera pagina
    public void abrirLibro() {
        Libro modelo = new Libro();
        GUI_Lectura vistaLectura = new GUI_Lectura();
        GUI_Actividad vistaActividad = new GUI_Actividad();
        GUI_Resultados vistaResultados = new GUI_Resultados();

        ControladorLibro contro = new ControladorLibro(
                modelo, vistaLectura, vistaActividad, vistaResultados, vista, ventana);

        contro.mostrarPaginaActual();
    }

    // muestra un mensaje emergente con las instrucciones de uso del minilibro
    private void mostrarInstrucciones() {
        String mensaje = "Bienvenido al Minilibro Interactivo de Etología de las Ranas.\n\n"
                + "1. Avanza por las páginas de lectura para estudiar la conducta de los anuros.\n"
                + "2. En las páginas de actividad, selecciona una de las 4 opciones (OP1 a OP4).\n"
                + "3. Al finalizar todas las páginas podrás revisar tu matriz de resultados.";
        JOptionPane.showMessageDialog(ventana, mensaje, "Instrucciones - Tarea 4", JOptionPane.INFORMATION_MESSAGE);
    }
}
