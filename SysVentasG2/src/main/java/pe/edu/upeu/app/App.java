package pe.edu.upeu.app;

import pe.edu.upeu.dao.PersonaDao;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
       new PersonaDao().listarPersona();
       System.out.println("Elimando datos de una persona:");
       new PersonaDao().eliminarPersona();
       new PersonaDao().listarPersona();
    }
}
