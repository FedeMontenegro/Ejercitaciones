package reproductor;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fede
 */
public class Cancion {
    private int id;
    private String nombre;
    private String artista;
    private String año;
    private String genero;
    private ArrayList <String> ListadoDeGeneros = new ArrayList();

    public Cancion() {
    }

    public Cancion(int id, String nombre, String artista, String año, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.año = año;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
        this.ListadoDeGeneros.add(this.genero);
    }

    public ArrayList<String> getListadoDeGeneros() {
        return ListadoDeGeneros;
    }
    
    /**
     * 
     * @return Retorna todos los datos de cada canción.
     */
    public String InfoCancion(){
        String info = "Nombre: " + this.getNombre() + "\nArtista: " + this.getArtista() + "\nAño: " + this.getAño() + "\nGénero: " + this.getGenero() + "\n";
        return info;
    }
}
