// Se importan las clases necesarias para que se muestre correctamente el personaje
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

// Clase para la creación del personaje
public class Personaje {
    // Instanciar objeto de clase Laberinto
    Laberinto lab = new Laberinto();

    // Se inicializa la variable para el puntaje del juego
    int puntaje = 0;
    // Coordenada en eje X
    int x = 40;
    // Coordenada en eje Y
    int y = 40;
    // Ancho del personaje
    int ancho = 40;
    // Alto del personaje
    int alto = 40;
    // Movimiento del personaje
    int movimiento = 40;

    // Se dibuja el personaje y se definen los colores
    public void paint(Graphics grafico){
        // Se definen las propiedades del personaje
        grafico.setColor(Color.red);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.black);
        // Se dibuja el personaje con sus propiedades
        grafico.drawOval(x, y, ancho, alto);

        // Se definen y se pintan las propiedades de los ojos del personaje
        grafico.setColor(Color.white);
        grafico.fillOval(x+7, y+8, 13, 13);
        grafico.fillOval(x+21, y+8, 13, 13);
        grafico.setColor(Color.black);
        grafico.fillOval(x+11, y+12, 5, 5);
        grafico.fillOval(x+25, y+12, 5, 5);

        // Se definen las propiedades de la boca del personaje
        grafico.setColor(Color.black);
        grafico.fillOval(x+7, y+24, 27, 7);
    }

    // Método de lectura de las teclas presionadas por el usuario
    public void teclaPresionada(KeyEvent evento){
        // Crear matriz de los laberintos invocando el método obtieneLaberinto
        int[][]laberinto = lab.obtieneLaberinto();

        //Si lee la flecha Izquierda del teclado
        if(evento.getKeyCode()==37){
            //Verificar si hay muro para evitar movimiento
            if(laberinto[y/40][(x/40)-1]!=1){
                // El personaje se desplaza a la izquierda en eje x
                x-=movimiento;
            }
        }

        //Si lee la flecha Derecha del teclado
        if(evento.getKeyCode()==39){
            //Verificar si hay muro para evitar movimiento
            if(laberinto[y/40][(x/40)+1]!=1){
                // El personaje se desplaza a la derecha en eje x
                x+=movimiento;
            }
        }

        //Si lee la flecha Abajo del teclado
        if(evento.getKeyCode()==40){
            //Verificar si hay muro para evitar movimiento
            if(laberinto[(y/40)+1][x/40]!=1){
                // El personaje se desplaza hacia abajo en el eje y
                y+=movimiento;
            }
        }

        //Si lee la flecha Arriba del teclado
        if(evento.getKeyCode()==38){
            //Verificar si hay muro para evitar movimiento
            if(laberinto[(y/40)-1][x/40]!=1){
                //El personaje se desplaza hacia arriba en el eje y
                y-=movimiento;
            }
        }

        // Si el personaje está encima del signo de pregunta
        if(laberinto[(y/40)][x/40]==2){
            // Instanciar el objeto de la clase Preguntas
            Preguntas preguntas = new Preguntas();
            // Se invoca el método para seleccionar la el indice de la pregunta en la matriz de la clase Preguntas
            int indice = preguntas.seleccionaPregunta();
            // Se invoca el método para mostrar el texto de la pregunta
            String textoPregunta = preguntas.devuelvePregunta(indice);
            // Se invoca el método para mostrar la opción A
            String OpcionA = preguntas.devuelveOpcionA(indice);
            // Se invoca el método para mostrar la opción B
            String OpcionB = preguntas.devuelveOpcionB(indice);
            // Se invoca el método para mostrar la opción C
            String OpcionC = preguntas.devuelveOpcionC(indice);
            // Se invoca el método para mostrar la respuesta correcta
            String respuesta = preguntas.devuelveRespuesta(indice).toUpperCase();
            // Input Dialog en donde se muestra la pregunta, las opciones y el usuario introduce su respuesta
            String respuestaUsuario = JOptionPane.showInputDialog(null, "Por favor, digite la letra de su respuesta\n\n" + textoPregunta + "\n" + OpcionA + "\n" + OpcionB + "\n" + OpcionC + "\n");

            // Se inicializa la variable para mostrar al usuario el puntaje
            String mensaje = "";

            // Si la respuesta del usuario del correcta
            if(respuestaUsuario.equalsIgnoreCase(respuesta)){
                // Si la respuesta es correcta se actualiza el mensaje y se aumenta el puntaje
                mensaje = "Respuesta Correcta \n\n";
                puntaje+=10;
            }
            else{
                // Si la respuesta es incorrecta se actualiza el mensaje
                mensaje = "Respuesta Incorrecta \n\n";
            }
            // Se muestra por un Message Dialog el puntaje al usuario
            JOptionPane.showMessageDialog(null, mensaje +"Puntaje: " + puntaje);
        }

        // Si llega al final del nivel
        if(x==840 && y==440){
            // Se invoca el método para cambiar el nivel
            Juego.cambiaNivel();
            // Las coordenadas vuelven a su posición inicial
            x=40;
            y=40;
        }
    }
}
