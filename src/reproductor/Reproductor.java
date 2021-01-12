package reproductor;

import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class Reproductor {

    public static void main(String[] args) {
        
        /**
         * Dada la clase Canción, donde cada canción posee los siguientes atributos:
         * ID
         * Nombre
         * Artista 
         * Año
         * Duración
         * Género (rock, pop, melódico, etc.)
         * Y la clase Playlist que posee como atributos un nombre y una lista de canciones.
         * Se desea agregar la funcionalidad que para una playlist, reciba un criterio dado de un filtro y 
         * retorne una lista con todos las canciones que cumplen con dicho criterio.
         */
        
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion();
        Cancion c3 = new Cancion();
        Cancion c4 = new Cancion();
        Cancion c5 = new Cancion();
        
        c1.setId(1);
        c1.setNombre("La nave del olvido");
        c1.setArtista("La Renga");
        c1.setAño("1991");
        c1.setGenero("Rock");
        
        c2.setId(2);
        c2.setNombre("Tu");
        c2.setArtista("La Mona");
        c2.setAño("1985");
        c2.setGenero("Cuarteto");
        
        c3.setId(3);
        c3.setNombre("Solo le pido a Dios");
        c3.setArtista("Abel Pintos");
        c3.setAño("1995");
        c3.setGenero("Folklore");
        
        c4.setId(4);
        c4.setNombre("Man in the box");
        c4.setArtista("Alice in Chains");
        c4.setAño("1990");
        c4.setGenero("Rock");
        
        c5.setId(5);
        c5.setNombre("Chu chu hua");
        c5.setArtista("Piñon Fijo");
        c5.setAño("1996");
        c5.setGenero("Infantil");
        
        Playlist p1 = new Playlist();
        p1.setListaDeCanciones(c1);
        p1.setListaDeCanciones(c2);
        p1.setListaDeCanciones(c3);
        p1.setListaDeCanciones(c4);
        p1.setListaDeCanciones(c5);
        
        String filtrado = (String) JOptionPane.showInputDialog(null, "Seleccione un filtro de búsqueda: ", "Filtro de búsqueda", JOptionPane.QUESTION_MESSAGE, null, new Object [] {"Nombre", "Artista", "Año", "Género"}, "Nombre");
        
        p1.Filtrar(filtrado);
        
    }    
    
}
