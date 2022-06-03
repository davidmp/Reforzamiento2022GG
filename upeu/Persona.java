package upeu;

/**
 * Persona
 */
public class Persona {
    String nombre;
    char genero;
    String ocupacion;

    public String obtenerNombre() {
        return nombre;
    }

    public char obtenerGenero() {
        return genero;
    }

    public String obtenerOcupacion() {
        return ocupacion;
    }

    public void modificarNombre(String nombre) {
        this.nombre=nombre;
    }

    public void modificarGenero(char genero) {
        this.genero=genero;
    }

    public void modificarOcupacion(String ocupacion) {
        this.ocupacion=ocupacion;
    }
    
}