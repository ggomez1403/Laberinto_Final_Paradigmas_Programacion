// Se importan las librerias necesarias para dibujar el laberinto
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Juego extends JPanel{
    // Se instancia el objeto de la clase Laberinto
    Laberinto laberinto = new Laberinto();

    // Se instancia el objeto de la clase Personaje
    static Personaje personaje = new Personaje();

    // Se inicializa la variable de los niveles del laberinto
    public static int nivel = 1;

    //Constructor
    public Juego(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
            }
            // Método invocado cuando una tecla de movimiento es oprimida
            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaPresionada(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        setFocusable(true);
    }

    //Sobreescritura del método paint
    public void paint(Graphics grafico){
        // Pintar laberinto
        laberinto.paint(grafico);
        // Pintar personaje
        personaje.paint(grafico);
    }

    //Método para incrementar de nivel
    public static int cambiaNivel(){
        return nivel++;
    }

    //Método para establecer los arrays de los laberintos a un nivel
    public static int obtieneNivel(){
        return nivel;
    }

    //Declaración del método principal
    public static void main(String[] args) {
        //Message Dialog con la presentación del grupo
        JOptionPane.showMessageDialog(null, "Grupo 28 - Paradigmas de programación\n\nGeraldine Gómez\nLeidy Delgado\nDavid Ramirez\nMiguel Perez\nJulian Preciado");
        JOptionPane.showMessageDialog(null, "Busca un salida del laberinto, responde correctamente las preguntas para acumular puntos");
        // Se crea la ventana con el titulo del juego
        JFrame miVentana = new JFrame("Visual Lab");
        // Objeto de la clase juego
        Juego game = new Juego();
        // Se agrega al Jframe el objeto de la clase juego
        miVentana.add(game);
        // Tamaño de la ventana en pixeles
        miVentana.setSize(935,560);
        // Ubicación de la ventana
        miVentana.setLocation(300,200);
        // Mostrar la ventana
        miVentana.setVisible(true);
        // Cerrar la ventana si se oprime la X
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Bucle While para observar el movimiento del personaje
        while(true){
            // delay de 10 milisegundos
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Se vuelve a pintar la pantalla
            miVentana.repaint();

            // Si se completan los tres niveles se muestra el puntaje y un mensaje de despedida
            if(obtieneNivel()>3){
                JOptionPane.showMessageDialog(null, "Juego Completado! \n\nPuntaje Total: " + personaje.puntaje);
                // Se cierra la ventana del juego al terminar la operación
                System.exit(0);
            }
        }
    }
}