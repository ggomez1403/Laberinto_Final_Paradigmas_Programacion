//Clase para definir colores
import java.awt.Color;
// Clase para dibujar el laberinto
import java.awt.Graphics;
//Clase para trabajar con archivos
import java.io.File;
//Clase excepciones
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//Clases para trabajar con imagenes
import java.awt.Image;
import javax.imageio.ImageIO;

public class Laberinto {
    // Array bidimensional del laberinto
    int[][]lab = new int[13][23];
    //Contador de filas
    int fila = 0;
    //Contador columnas
    int columna = 0;
    //Numero de filas establecidas
    int numeroFilas = 13;
    //Numero de columnas establecidas
    int numeroColumnas = 23;
    //Ancho de los bloques
    int anchoBloque = 40;
    // Alto de los bloques
    int altoBloque = 40;
    // Imagen para las preguntas
    private Image signoPregunta;

    //Método paint para dibujar laberinto
    public void paint(Graphics grafico){
        // Variable que invoca metodo Obtener laberinto
        int [][]laberinto = obtieneLaberinto();
        //For anidados para recorrer filas y columnas
        //For para filas
        for(fila=0;fila<numeroFilas;fila++){
            //For para columnas
            for(columna=0;columna<numeroColumnas;columna++){
                //Verifica si la fila y columna del laberinto es 1 (Pared)
                if(laberinto[fila][columna]==1){
                    // Pinta las paredes de color cyan si el nivel es el 1
                    if(Juego.obtieneNivel()==1){
                        grafico.setColor(Color.cyan);
                    }
                    // Pinta las paredes de color rosa si el nivel es el 2
                    if(Juego.obtieneNivel()==2){
                        grafico.setColor(Color.pink);
                    }
                    // Pinta las paredes de color magenta si el nivel es el 3
                    if(Juego.obtieneNivel()>=3){
                        grafico.setColor(Color.magenta);
                    }
                    // Pinta las paredes con espacios de 40px
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque);
                    // Pinta los bordes de las paredes de negro
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                }
                // Verifica si la fila y columna del laberinto es 2
                if (laberinto[fila][columna]==2){
                    // Carga la imagen del signo de pregunta
                    File imagen = new File("src/main/java/signo.png");
                    try {
                        // Lee la imagen y la asigna a la variable
                        signoPregunta = ImageIO.read(imagen);
                    } catch (IOException ex) {
                        // Lanza una excepcion si no puede leer la imagen
                        Logger.getLogger(Laberinto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    // Dibuja en el laberinto la imagen del signo de pregunta en las coordenadas especificadas
                    grafico.drawImage(signoPregunta, (int) (columna*40.3), (int) (fila*40.5), 36, 36, null);
                }
            }
        }
        // Dibuja las marcas de inicio y fin en los 3 niveles
        grafico.drawString("Inicio", 5, 62);
        grafico.drawString("Fin", 850, 462);
    }
    //Obtener el laberinto
    public int[][] obtieneLaberinto(){
        // Laberinto nivel 1
        if(Juego.obtieneNivel()==1){
            int laberinto[][]=
                    {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    { 1,0,0,1,0,2,0,0,1,0,2,0,1,0,1,0,0,0,2,0,0,1,1},
                    { 1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1},
                    { 1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,1},
                    { 1,1,1,2,1,0,1,0,0,0,1,0,1,0,2,0,1,1,0,1,0,1,1},
                    { 1,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,2,0,1,0,1,1},
                    { 1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1},
                    { 1,1,0,1,0,0,0,2,1,0,2,0,1,0,0,1,1,1,0,1,0,1,1},
                    { 1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1},
                    { 1,1,0,1,0,2,0,0,1,0,0,0,0,0,2,1,0,1,0,1,0,1,1},
                    { 1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1},
                    { 1,1,0,2,0,0,0,0,0,0,2,0,0,0,0,0,0,1,0,2,0,0,1},
                    { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab=laberinto;
        }
        if(Juego.obtieneNivel()==2){
            // Laberinto nivel 2
            int laberinto[][]=
                    {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    { 1,0,0,0,1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,1,1},
                    { 1,1,1,0,1,0,1,1,1,1,1,2,1,1,1,1,1,1,1,1,0,1,1},
                    { 1,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
                    { 1,1,2,1,1,1,1,2,1,1,1,1,1,1,2,1,1,1,1,1,0,1,1},
                    { 1,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,1},
                    { 1,1,1,0,1,2,1,1,2,1,1,1,1,1,1,1,1,1,2,1,0,1,1},
                    { 1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
                    { 1,1,0,1,1,0,1,0,1,0,1,2,1,1,1,1,1,1,1,1,0,1,1},
                    { 1,1,0,1,0,0,0,2,1,0,1,0,0,1,0,0,0,2,0,1,0,1,1},
                    { 1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1},
                    { 1,1,0,2,0,0,0,0,1,0,2,0,0,0,0,0,0,1,0,0,0,0,1},
                    { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab=laberinto;
        }
        if(Juego.obtieneNivel()==3){
            // Laberinto nivel 3
            int laberinto [][]=
                    {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    { 1,0,0,0,1,0,2,0,0,0,0,1,1,1,0,0,1,1,0,0,2,1,1},
                    { 1,1,1,0,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,1,1},
                    { 1,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1,0,2,1,0,1,1},
                    { 1,1,2,1,1,1,1,0,1,0,0,1,1,0,1,0,0,1,0,1,0,1,1},
                    { 1,1,0,0,0,0,1,0,0,2,1,1,1,0,1,2,1,0,0,1,0,1,1},
                    { 1,1,1,0,1,0,1,1,1,1,0,0,0,2,1,0,0,1,0,1,0,1,1},
                    { 1,1,0,0,0,1,0,0,2,1,0,1,1,1,0,0,1,0,0,1,0,1,1},
                    { 1,1,0,1,1,0,0,1,0,1,0,2,0,0,0,1,0,2,1,1,0,1,1},
                    { 1,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,0,1,0,2,0,1,1},
                    { 1,1,0,2,0,1,1,1,0,1,0,2,0,0,0,1,0,0,0,1,0,1,1},
                    { 1,1,0,1,0,0,0,1,0,0,0,1,1,1,1,0,0,1,0,1,0,0,1},
                    { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab=laberinto;
        }
        return lab;
    }
}
