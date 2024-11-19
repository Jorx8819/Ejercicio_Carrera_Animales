package codigo;                          // Este paquete organiza la clase dentro de una carpeta llamada "codigo".


public class Animal {                    // Clase Animal pública para que pueda ser utilizada desde cualquier parte del programa.

    // Atributos
    private String nombre;               // Atributo para almacenar el nombre del animal.
    private int distanciaRecorrida;      // Atributo para guardar la distancia total recorrida.


    // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;            // Asignamos el nombre del animal al atributo "nombre"
        this.distanciaRecorrida = 0;     // Iniciamos la distancia recorrida en 0 porque aún no ha corrido.
    }


    // Getters y Setters
    public String getNombre() {
        return nombre;                   // Devuelve el nombre del animal.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;            // Podemos cambiar el nombre del animal en un futuro.
    }

    public int getDistancia() {
        return distanciaRecorrida;       // Devolvemos la distancia total recorrida.
    }

    public void setDistancia(int distancia) {
        this.distanciaRecorrida = distancia; // Podemos ajustar manualmente la distancia recorrida.
    }

    // Metodo correr
    public void correr(int distancia) {
        this.distanciaRecorrida = this.distanciaRecorrida + distancia;   // Suma la distancia recorrida en cada turno a la total.
    }
}