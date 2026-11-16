Tema del libro: Etologia de la ranas
~Ejecutar el programa~
  *Requiere java y una aplicacion de ejecucion
  --Revisar que esten completos los archivos
  --Ejecutar el main.Principal

~Explicación breve de las clases principales~
  Main
  -Principal: inicia la ejecucion del programa.

  Modelo
  -Libro: crea las paginas con su informacion unica y guarda el puntaje
  -Pagina: clase abstracta, molde para crear los tipos de pagina con su numero, titulo y subtitulo
    *PaginaActividad: pregunta, opciones y retroalimentacion
    *PaginaInformativa: texto principal, datos y ejemplo

  Vista (GUI_)
  -Portada: muestra los botones para Salir, Instrucciones e Iniciar el minilibro
  -Lectura: muestra la informacion de una PaginaInformativa, volver al menu, siguiente y anterior pagina
  -Actividad: muestra la informacion de una PaginaActividad y los botones de opcion, volver al menu, siguiente y anterior pagina
  -Resultados: muestra una tabla con los titulos de las actividades, la respuesta escogida, la respuesta correcta y el estado de la actividad (incorrecta, correcta, pendiente)

  Controlador
  -ControladorLibro: controla la visibilidad de las ventanas de pagina. Conecta los botones a sus respectivas funciones: convoca la evaluacion de opcion 1 a 4 y su retroalimentacion, volver al menu, mostrar siguiente o anterior pagina, y mostrar resultados cuando no hay mas paginas
  -ControladorMenu: controla la visibilidad de la ventana de menu. Conecta los botones a sus respectivas funciones: Iniciar el minilibro, mostrar las instrucciones y salir
