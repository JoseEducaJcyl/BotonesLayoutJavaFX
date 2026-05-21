# BotonesLayoutJavaFX

Pequeño proyecto demostrativo para aprender a usar los diferentes **layouts (distribuciones)** que ofrece JavaFX para organizar botones en una interfaz gráfica.

## ¿Qué ejemplos incluye?

- **`VBox` y `HBox`**: Muestra botones organizados en vertical y horizontal.
- **`BorderPane`**: Coloca botones en las posiciones superior (norte), inferior (sur), izquierda (oeste), derecha (este) y central (centro).
- **`GridPane`**: Organiza botones en una cuadrícula de filas y columnas (como un tablero).
- Todos los botones tienen eventos que muestran mensajes en la consola o alertas emergentes.

## ¿Cómo funciona?

1. Al ejecutar cada ejemplo, se abre una ventana con diferentes botones.
2. Cada botón está colocado en una posición específica según el layout elegido.
3. Al hacer clic en un botón, se ejecuta una acción (por ejemplo, imprimir un mensaje o mostrar una alerta).

## Requisitos

- Java 11 o superior.
- Maven (para gestionar las dependencias y ejecutar el proyecto).

## Ejecución

Clona el repositorio y, desde la terminal en la carpeta raíz, ejecuta:

```bash
mvn javafx:run
