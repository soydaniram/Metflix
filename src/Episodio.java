public class Episodio {
  
    public Episodio(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public Episodio(int numero, String nombre, int duracion) {
        this(numero, nombre); 
        this.duracion = duracion;
    }
    private int numero;
    private String nombre;
    private int duracion; //en minutos
    private String director;
    private String sinopsis;

     // public int getNumero() {
    //    return numero;
    //}
    //public void setNumero(int numero) {
    //   this.numero = numero;
    //}
    //public String getNombre() {
    //  return nombre;
    //}
    //public void setNombre(String nombre){
    //  this.nombre = nombre; 
    //}
    //public int getDuracion() {
    //  return duracion;
   // }
    public void setDuracion(int duracion) {  
        this.duracion = duracion;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String Director) {
        this.director = director;
    }
    public String getSinopsis() {
        return sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void reproducir(){
        System.out.println("Reproduciendo episodio " + nombre);
    }

}
