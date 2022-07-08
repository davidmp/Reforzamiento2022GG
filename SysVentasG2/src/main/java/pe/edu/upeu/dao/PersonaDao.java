package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.PersonaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class PersonaDao extends AppCrud{
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    LeerArchivo leerA;
    PersonaTO pTO;
    final static String TABLA_PERSONA="Persona.txt";

    public void registrarPersona() {
        pTO=new PersonaTO();
        pTO.setDni(leerT.leer("", "Ingrese su DNI"));
        pTO.setNombre(leerT.leer("", "Ingrese nombre:"));
        pTO.setApellidos(leerT.leer("", "Ingrese apellidos"));
        pTO.setCelular(leerT.leer("","Ingrese su celular"));
        pTO.setCorreo(leerT.leer("", "Ingrese correo"));
        leerA=new LeerArchivo(TABLA_PERSONA);
        agregarContenido(leerA, pTO);
    }

    public void listarPersona() {
        leerA=new LeerArchivo(TABLA_PERSONA);
        Object[][] data=listarContenido(leerA);
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", 
        "DNI", "Nombre","Apellidos",
         "Celular", "Correo");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s%n",
            data[i][0], data[i][1],
            data[i][2], data[i][3],data[i][4]);
        }
    }

    public void editarPersona() {
        leerA=new LeerArchivo(TABLA_PERSONA);
        pTO=new PersonaTO();
        String dnix=leerT.leer("", "Busque con su DNI");
        pTO.setCelular(leerT.leer("","Ingrese nuevo celular"));
        pTO.setCorreo(leerT.leer("", "Ingrese su nuevo correo"));
        editarRegistro(leerA, 0, dnix, pTO);
    }

    public void eliminarPersona() {
        leerA=new LeerArchivo(TABLA_PERSONA);
        String dnix=leerT.leer("", "Busque con su DNI");
        eliminarRegistros(leerA, 0, dnix);
    }

}
