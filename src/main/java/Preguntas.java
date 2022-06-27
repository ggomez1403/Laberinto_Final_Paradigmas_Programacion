// Se importa la libreria para obtener un número al azar
import java.util.Random;

// Clase para obtener las preguntas que aparecen en el laberinto
public class Preguntas{
    // Se crea la matriz para las preguntas del laberinto, con capacidad de 21 preguntas
    String[][] bancoPreguntas = new String[21][5];

    // Clase en donde se encuentran los métodos para obtener las preguntas
    public Preguntas(){
        bancoPreguntas[0][0] = "¿Cuál es el país más grande y el más pequeño del mundo?";
        bancoPreguntas[0][1] = "A. Estados Unidos y Malta";
        bancoPreguntas[0][2] = "B. China y Nauru";
        bancoPreguntas[0][3] = "C. Rusia y Vaticano";
        bancoPreguntas[0][4] = "C";

        bancoPreguntas[1][0] = "¿Cuál es el libro más vendido en el mundo después de la Biblia?";
        bancoPreguntas[1][1] = "A. El Señor de los Anillos";
        bancoPreguntas[1][2] = "B. Don Quijote de la Mancha";
        bancoPreguntas[1][3] = "C. Cien años de Soledad";
        bancoPreguntas[1][4] = "B";

        bancoPreguntas[2][0] = "¿Cuánto tiempo tarda la luz del Sol en llegar a la Tierra?";
        bancoPreguntas[2][1] = "A. 12 minutos";
        bancoPreguntas[2][2] = "B. 1 día";
        bancoPreguntas[2][3] = "C. 8 minutos";
        bancoPreguntas[2][4] = "C";

        bancoPreguntas[3][0] = "¿Cuál es la montaña más alta del continente americano?";
        bancoPreguntas[3][1] = "A. Aconcagua";
        bancoPreguntas[3][2] = "B. Monte Everest";
        bancoPreguntas[3][3] = "C. Monte Fuji";
        bancoPreguntas[3][4] = "A";

        bancoPreguntas[4][0] = "¿Cuál de estos países se extiende entre dos continentes?";
        bancoPreguntas[4][1] = "A. Filipinas";
        bancoPreguntas[4][2] = "B. Tanzania";
        bancoPreguntas[4][3] = "C. Rusia";
        bancoPreguntas[4][4] = "C";

        bancoPreguntas[5][0] = "¿Cuál fue el recurso utilizado inicialmente por el ser humano para explicar el origen de las cosas?";
        bancoPreguntas[5][1] = "A. La filosofía";
        bancoPreguntas[5][2] = "B. La mitología";
        bancoPreguntas[5][3] = "C. La astronomía";
        bancoPreguntas[5][4] = "B";

        bancoPreguntas[6][0] = "¿Cuál es el animal terrestre más grande en la actualidad?";
        bancoPreguntas[6][1] = "A. Elefante africano";
        bancoPreguntas[6][2] = "B. Ballena azul";
        bancoPreguntas[6][3] = "C. Tiburón blanco";
        bancoPreguntas[6][4] = "A";

        bancoPreguntas[7][0] = "¿Quién fue el primer hombre en pisar la Luna?";
        bancoPreguntas[7][1] = "A. Charles Conrad";
        bancoPreguntas[7][2] = "B. Yuri Gagarin";
        bancoPreguntas[7][3] = "C. Neil Armstrong";
        bancoPreguntas[7][4] = "C";

        bancoPreguntas[8][0] = "¿Cómo se llaman los vasos que transportan la sangre desde el corazón al resto del cuerpo?";
        bancoPreguntas[8][1] = "A. Venas";
        bancoPreguntas[8][2] = "B. Arterias";
        bancoPreguntas[8][3] = "C. Uréteres";
        bancoPreguntas[8][4] = "B";

        bancoPreguntas[9][0] = "¿Con qué países tiene frontera Ecuador?";
        bancoPreguntas[9][1] = "A. Con Brasil y Colombia";
        bancoPreguntas[9][2] = "B. Con Bolivia y Brasil";
        bancoPreguntas[9][3] = "C. Con Colombia y Perú";
        bancoPreguntas[9][4] = "C";

        bancoPreguntas[10][0] = "¿Cuál es el mayor archipiélago de la Tierra?";
        bancoPreguntas[10][1] = "A. Indonesia";
        bancoPreguntas[10][2] = "B. Maldivas";
        bancoPreguntas[10][3] = "C. Filipinas";
        bancoPreguntas[10][4] = "A";

        bancoPreguntas[11][0] = "¿Qué sustancia es absorbida por las plantas y expirada por los animales?";
        bancoPreguntas[11][1] = "A. Nitrato de sodio";
        bancoPreguntas[11][2] = "B. Oxígeno";
        bancoPreguntas[11][3] = "C. Dióxido de carbono";
        bancoPreguntas[11][4] = "C";

        bancoPreguntas[12][0] = "¿Cuál es el metal cuyo símbolo químico es Au?";
        bancoPreguntas[12][1] = "A. Oro";
        bancoPreguntas[12][2] = "B. Arsénico";
        bancoPreguntas[12][3] = "C. Aluminio";
        bancoPreguntas[12][4] = "A";

        bancoPreguntas[13][0] = "¿Quién pintó la bóveda de la capilla sixtina?";
        bancoPreguntas[13][1] = "A. Leonardo da Vinci";
        bancoPreguntas[13][2] = "B. Donatello";
        bancoPreguntas[13][3] = "C. Miguel Angel";
        bancoPreguntas[13][4] = "C";

        bancoPreguntas[14][0] = "¿Cuál de estos países tiene como idioma oficial el francés?";
        bancoPreguntas[14][1] = "A. Andorra";
        bancoPreguntas[14][2] = "B. Haití";
        bancoPreguntas[14][3] = "C. Suecia";
        bancoPreguntas[14][4] = "B";

        bancoPreguntas[15][0] = "¿Dónde se encuentra el gran colisionador de hadrones?";
        bancoPreguntas[15][1] = "A. Entre Italia y Alemania";
        bancoPreguntas[15][2] = "B. Entre EE.UU y Canadá";
        bancoPreguntas[15][3] = "C. Entre Francia y Suiza";
        bancoPreguntas[15][4] = "C";

        bancoPreguntas[16][0] = "¿Cuál es el único número primo par?";
        bancoPreguntas[16][1] = "A. 4";
        bancoPreguntas[16][2] = "B. 2";
        bancoPreguntas[16][3] = "C. 6";
        bancoPreguntas[16][4] = "B";

        bancoPreguntas[17][0] = "¿Cuántos litros de sangre tiene una persona adulta?";
        bancoPreguntas[17][1] = "A. Tiene 10 litros";
        bancoPreguntas[17][2] = "B. Tiene entre 4 y 6 litros";
        bancoPreguntas[17][3] = "C. Tiene entre 2 y 4 litros";
        bancoPreguntas[17][4] = "B";

        bancoPreguntas[18][0] = "¿Quién es el autor de la frase \"Pienso, luego existo\"?";
        bancoPreguntas[18][1] = "A. Sócrates";
        bancoPreguntas[18][2] = "B. Galileo Galilei";
        bancoPreguntas[18][3] = "C. Descartes";
        bancoPreguntas[18][4] = "C";

        bancoPreguntas[19][0] = "La sal común está formada por dos elementos, ¿cuáles son?";
        bancoPreguntas[19][1] = "A. Sodio y cloro";
        bancoPreguntas[19][2] = "B. Sodio y carbono";
        bancoPreguntas[19][3] = "C. Sodio y potasio";
        bancoPreguntas[19][4] = "A";

        bancoPreguntas[20][0] = "¿Cuántos jugadores por equipo participan en un partido de voleibol?";
        bancoPreguntas[20][1] = "A. 4 jugadores";
        bancoPreguntas[20][2] = "B. 6 jugadores";
        bancoPreguntas[20][3] = "C. 5 jugadores";
        bancoPreguntas[20][4] = "B";
    }

    // Método para seleccionar una pregunta al azar
    public int seleccionaPregunta(){
        // Se instancia un objeto de la clase Random
        Random random = new Random();
        // El número al azar escogido será el número de la pregunta a mostrar
        int indicePregunta = random.nextInt(20);
        return indicePregunta;
    }

    // Método que devuelve el texto de la pregunta para ser mostrado al usuario
    public String devuelvePregunta(int indice){
        return bancoPreguntas[indice][0];
    }

    // Método que devuelve la opción A para ser mostrada al usuario
    public String devuelveOpcionA(int indice){
        return bancoPreguntas[indice][1];
    }

    // Método que devuelve la opción B para ser mostrada al usuario
    public String devuelveOpcionB(int indice){
        return bancoPreguntas[indice][2];
    }

    // Método que devuelve la opción C para ser mostrada al usuario
    public String devuelveOpcionC(int indice){
        return bancoPreguntas[indice][3];
    }

    // Método que devuelve la respuesta correcta para ser comparada con la respuesta del usuario
    public String devuelveRespuesta(int indice){
        return bancoPreguntas[indice][4];
    }
}
