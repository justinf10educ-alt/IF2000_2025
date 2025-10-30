/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;
import java.util.Scanner;

/**
 *
 * @author Justin Flores
 */
public class Laboratorio_Juego_Damas {
    
    
    public class Ficha {
        private String color; // "R" para rojas, "B" para negras

        public Ficha(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public String toString() {
            return color;
        }
    }

 
    public class Tablero {
        private Ficha[][] tablero;

        public Tablero() {
            tablero = new Ficha[8][8];
            inicializarTablero();
        }

        public void inicializarTablero() {
            // Fichas negras (arriba)
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((i + j) % 2 != 0) {
                        tablero[i][j] = new Ficha("N");
                    }
                }
            }

            // Fichas rojas (abajo)
            for (int i = 5; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((i + j) % 2 != 0) {
                        tablero[i][j] = new Ficha("R");
                    }
                }
            }
        }

        public void mostrarTablero() {
            System.out.println("\n   0 1 2 3 4 5 6 7");
            for (int i = 0; i < 8; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 8; j++) {
                    if (tablero[i][j] == null) {
                        System.out.print(" -");
                    } else {
                        System.out.print(" " + tablero[i][j]);
                    }
                }
                System.out.println();
            }
        }

        public boolean moverFicha(int filaOrigen, int colOrigen, int filaDestino, int colDestino, String turno) {
            if (!coordenadasValidas(filaOrigen, colOrigen, filaDestino, colDestino)) {
                System.out.println("Coordenadas fuera del tablero.");
                return false;
            }

            Ficha ficha = tablero[filaOrigen][colOrigen];
            if (ficha == null) {
                System.out.println("No hay ficha en esa posición.");
                return false;
            }

            if (!ficha.getColor().equals(turno)) {
                System.out.println("No es el turno de esa ficha.");
                return false;
            }

            if (tablero[filaDestino][colDestino] != null) {
                System.out.println("La casilla destino está ocupada.");
                return false;
            }

            // Movimiento válido: una casilla en diagonal
            int movFila = filaDestino - filaOrigen;
            int movCol = Math.abs(colDestino - colOrigen);

            if (movCol == 1) {
                if (turno.equals("R") && movFila == 1) {
                    mover(filaOrigen, colOrigen, filaDestino, colDestino);
                    return true;
                } else if (turno.equals("N") && movFila == -1) {
                    mover(filaOrigen, colOrigen, filaDestino, colDestino);
                    return true;
                }
            }

            System.out.println("Movimiento no válido.");
            return false;
        }

        private void mover(int filaOrigen, int colOrigen, int filaDestino, int colDestino) {
            tablero[filaDestino][colDestino] = tablero[filaOrigen][colOrigen];
            tablero[filaOrigen][colOrigen] = null;
        }

        private boolean coordenadasValidas(int filaOrigen, int colOrigen, int filaDestino, int colDestino) {
            return filaOrigen >= 0 && filaOrigen < 8 &&
                   colOrigen >= 0 && colOrigen < 8 &&
                   filaDestino >= 0 && filaDestino < 8 &&
                   colDestino >= 0 && colDestino < 8;
        }
    }

   
    public class Juego {
        private Tablero tablero;
        private String turno;
        private Scanner entrada;

        public Juego() {
            tablero = new Tablero();
            turno = "R"; // Empiezan las rojas
            entrada = new Scanner(System.in);
        }

        public void iniciar() {
            boolean jugando = true;

            while (jugando) {
                tablero.mostrarTablero();
                System.out.println("\nTurno de las " + (turno.equals("R") ? "Rojas (R)" : "Negras (N)"));
                System.out.print("Fila origen: ");
                int fOrigen = entrada.nextInt();
                System.out.print("Columna origen: ");
                int cOrigen = entrada.nextInt();
                System.out.print("Fila destino: ");
                int fDestino = entrada.nextInt();
                System.out.print("Columna destino: ");
                int cDestino = entrada.nextInt();

                boolean movio = tablero.moverFicha(fOrigen, cOrigen, fDestino, cDestino, turno);

                if (movio) {
                    cambiarTurno();
                }

                System.out.print("\n¿Desea seguir jugando? (s/n): ");
                String seguir = entrada.next();
                if (seguir.equalsIgnoreCase("n")) {
                    jugando = false;
                }
            }
            System.out.println("Fin del juego.");
        }

        private void cambiarTurno() {
            turno = turno.equals("R") ? "N" : "R";
        }
    }

   
    public void ejecutar() {
        Juego juego = new Juego();
        juego.iniciar();
    }

}
    
    
    



    

