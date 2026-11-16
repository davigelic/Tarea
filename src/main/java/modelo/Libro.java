/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Gerald
 */
public class Libro {

    private String tituloLibro;
    private ArrayList<Pagina> paginas;
    private int indiceActual;
    private int puntaje;
    private String[][] matrizResultados;
    private boolean[] actividadesRespondidas;

    // inicializa el libro carga todas las paginas y prepara la matriz de resultados
    public Libro() {
        this.tituloLibro = "Minilibro Interactivo: Etología de las Ranas";
        this.paginas = new ArrayList<>();
        this.indiceActual = 0;
        this.puntaje = 0;
        cargarContenidoEtologia();
        inicializarRegistroActividades();
    }

    // agrega a la lista las paginas informativas y las actividades de etologia de las ranas
    private void cargarContenidoEtologia() {
        paginas.add(new PaginaInformativa(
                1,
                "1. Comunicación Acústica y Coros Nocturnos",
                "Señales sonoras para atraer pareja y defender territorio",
                "Los anuros machos producen cantos específicos de cada especie mediante un saco vocal "
                + "que amplifica el sonido. Estas vocalizaciones cumplen dos funciones principales: "
                + "atraer a las hembras receptivas (canto de anuncio) y advertir a otros machos "
                + "sobre los límites de su territorio.",
                "Las hembras evalúan la frecuencia y duración del canto como indicador directo "
                + "de la condición física y salud genética del macho.",
                "Rana de ojos rojos (Agalychnis callidryas)"
        ));

        paginas.add(new PaginaActividad(
                2,
                "Actividad 1: Bioacústica en Anuros",
                "Comprueba lo aprendido sobre la comunicación de las ranas",
                "¿Cuál es la función principal del saco vocal en los machos de muchas especies de ranas?",
                new String[]{
                    "Almacenar agua durante la estación seca",
                    "Amplificar el canto de anuncio y defensa territorial",
                    "Detectar vibraciones sísmicas bajo la tierra",
                    "Producir toxinas defensivas contra depredadores"
                },
                1,
                "El saco vocal actúa como caja de resonancia para proyectar cantos específicos de especie."
        ));

        paginas.add(new PaginaInformativa(
                3,
                "2. Coloración Aposemática y Defensa Química",
                "Advertencia visual frente a depredadores",
                "Muchas ranas diurnas han desarrollado colores brillantes como rojo, azul o amarillo "
                + "intenso. Este fenómeno, llamado aposematismo, advierte a los depredadores sobre la "
                + "presencia de alcaloides tóxicos en su piel, obtenidos a partir de su dieta de "
                + "hormigas, ácaros y escarabajos.",
                "En cautiverio, al cambiar su dieta de artrópodos silvestres, estas ranas dejan "
                + "de acumular toxinas en su piel aunque conservan su coloración brillante.",
                "Rana dardo venenosa (Dendrobates auratus)"
        ));

        paginas.add(new PaginaActividad(
                4,
                "Actividad 2: Estrategias Defensivas",
                "Analiza el comportamiento y ecología química",
                "¿De dónde obtienen originalmente las ranas dardo los alcaloides tóxicos de su piel?",
                new String[]{
                    "Los sintetizan mediante fotosíntesis cutánea",
                    "De los minerales disueltos en los ríos",
                    "De su dieta especializada de pequeños artrópodos silvestres",
                    "Del contacto con hongos bioluminiscentes"
                },
                2,
                "Secuestran los alcaloides lipofílicos directamente de hormigas, ácaros y otros insectos que consumen."
        ));

        paginas.add(new PaginaInformativa(
                5,
                "3. Cuidado Parental y Transporte de Renacuajos",
                "Conductas complejas de protección de la descendencia",
                "A diferencia de la creencia común de que los anfibios abandonan sus huevos, diversas "
                + "especies neotropicales exhiben cuidado parental avanzado: vigilan las puestas "
                + "para mantenerlas húmedas, ahuyentan depredadores e incluso transportan los "
                + "renacuajos sobre su espalda hasta bromelias con agua.",
                "Algunas madres depositan huevos no fertilizados en el agua de la bromelia para "
                + "alimentar exclusivamente a sus renacuajos.",
                "Rana de cristal (Hyalinobatrachium fleischmanni)"
        ));

        paginas.add(new PaginaActividad(
                6,
                "Actividad 3: Conducta Reproductiva",
                "Evalúa el cuidado parental en ranas neotropicales",
                "¿Qué conducta de cuidado parental realizan algunas ranas neotropicales con sus crías?",
                new String[]{
                    "Construyen nidos subterráneos con hojas secas",
                    "Transportan los renacuajos en su espalda hacia fitotelmata o bromelias",
                    "Alimentan a los renacuajos con néctar de flores",
                    "Migran miles de kilómetros hacia el océano"
                },
                1,
                "Llevan a los renacuajos adheridos al dorso hasta pequeños depósitos de agua seguros en plantas."
        ));
    }

    // crea y llena la matriz inicial con las actividades pendientes de responder
    private void inicializarRegistroActividades() {
        int totalActividades = contarTotalActividades();
        matrizResultados = new String[totalActividades][4];
        actividadesRespondidas = new boolean[totalActividades];

        int fila = 0;
        for (int i = 0; i < paginas.size(); i++) {
            Pagina p = paginas.get(i);
            if (p instanceof PaginaActividad) {
                matrizResultados[fila][0] = p.getTitulo();
                matrizResultados[fila][1] = "Sin responder";
                matrizResultados[fila][2] = ((PaginaActividad) p).getTextoOpcionCorrecta();
                matrizResultados[fila][3] = "Pendiente";
                actividadesRespondidas[fila] = false;
                fila++;
            }
        }
    }

    // cuenta y devuelve cuantas paginas de actividad tiene el libro
    public int contarTotalActividades() {
        int total = 0;
        for (int i = 0; i < paginas.size(); i++) {
            if (paginas.get(i) instanceof PaginaActividad) {
                total++;
            }
        }
        return total;
    }

    // recibe una actividad y devuelve su numero de fila en la matriz de resultados
    public int obtenerIndiceActividad(PaginaActividad actividad) {
        int contador = 0;
        for (int i = 0; i < paginas.size(); i++) {
            Pagina p = paginas.get(i);
            if (p instanceof PaginaActividad) {
                if (p == actividad) {
                    return contador;
                }
                contador++;
            }
        }
        return -1;
    }

    // recibe la actividad y la opcion elegida actualiza el puntaje y la matriz y devuelve si acerto
    public boolean registrarRespuesta(PaginaActividad actividad, int indiceOpcion) {
        int fila = obtenerIndiceActividad(actividad);
        boolean esCorrecta = actividad.verificarRespuesta(indiceOpcion);
        String[] opciones = actividad.getOpciones();

        if (fila != -1) {
            if (!actividadesRespondidas[fila] && esCorrecta) {
                puntaje++;
            } else if (actividadesRespondidas[fila] && !esCorrecta
                    && "Correcta".equals(matrizResultados[fila][3])) {
                puntaje--;
            }
            actividadesRespondidas[fila] = true;
            matrizResultados[fila][1] = opciones[indiceOpcion];
            matrizResultados[fila][3] = esCorrecta ? "Correcta" : "Incorrecta";
        }
        return esCorrecta;
    }

    // reinicia la posicion al inicio pone el puntaje en cero y limpia la matriz
    public void reiniciar() {
        this.indiceActual = 0;
        this.puntaje = 0;
        inicializarRegistroActividades();
    }

    // devuelve el titulo del libro
    public String getTituloLibro() {
        return tituloLibro;
    }

    // devuelve la lista completa de paginas
    public ArrayList<Pagina> getPaginas() {
        return paginas;
    }

    // devuelve la pagina correspondiente al indice actual
    public Pagina getPaginaActual() {
        if (indiceActual >= 0 && indiceActual < paginas.size()) {
            return paginas.get(indiceActual);
        }
        return null;
    }

    // devuelve el indice de la pagina actual
    public int getIndiceActual() {
        return indiceActual;
    }

    // devuelve la cantidad total de paginas del libro
    public int getTotalPaginas() {
        return paginas.size();
    }

    // devuelve true si existe una pagina siguiente
    public boolean haySiguiente() {
        return indiceActual < paginas.size() - 1;
    }

    // devuelve true si existe una pagina anterior
    public boolean hayAnterior() {
        return indiceActual > 0;
    }

    // suma uno al indice actual para avanzar de pagina
    public void avanzarPagina() {
        if (haySiguiente()) {
            indiceActual++;
        }
    }

    // resta uno al indice actual para volver a la pagina anterior
    public void retrocederPagina() {
        if (hayAnterior()) {
            indiceActual--;
        }
    }

    // devuelve el puntaje total acumulado
    public int getPuntaje() {
        return puntaje;
    }

    // devuelve la matriz con los resultados de todas las actividades
    public String[][] getMatrizResultados() {
        return matrizResultados;
    }
}
