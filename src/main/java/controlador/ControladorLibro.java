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
import modelo.Pagina;
import modelo.PaginaActividad;
import modelo.PaginaInformativa;
import vista.GUI_Actividad;
import vista.GUI_Lectura;
import vista.GUI_Portada;
import vista.GUI_Resultados;

/**
 *
 * @author Gerald
 */
public class ControladorLibro implements ActionListener {

    private Libro modelo = new Libro();
    private GUI_Lectura vistaLectura = new GUI_Lectura();
    private GUI_Actividad vistaActividad= new GUI_Actividad();
    private GUI_Resultados vistaResultados= new GUI_Resultados();
    private GUI_Portada vistamenu = new GUI_Portada();
    private JFrame ventana ; 

    // recibe el modelo los paneles y la ventana y conecta este controlador a los botones de cada vista
    public ControladorLibro(Libro modelo, GUI_Lectura vistaLectura,
                            GUI_Actividad vistaActividad, GUI_Resultados vistaResultados,
                            GUI_Portada vistamenu, JFrame ventana) {
        this.modelo = modelo;
        this.vistaLectura = vistaLectura;
        this.vistaActividad = vistaActividad;
        this.vistaResultados = vistaResultados;
        this.vistamenu = vistamenu;
        this.ventana = ventana;

        this.vistaLectura.addButtonListener(this);
        this.vistaActividad.addButtonListener(this);
        this.vistaResultados.addButtonListener(this);
    }

    // recibe un panel lo coloca en la ventana y refresca la interfaz
    private void mostrarPanel(JPanel panel) {
        ventana.setContentPane(panel);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.revalidate();
        ventana.repaint();
        ventana.setVisible(true);
    }

    // recibe los eventos de los botones del libro y llama al metodo correspondiente segun el comando
    @Override
    public void actionPerformed(ActionEvent e) {
        String op = e.getActionCommand();

        switch (op) {
            case "OP1":
                evaluarOpcion(0);
                break;
            case "OP2":
                evaluarOpcion(1);
                break;
            case "OP3":
                evaluarOpcion(2);
                break;
            case "OP4":
                evaluarOpcion(3);
                break;
            case "ANTERIOR":
                retroceder();
                break;
            case "SIGUIENTE":
                avanzar();
                break;
            case "REINICIAR":
                reiniciarLibro();
                break;
            case "VOLVER":
                volverMenu();
                break;
            case "SALIR":
                cerrarAplicacion();
                break;
        }
    }

    // pide la pagina actual al modelo manda los datos al panel de lectura o actividad y lo muestra
    public void mostrarPaginaActual() {
        Pagina pagina = modelo.getPaginaActual();
        if (pagina == null) {
            return;
        }

        int numPagina = modelo.getIndiceActual() + 1;
        int totalPaginas = modelo.getTotalPaginas();
        boolean hayAnterior = modelo.hayAnterior();

        if (pagina instanceof PaginaInformativa) {
            PaginaInformativa info = (PaginaInformativa) pagina;

            vistaLectura.actualizarVistaLectura(
                    numPagina,
                    totalPaginas,
                    info.getTitulo(),
                    info.getSubtitulo(),
                    info.getEspecieEjemplo(),
                    info.getTextoPrincipal(),
                    info.getDatoEtologico(),
                    hayAnterior
            );
            mostrarPanel(vistaLectura);

        } else if (pagina instanceof PaginaActividad) {
            PaginaActividad act = (PaginaActividad) pagina;

            vistaActividad.actualizarVistaActividad(
                    numPagina,
                    totalPaginas,
                    act.getTitulo(),
                    act.getPregunta(),
                    act.getOpciones(),
                    hayAnterior
            );
            mostrarPanel(vistaActividad);
        }
    }

    // recibe el indice de respuesta elegido lo registra en el modelo y muestra si acerto o fallo
    private void evaluarOpcion(int indiceOpcion) {
        Pagina pagina = modelo.getPaginaActual();
        if (pagina instanceof PaginaActividad) {
            PaginaActividad act = (PaginaActividad) pagina;
            boolean correcta = modelo.registrarRespuesta(act, indiceOpcion);

            if (correcta) {
                JOptionPane.showMessageDialog(
                        ventana,
                        "¡Respuesta correcta!\n" + act.getRetroalimentacion(),
                        "Evaluación Etológica",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        ventana,
                        "Respuesta incorrecta.\nRespuesta correcta: " + act.getTextoOpcionCorrecta()
                        + "\n" + act.getRetroalimentacion(),
                        "Evaluación Etológica",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        }
    }

    // avanza a la siguiente pagina o abre los resultados si ya termino el libro
    private void avanzar() {
        if (modelo.haySiguiente()) {
            modelo.avanzarPagina();
            mostrarPaginaActual();
        } else {
            mostrarPantallaResultados();
        }
    }

    // retrocede a la pagina anterior si no esta en la primera
    private void retroceder() {
        if (modelo.hayAnterior()) {
            modelo.retrocederPagina();
            mostrarPaginaActual();
        }
    }

    // manda el puntaje y la matriz al panel de resultados y lo muestra en la ventana
    private void mostrarPantallaResultados() {
        vistaResultados.cargarResultados(
                modelo.getPuntaje(),
                modelo.contarTotalActividades(),
                modelo.getMatrizResultados()
        );
        mostrarPanel(vistaResultados);
    }

    // reinicia el modelo desde cero y vuelve a mostrar la primera pagina
    private void reiniciarLibro() {
        modelo.reiniciar();
        mostrarPaginaActual();
    }

    // vuelve a mostrar el panel de portada en la ventana principal
    private void volverMenu() {
        mostrarPanel(vistamenu);
    }

    // cierra la ventana y finaliza la ejecucion
    private void cerrarAplicacion() {
        ventana.dispose();
    }
}
