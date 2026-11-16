/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerald
 */
public abstract class Pagina {

    private int numeroPagina;
    private String titulo;
    private String subtitulo;

    // recibe numero titulo y subtitulo para construir los datos base de la pagina
    public Pagina(int numeroPagina, String titulo, String subtitulo) {
        this.numeroPagina = numeroPagina;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    // devuelve el numero de pagina
    public int getNumeroPagina() {
        return numeroPagina;
    }

    // recibe y guarda un nuevo numero de pagina
    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    // devuelve el titulo de la pagina
    public String getTitulo() {
        return titulo;
    }

    // recibe y actualiza el titulo de la pagina
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // devuelve el subtitulo de la pagina
    public String getSubtitulo() {
        return subtitulo;
    }

    // recibe y actualiza el subtitulo de la pagina
    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    // obliga a las subclases a devolver si la pagina es lectura o actividad
    public abstract String getTipoPagina();

    // obliga a las subclases a devolver un texto corto con el resumen de la pagina
    public abstract String obtenerResumen();
}
