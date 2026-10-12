# Animación en Java Swing (Animacion)

Proyecto desarrollado en Java que implementa una animación interactiva 2D mediante **Java Swing** y **AWT**. El programa combina la reproducción de un sprite animado (personaje agachado/caminando), un fondo panorámico y un cronómetro en tiempo real.

---

## Características

* **Sprite Sheet Animado**: Animación fluida de personaje utilizando la hoja de sprites `_CrouchWalk.png`.
* **Escenario y Fondo**: Renderizado de fondo dinámico utilizando `background.jpg`.
* **Cronómetro Integrado**: Módulo `Cronometro.java` encargado del control y medición del tiempo de ejecución.
* **Interfaz Gráfica (GUI)**: Uso de ventanas y paneles nativos mediante Java Swing (`JFrame`, `JPanel`).

---

## Requisitos del Sistema

* **Java Development Kit (JDK)**: Versión 8 o superior.
* Un entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse, NetBeans o VS Code.

---

## Estructura del Proyecto

```text
Animacion/
└── funadmentos3/
    ├── Animacion.java       # Clase principal y lógica de renderizado/animación
    ├── Cronometro.java      # Clase para la gestión y control del tiempo
    ├── _CrouchWalk.png      # Hoja de sprites para la animación del personaje
    └── background.jpg       # Imagen de fondo para la escena

Instrucciones de Instalación y Ejecución
Clonar el repositorio:

Bash
git clone [https://github.com/diwgod55/Animacion.git](https://github.com/diwgod55/Animacion.git)
Abrir el proyecto en tu IDE preferido o compilar desde la terminal.

Compilar los archivos Java:

Bash
javac funadmentos3/Cronometro.java funadmentos3/Animacion.java
Ejecutar la aplicación:

Bash
java funadmentos3.Animacion
Autor
diwgod55
