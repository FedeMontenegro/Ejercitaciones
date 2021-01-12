package reproductor;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class Playlist {
    String nombre;
    ArrayList <Cancion> listaDeCanciones = new ArrayList();

    public Playlist() {
    }

    public Playlist(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaDeCanciones(Cancion cancion) {
        this.listaDeCanciones.add(cancion);
    }
    
    /**
     * Filtra las canciones según su nombre, nombre del artista, año de lanzamiento o género musical.
     * @param filtro: Es el parametro que deberá ingresar el usuario para filtrar las canciones.
     */
    public void Filtrar (String filtro){
        
        if (filtro.equalsIgnoreCase("nombre")) {
            
            String filtroNombre = JOptionPane.showInputDialog(null, "Inserte nombre de la canción:");
            
            for (int i = 0; i < listaDeCanciones.size(); i++) {
                if (filtroNombre.equals(listaDeCanciones.get(i).getNombre())) {
                    System.out.println(listaDeCanciones.get(i).InfoCancion());
                }
            }
        } else if (filtro.equalsIgnoreCase("artista")) {
            String filtrado = JOptionPane.showInputDialog(null, "Inserte nombre del artista:");
            
            for (int i = 0; i < listaDeCanciones.size(); i++) {
                if (filtrado.equals(listaDeCanciones.get(i).getArtista())) {
                    System.out.println(listaDeCanciones.get(i).InfoCancion());
                }
            }
        } else if (filtro.equalsIgnoreCase("año")) {
            String filtrado = JOptionPane.showInputDialog(null, "Inserte el año:");
            
            for (int i = 0; i < listaDeCanciones.size(); i++) {
                if (filtrado.equals(listaDeCanciones.get(i).getAño())) {
                    System.out.println(listaDeCanciones.get(i).InfoCancion());
                }
            }
        } else if (filtro.equalsIgnoreCase("genero")) {
            String filtrado = JOptionPane.showInputDialog(null, "Inserte el genero:");
            
            for (int i = 0; i < listaDeCanciones.size(); i++) {
                    if (filtrado.equalsIgnoreCase(listaDeCanciones.get(i).getGenero())) {
                        System.out.println(listaDeCanciones.get(i).InfoCancion());
                    }
                
            }
        }
    }
}
