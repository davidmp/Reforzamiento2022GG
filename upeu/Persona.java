package upeu;
/**
 * Persona
 */
public class Persona {
    String nombre;
    char genero;
    String ocupacion;

    Persona(){        
    }

    Persona(String nombre){
        this.nombre=nombre;
    }
    Persona(String nombre, char genero, String ocupacion){
        this.nombre=nombre;
        this.genero=genero;
        this.ocupacion=ocupacion;
    }

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

class Principal{
    public static void main(String[] args) {
        Persona myObj=new Persona("Dario",'M', "Ing. Civil");
        System.out.println(myObj.obtenerNombre());
        System.out.println(myObj.obtenerGenero());
        System.out.println(myObj.obtenerOcupacion());
        /* .out.println(myObj.nombre);
        myObj.modificarNombre("Raul");
        System.out.println(myObj.nombre);
        System.out.println(myObj.obtenerNombre());*/
    }
}

