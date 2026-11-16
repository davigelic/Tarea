/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerald
 */
public class PaginaInformativa extends Pagina {

    private String textoPrincipal;
    private String datoEtologico;
    private String especieEjemplo;

    // recibe todos los datos de la lectura manda los basicos a pagina y guarda los de esta clase
    public PaginaInformativa(int numeroPagina, String titulo, String subtitulo,
                             String textoPrincipal, String datoEtologico, String especieEjemplo) {
        super(numeroPagina, titulo, subtitulo);
        this.textoPrincipal = textoPrincipal;
        this.datoEtologico = datoEtologico;
        this.especieEjemplo = especieEjemplo;
    }

    // devuelve el parrafo principal con la explicacion de la lectura
    public String getTextoPrincipal() {
        return textoPrincipal;
    }

    // devuelve el dato clave de observacion etologica
    public String getDatoEtologico() {
        return datoEtologico;
    }

    // devuelve el nombre de la especie de rana de ejemplo
    public String getEspecieEjemplo() {
        return especieEjemplo;
    }

    // devuelve la etiqueta lectura para identificar este tipo de pagina
    @Override
    public String getTipoPagina() {
        return "LECTURA";
    }

    // arma y devuelve un resumen corto con el numero titulo y especie
    @Override
    public String obtenerResumen() {
        return "Página " + getNumeroPagina() + " [Lectura]: " + getTitulo()
                + " (" + especieEjemplo + ")";
    }
}
