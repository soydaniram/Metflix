import java.util.ArrayList;
import java.util.List;

public class Contenido {
    private String nombre;
    private String genero;
    //Idioma Origen
    private String idiomaOrigen;
    private int añoLanzamiento;
  
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero () {
        return genero;
    }
    public void setGenero(String genero) { 
        this.genero = genero;
    }

    public String getIdiomaOrigen(){
        return idiomaOrigen;
    }
    public void setIdiomaOrigen(String idiomaOrigen) {
        this.idiomaOrigen = idiomaOrigen; 
    }
    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }
    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }


    public List<Actor> actores = new ArrayList<>();

}
