package pe.edu.upeu.ferreteria;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.util.LeerTeclado;

public class MenuOpciones {
    LeerTeclado leerT=new LeerTeclado();

    public void menuPrincipal() {
        String msgOpciones="1=Crear Categoria\n2=Listar Categoria\n "
        +"3=Editar Categoria\n4=Eliminar Categoria ";

        int opcion=0; 
            do {
                switch (opcion) {
                    case 1:new CategoriaDao().crearCategoria(); break;
                    case 2: new CategoriaDao().listarCategoria(); break;
                    case 3: new CategoriaDao().modificarCategoria(); break;
                    case 4: new CategoriaDao().eliminarCategoria(); break;
                    default: break;
                }
                opcion=leerT.leer(0, msgOpciones);
            } while (opcion!=0);

    }

}
