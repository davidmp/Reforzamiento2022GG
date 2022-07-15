package pe.edu.upeu.dao;

import pe.edu.upeu.crud.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class CategoriaDao extends AppCrud{
    LeerTeclado leerT=new LeerTeclado();
    UtilsX util=new UtilsX();
    LeerArchivo leerA;
    CategoriaTO catTO;

    final static String TABLA_CATEGORIA="Categoria.txt";

    public void crearCategoria() {
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        catTO=new CategoriaTO();
        String idC=generarId(leerA, 0, "C", 1);
        catTO.setIdCat(idC);
        catTO.setNombreCat(leerT.leer("", "Ingres nombre Categoria"));
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        agregarContenido(leerA, catTO);
    }

    public void listarCategoria() {
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        Object[][] dataC=listarContenido(leerA);
        System.out.println("IdCat\tNombre Categoria");
        for (int i = 0; i < dataC.length; i++) {
            System.out.println(dataC[i][0]+"\t"+dataC[i][1]);
        }
    }

    public void modificarCategoria() {
        listarCategoria();
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        CategoriaTO ca=new CategoriaTO();
        String idC=leerT.leer("", "Ingrese Id Categoria a Modifica");
        ca.setNombreCat(leerT.leer("", "Ingrese nuevo nombre Categoria"));
        
        editarRegistro(leerA, 0, idC, ca);
    }


    public void eliminarCategoria() {
        leerA=new LeerArchivo(TABLA_CATEGORIA);
        String idC=leerT.leer("", "Ingrese Id Categoria a Eliminar");
        eliminarRegistros(leerA, 0, idC);
    }

}
