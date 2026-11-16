/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerald
 */
public class PaginaActividad extends Pagina {

    private String pregunta;
    private String[] opciones;
    private int indiceCorrecto;
    private String retroalimentacion;

    // recibe los datos de la pregunta manda lo basico a pagina y guarda opciones y respuesta correcta
    public PaginaActividad(int numeroPagina, String titulo, String subtitulo,
                           String pregunta, String[] opciones, int indiceCorrecto,
                           String retroalimentacion) {
        super(numeroPagina, titulo, subtitulo);
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.indiceCorrecto = indiceCorrecto;
        this.retroalimentacion = retroalimentacion;
    }

    // devuelve el enunciado de la pregunta
    public String getPregunta() {
        return pregunta;
    }

    // devuelve el arreglo con las cuatro opciones de respuesta
    public String[] getOpciones() {
        return opciones;
    }

    // devuelve el indice de la opcion correcta
    public int getIndiceCorrecto() {
        return indiceCorrecto;
    }

    // devuelve la explicacion que se muestra tras responder
    public String getRetroalimentacion() {
        return retroalimentacion;
    }

    // recibe el indice elegido y devuelve true si coincide con la respuesta correcta
    public boolean verificarRespuesta(int indiceSeleccionado) {
        return indiceSeleccionado == indiceCorrecto;
    }

    // busca y devuelve el texto de la opcion correcta
    public String getTextoOpcionCorrecta() {
        if (indiceCorrecto >= 0 && indiceCorrecto < opciones.length) {
            return opciones[indiceCorrecto];
        }
        return "";
    }

    // devuelve la etiqueta actividad para identificar este tipo de pagina
    @Override
    public String getTipoPagina() {
        return "ACTIVIDAD";
    }

    // arma y devuelve un resumen corto con el numero y titulo de la actividad
    @Override
    public String obtenerResumen() {
        return "Página " + getNumeroPagina() + " [Actividad]: " + getTitulo();
    }
}
