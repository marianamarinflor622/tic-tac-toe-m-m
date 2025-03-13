# Tic-Tac-Toe Game (Java 21)

Este proyecto es una implementación del clásico juego de Tic-Tac-Toe (también conocido como Tres en Línea) en Java. Fue desarrollado por Marta Ibarra y Mariana Marin como parte de un proyecto para practicar: 
- Condicionales
- Uso de bucles
- Scanner
- Arrays multidimensionales
- Programación orientada a objetos

##

## Instrucciones para ejecutar el juego

### Requisitos previos

- Tener instalado **Java 21** o una versión superior en tu máquina.
- Asegúrate de tener configurada la variable de entorno `JAVA_HOME` y tener acceso al comando `java` en la terminal.

### Pasos para ejecutar el juego

1. Clona el repositorio en tu máquina local:
    ```bash
    git clone https://github.com/marianamarinflor622/tic-tac-toe-m-m.git
    ```

2. Navega a la carpeta del proyecto:
    ```bash
    cd tic-tac-toe-m-m
    ```

3. Compila el código fuente:
    ```bash
    javac tictactoemym/example/*.java
    ```

4. Ejecuta el juego:
    ```bash
    java tictactoemym.example.Game
    ```

5. El juego se iniciará en la consola y te pedirá que ingreses las filas y columnas entre 1 y 3 para colocar tus piezas. Los jugadores alternarán entre las piezas "X" y "O".

6. El juego terminará cuando un jugador gane o si se alcanza un empate.

## Descripción del código

### Clases

- **Board**: Esta clase representa el tablero de juego, una matriz de 3x3 donde se colocan las piezas. Tiene métodos para imprimir el tablero, registrar los movimientos de los jugadores, verificar si un jugador ha ganado o si el juego ha terminado en empate.

- **Game**: Esta clase maneja la lógica principal del juego. Controla el flujo de turnos de los jugadores, recibe las entradas de los jugadores y verifica el estado del juego después de cada movimiento.

### Funcionalidades

- El tablero se muestra en la consola y se actualiza después de cada turno.
- Los jugadores deben ingresar las filas y columnas donde quieren colocar su pieza (X o O).
- El juego verifica si hay un ganador después de cada movimiento o si el juego ha terminado en empate.
- Si un jugador hace un movimiento no válido, el juego le pedirá que lo intente de nuevo.

### Juego en Consola

El juego se juega en la consola de texto. Cada vez que un jugador hace un movimiento, el tablero se imprime con las marcas de los jugadores ("X" y "O"). El flujo de juego sigue hasta que haya un ganador o un empate.

## Contribuidores

- **Marta Ibarra**
- **Mariana Marin**

## Licencia

Este proyecto está bajo la Licencia MIT - 
